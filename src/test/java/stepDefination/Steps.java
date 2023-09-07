package stepDefination;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login_Page;
import pom.homePage;
import pom.myAccount_Page;
import utilities_.Date_Reader;
	

public class Steps  {
	

	WebDriver driver;
	homePage hp;
	Login_Page lp;
	myAccount_Page macc;
	public Logger logger; //for logging
	 public ResourceBundle rb; // for reading properties file
	 public String br; //to store browser name	
	 
	 List<HashMap<String, String>> datamap; //Data driven

    
	 
	 @Before
		public void setup() // Junit hook - executes once before starting
		{
			// for logging
			 logger= LogManager.getLogger(this.getClass());
			// Reading config.properties (for browser)
				rb=ResourceBundle.getBundle("config");
			 br=rb.getString("browser");


			
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
			    driver.quit();
			}	
	   
	   
	@Given("User Launch the browser")
	public void user_launch_the_browser() {
		 if(br.equals("chrome"))
	        {
	           driver=new ChromeDriver();
	        }
	        else if (br.equals("firefox")) {
	            driver = new FirefoxDriver();	
	        }
	        else if (br.equals("edge")) {
	            driver = new EdgeDriver();
	        }

		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Open URL {string}")
	public void open_url(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		hp = new homePage(driver);
		hp.clickLogin();
		logger.info("Clicked on register button");

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String passward) {
		lp = new Login_Page(driver);
		lp.setEmail(email);
		logger.info("Provided email id");
		lp.setPassword(passward);
		logger.info("Provided passward ");

	}

	@When("User is click on Remember passward check box")
	public void user_is_click_on_remember_passward_check_box() {
		lp.clickrememberpassward();
		logger.info("Clicked on remember passward check box");

	}

	@When("Click on Login button")
	public void click_on_login_button() {
		lp.clickLogin();
		logger.info("Clicker on login button");

	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
		macc = new myAccount_Page(driver);
		boolean targetpage = macc.isMyAccountPageExists();

		if (targetpage) {
			logger.info("Login Success ");
			Assert.assertTrue(true);
		} else {
			logger.error("Login Failed ");
			Assert.assertTrue(false);
		}
		//	driver.close();

	}
	
	
//	//----------------------------Data Driven Test Method----------------------
	@Then("check User navigates to MyAccount Page by passing Email and Password with excel row {string}")
	public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_row(String rows) {
		
		datamap=Date_Reader.data(System.getProperty("user.dir")+".\\test_Data\\ECommarceLoginData.xlsx", "Sheet1");

        int index=Integer.parseInt(rows)-1;
        String email= datamap.get(index).get("username");
        String pwd= datamap.get(index).get("password");
        String exp_res= datamap.get(index).get("res");

        lp=new Login_Page(driver);	
        lp.setEmail(email);
        lp.setPassword(pwd);

        lp.clickLogin();
        try
        {
            boolean targetpage=macc.isMyAccountPageExists();

            if(exp_res.equals("Valid"))
            {
                if(targetpage==true)
                {
                    myAccount_Page myaccpage=new myAccount_Page(driver);
                    myaccpage.clickLogout();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if(exp_res.equals("Invalid"))
            {
                if(targetpage==true)
                {
                    macc.clickLogout();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }


        }
        catch(Exception e)
        {

            Assert.assertTrue(false);
        }
//        driver.close();
    }

    //*******   Account Registration Methods    **************

   

}
