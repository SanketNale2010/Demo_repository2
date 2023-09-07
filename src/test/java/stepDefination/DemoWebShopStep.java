package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demoPom.HomePage;
import demoPom.SearchResult;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
	

public class DemoWebShopStep {
	public WebDriver driver;
	SearchResult sr;
	HomePage HP;
	
	@Given("Users launch the chrome browser")
	public void users_launch_the_chrome_browser() {
		driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String URL) {
	    driver.get(URL);
	    driver.manage().window().maximize();
	}

	@When("User clicks on Search store bar")
	public void user_clicks_on_search_store_bar() {
		 HP=new HomePage(driver);
		HP.ClickSearchBox();
	    
	}

	@When("User enter the text {string}")
	public void user_enter_the_text(String text) {
	   HP.setText(text);
	}

	@When("user click on Diamond Tennis Bracelet option")
	public void user_click_on_diamond_tennis_bracelet_option() {
	    HP.selectText();
	}

	@When("Click on Add to campare list")
	public void click_on_add_to_campare_list() {
	   sr=new SearchResult(driver);
		sr.addToCompare();
	}	
}
