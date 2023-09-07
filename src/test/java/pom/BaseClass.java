package pom;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	 WebDriver driver;
	 public Logger logger; //for logging
	 public ResourceBundle rb; // for reading properties file
	 public String br; //to store browser name
	 	
	 
	    
	   public BaseClass(WebDriver driver)
	     {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
	     }
	   
	   	
	   
	   	   
}

	
