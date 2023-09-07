package OrangeHRM;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetails extends Base {

	keyBoardAction key=new keyBoardAction();
	public ContactDetails(WebDriver driver) {
		super(driver);
	}
	
	//contact details
	@FindBy(linkText= "Contact Details")
	 WebElement contact;
	
	//Street1
	@FindBy(xpath= "//label[contains(text(),'Street 1')]//parent::div//parent::div//input")
	 WebElement street1;
	
	//Street2
	@FindBy(xpath= "//label[contains(text(),'Street 2')]//parent::div//parent::div//input")
	 WebElement street2;
	
	//city
	@FindBy(xpath= "//label[contains(text(),'City')]//parent::div//parent::div//input")
	 WebElement city;
	
	//state
	@FindBy(xpath = "//label[contains(text(),'State/Province')]//parent::div//parent::div//input")
	 WebElement state;
	
	//zip code
	@FindBy(xpath = "//label[contains(text(),'Zip/Postal Code')]//parent::div//parent::div//input")
	 WebElement code;
	
	//country
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	 WebElement country;
	
	//home
	@FindBy(xpath = "//label[contains(text(),'Home')]//parent::div//parent::div//input")
	 WebElement home;
	
	 //mobile
	@FindBy(xpath = "//label[contains(text(),'Mobile')]//parent::div//parent::div//input")
	 WebElement mobile;
	
	
	//Action Methods
	public void Contactdetail() {
		contact.click();	
	}
	public void Street1(String stret1) throws AWTException, InterruptedException {
		street1.click();
		//keyBoardAction key=new keyBoardAction();
		key.DeleteText();
		street1.sendKeys(stret1);
	}
	
	public void Street2(String Stret2) throws AWTException, InterruptedException {
		street2.click();
		key.DeleteText();
		street2.sendKeys(Stret2);
	}
	
	public void City(String cty) throws AWTException, InterruptedException {
		city.click();
		key.DeleteText();
		city.sendKeys(cty);
	}
	
	public void State(String stat) throws AWTException, InterruptedException {
		state.click();
		key.DeleteText();
		state.sendKeys(stat);
	}
	
	public void ZipCode(String zip) throws AWTException, InterruptedException {
		code.click();
		key.DeleteText();
		code.sendKeys(zip);
	}
	public void Country() throws AWTException, InterruptedException {
		country.click();
		key.CountryValue();	
	}
	public void Home(String hom) throws AWTException, InterruptedException {
		home.click();
		key.DeleteText();
		home.sendKeys(hom);
	}
	public void Mobile(String mob) throws AWTException, InterruptedException {
		mobile.click();
		key.DeleteText();
		mobile.sendKeys(mob);
	}
	
	
	
	
}

    
