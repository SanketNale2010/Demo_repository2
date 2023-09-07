package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends Base {
	
	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "//span[normalize-space()='My Info']")
	 WebElement myInfo;
	
	
	public void MyInfo() {
		
		myInfo.click();
	}
	

}
