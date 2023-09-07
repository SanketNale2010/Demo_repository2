//Register Feature

package stepDefination;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Registration_Page;
import pom.SuccRegister_Page;
import pom.homePage;

public class Steps1 {
    public WebDriver driver;
     homePage hp;
     Registration_Page rg;
     SuccRegister_Page succreg;
     Logger logger; //for logging
     
    
     
     @Before
 	public void setup() // Junit hook - executes once before starting
 	{
 		// for logging
 		 logger= LogManager.getLogger(this.getClass());
 		// Reading config.properties (for browser)
 			//rb=ResourceBundle.getBundle("config");
 		 //br=rb.getString("browser");

//         Logger logger = LogManager.getLogger(this.getClass()); 
// 		PropertyConfigurator.configure("path/to/log4j.properties");
 		
 	}	
     
     @After
	 public void captureScreenshotAfterScenario(Scenario scenario) {
		    if (scenario.isFailed()) {
		        try {
		            // Cast WebDriver to TakesScreenshot
		            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

		            // Capture the screenshot as a base64 encoded string
		            byte[] screenshotData = screenshotDriver.getScreenshotAs(OutputType.BYTES);

		            // Attach the screenshot to the Cucumber report
		            scenario.attach(screenshotData, "image/png", "Screenshot");
		        } catch (WebDriverException e) {
		            // Handle exception if unable to capture screenshot
		            System.err.println("Failed to capture screenshot: " + e.getMessage());
		        }
		    }
		    //driver.quit();
		}
     
	
	@Given("User Lunch The browser")
	public void user_lunch_the_browser() {
		 driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("open URL {string}")
	public void open_url(String URL) {
		 driver.get(URL);
		 driver.manage().window().maximize();
	}

	@When("User Click on Register")
	public void user_click_on_register() {
		 hp=new homePage(driver);
		hp.clickRegister();
		logger.info("Clicked on register button");
	}

	@When("User select the gender radio button")
	public void user_select_the_gender_radio_button() {
		rg=new Registration_Page(driver);
		rg.maleRadioBtn();
		logger.info("select the gender radio button");
	}

	@When("User enter First Name as {string} and Last name {string}")
	public void user_enter_first_name_as_and_last_name(String fname, String lname) {
	    rg.setFirstName(fname);
	    logger.info("Provided first name");
	    rg.setLastName(lname);
	    logger.info("Provided last name");
	}

	@When("User enter the Date of birth")
	public void user_enter_the_date_of_birth() {
	   rg.dayInDoB();
	   logger.info("Provided Day in DOB ");
	   rg.monthInDoB();
	   logger.info("Provided month in DOB ");
	   rg.yearInDOB();
	   logger.info("Provided year in DOB ");
	}

	@When("User enter the Email Id as {string}")
	public void user_enter_the_email_id_as(String emailID) {
	    rg.setEmail(emailID);
	    logger.info("Provided Email ");
	}

	@When("User enter the company name {string}")
	public void user_enter_the_company_name(String comName) {
	    rg.setCompanyName(comName);
	    logger.info("Provided company name ");
	}

	@When("User select the news letter check box")
	public void user_select_the_news_letter_check_box() {
	  rg.newsLetterCheckBox();
	  logger.info("check the news letter check box ");
	}

	@When("User enter the passward as {string} and confirm passward as {string}")
	public void user_enter_the_passward_as_and_confirm_passward_as(String pass, String conPass) {
	   rg.setPassword(pass);
	   logger.info("Provided passward ");
	   rg.setConfirmPassword(conPass);
	   logger.info("Provided Confirm passward ");
	}


	@When("click on Register button")
	public void click_on_register_button() {
	   rg.clickRegister();
	   logger.info("Clicked on register button");
	}

	@Then("User navigate to succsessfull registration page")
	public void user_navigate_to_succsessfull_registration_page() {
		 succreg=new SuccRegister_Page(driver);
		   boolean targetpage = succreg.isRegisteredPageExists();
		   

			if (targetpage) {
				 logger.info("Login Success ");
				Assert.assertTrue(true);
			} else {	
				logger.error("Login Failed ");
				Assert.assertTrue(false);
			}
			//driver.close();
	}	
}
