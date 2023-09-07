package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccRegister_Page extends BaseClass {
	
	public SuccRegister_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='result']")   //registration is completed
	WebElement msgConfirmatiom;
	
	public boolean isRegisteredPageExists()   // Your Account Has Been Created! heading display status
	{
		try {
			return (msgConfirmatiom.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	}

