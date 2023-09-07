package demoPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BaseClass{
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	 
	 @FindBy(xpath="//input[@id='small-searchterms']")
		 WebElement searchBox;
	 
	 @FindBy(xpath = "//li[@class='ui-menu-item']")
	 List<WebElement> list;

      @FindBy(xpath = "//input[@value='Search']")
      WebElement searchBtn;
      
     
      
      
      //Action method
     
     public void ClickSearchBox() {
    	 searchBox.click();
	}
      public void setText(String text) {      //set Diamond test in search text box
    	  searchBox.sendKeys(text);
  	}
      
      public void selectText() {                  //set Diamond text in search text box
    	  for(int i=0;i<list.size();i++)
			{
				String text=list.get(i).getText();
				
				if(text.equals("Diamond Tennis Bracelet"))
				{
					list.get(i).click();;
					break;	
				}
				
			}	
  	}

      public void clicksearch() {                  //click on search button
    	  searchBtn.click();
  	}
      
      
      
      
      
      
      
}