package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccount_Page extends BaseClass {
	
	 public myAccount_Page(WebDriver driver) {
		super(driver);
	
	}
	 
	 @FindBy(xpath = "//a[@class='ico-account']")    //my account link 
	 WebElement mtAccountBtn;
	 
	 @FindBy(xpath = "//a[normalize-space()='Log out']")     //logout
	 WebElement lnkLogout;
	 
	 
	 
	 
	 //Action methods
	 public boolean isMyAccountPageExists()   // MyAccount link is present
		{
			try {
				return (mtAccountBtn.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
		}

		public void clickLogout() {      //click logout
			lnkLogout.click();

		}
}
