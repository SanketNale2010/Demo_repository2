package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends Base {
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	//username
	@FindBy(name= "username")
	 WebElement usrname;

	//password
	@FindBy(name= "password")
	 WebElement passward;
 
	//login button
	@FindBy(tagName= "button")
	 WebElement logbtn;
	
	
	public void useranme(String username) {
		usrname.click();
		usrname.sendKeys(username);
	}
	
	public void password(String pass) {
		passward.click();
		passward.sendKeys(pass);
	}
	public void Login() {
		logbtn.click();	
	}
}
