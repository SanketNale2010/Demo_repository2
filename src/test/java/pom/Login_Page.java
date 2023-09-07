package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BaseClass {
	
	public Login_Page(WebDriver driver) {
		super(driver);	
	}
	
	//Element
	
	@FindBy(xpath = "//input[@id='Email']")     //email text field
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='Password']")   //passward text field
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='RememberMe']")     //remember passward check box
	WebElement rememberchek;

	@FindBy(xpath  = "//button[normalize-space()='Log in']")     //login button
	WebElement btnLogin;

    
	
	//Action methods
	
	public void setEmail(String email) {                  //set email
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {                 //set passward
		txtPassword.sendKeys(pwd);
	}
	 public void clickrememberpassward() {               //check remember passward check box
		 rememberchek.click();
	}
	
	public void clickLogin() {                          //click login
		btnLogin.click();
	}
	
}
