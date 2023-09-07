package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration_Page extends BaseClass {
	public Registration_Page(WebDriver driver) {
		super(driver);
	}
	
	// Elements
	
	    @FindBy(xpath = "//input[@id='gender-male']")   //male radio button
	     WebElement maleradio;
	    
	    @FindBy(xpath = "//input[@id='gender-female']")  //female radio button
	    WebElement femaleradio;
	
		@FindBy(xpath  = "//input[@id='FirstName']")      //first name
		WebElement txtFirstname;

		@FindBy(xpath  = "//input[@id='LastName']")       //last name
		WebElement txtLasttname;

		@FindBy(xpath  = "//select[@name='DateOfBirthDay']")  //day in DOB
		WebElement txtDay;

		@FindBy(xpath  = "//select[@name='DateOfBirthMonth']")   //month in DOB
		WebElement txtMonth;

		@FindBy(xpath  = "//select[@name='DateOfBirthYear']")     //year in DOB
		WebElement txtYear;

		@FindBy(xpath  = "//input[@id='Email']")               //email
		WebElement txtEmail;

		@FindBy(xpath  = "//input[@id='Company']")      //company name
		WebElement txtcmpname;

		@FindBy(xpath = "//input[@id='Newsletter']")   //news letter check box
		WebElement chkNewsLetter;
		
		@FindBy(xpath = "//input[@id='Password']")  //passward
		WebElement txtPassward;
		
		@FindBy(xpath = "//input[@id='ConfirmPassword']")  //confirm Passward
		WebElement txtConfirmPassward;

		@FindBy(xpath = "//button[@id='register-button']")  //register button
		WebElement btnRegister;
		
		 
		
		
		
		//Action Method
		
		public void maleRadioBtn() {                 //male radio button  
			maleradio.click();
		}
		
		public void femaleRadioBtn() {           //female radio button
			femaleradio.click();
		}
		
		public void setFirstName(String fname) {     //first name
			txtFirstname.sendKeys(fname);
		}

		public void setLastName(String lname) {       //last name
			txtLasttname.sendKeys(lname);
		}

		public void dayInDoB() {                        //day in DOB
			Select day=new Select(txtDay);
			day.selectByVisibleText("26");
		}
		
		public void monthInDoB() {                       //month in DOB
			Select month=new Select(txtMonth);
	    	month.selectByVisibleText("June");
		}
		
		public void yearInDOB() {                         //year in DOB
			
			Select year=new Select(txtYear);
			year.selectByVisibleText("1998");			
		}

		public void setEmail(String email) {            //email
			txtEmail.sendKeys(email);
		}
		
		public void setCompanyName(String comName) {         //company name
			txtcmpname.sendKeys(comName);
		}
		
		public void newsLetterCheckBox() {                  //news letter check box
			chkNewsLetter.click();
		}

		public void setPassword(String pwd) {                 //passward
			txtPassward.sendKeys(pwd);
		}

		public void setConfirmPassword(String pwd) {           //confirm passward
			txtConfirmPassward.sendKeys(pwd);
		}

		public void clickRegister() {                          //register button
			btnRegister.click();
		}	
		
		
}

