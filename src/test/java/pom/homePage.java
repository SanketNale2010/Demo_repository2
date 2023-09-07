package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends BaseClass {
	
	public homePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Element
	@FindBy(xpath = "//a[normalize-space()='Register']")  //register 
	WebElement linkregister;
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")  //login
     WebElement linkLogin;
	
	@FindBy(xpath = "//span[@class='wishlist-label']")   //watchList
	WebElement linkwatchlist;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")  //searchBox
	WebElement searchbox;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")  //search button
	WebElement searchbtn;
	
	@FindBy(xpath = "//span[@class='cart-label']")   //shopping cart
	WebElement shopcart;
	
	
	// Action Methods
		

		public void clickRegister() {     //for registration
			linkregister.click();
		}
		
		public void clickLogin()    // for login
		{
			linkLogin.click();
		}
		
		public void clickWatchList()   //For WatchList Product Test
		{
			linkwatchlist.click();;
		}
		
		public void searchBox( String pname)  //For Search Product Test
		{
			searchbox.sendKeys(pname);;
		}
		
		public void searchButton()  //For Search Product Test
		{
			searchbtn.click();
		}
		
		public void shopCart()  //For Shopping cart Product Test
		{
			shopcart.click();
		}
}
