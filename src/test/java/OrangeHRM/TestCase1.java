package OrangeHRM;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
	 WebDriver driver;
	
	
//	@BeforeClass
//	public void LunchBrowser() {
//		WebDriver driver =new ChromeDriver();
//		 driver.get("https://opensource-demo.orangehrmlive.com");
//	     driver.manage().window().maximize();
//	        
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
//	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com");
	     driver.manage().window().maximize();
	        
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage log=new loginPage(driver);
		
		log.useranme("Admin");
		log.password("admin123");
		log.Login();
		
		homePage hp=new homePage(driver);
		hp.MyInfo();
		
		 ContactDetails cd=new ContactDetails(driver);
		 cd.Contactdetail();
		 cd.Street1("Gajanan nagar");
		 cd.Street2("MG Road");
		 cd.City("Mumbai");
		 cd.State("Maharashtra");
		 cd.ZipCode("423107");
		 cd.Country();
		 
		
	}

}
