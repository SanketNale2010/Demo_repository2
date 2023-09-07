package demoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BaseClass {
	
	public SearchResult(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
    WebElement compare;
	
	//action method
	
	public void addToCompare() {
  	  compare.click();
		
	}

}
