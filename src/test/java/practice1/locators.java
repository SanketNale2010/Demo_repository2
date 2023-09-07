package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class locators extends KeyBoardAction {
	 static WebDriver driver = new ChromeDriver();
	 
	 
	 public static void LunchURL() {
		 driver.get("https://opensource-demo.orangehrmlive.com");
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 
	public static void login(String username,String password){
		
		 driver.findElement(By.name("username")).sendKeys(username);
	        driver.findElement(By.name("password")).sendKeys(password);
	        driver.findElement(By.tagName("button")).click();
		
	}
	
	public static void Myinfo() {
	driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		
	}
	public static void contactDetails() throws InterruptedException {
		 driver.findElement(By.linkText("Contact Details")).click();
	        Thread.sleep(2000);
	}
	
	public static void Details(String street) throws InterruptedException, AWTException {
		 WebElement street1 = driver.findElement(By.xpath("//label[contains(text(),'Street 1')]//parent::div//parent::div//input"));
	        street1.click();
	        Thread.sleep(1000);
	        DeleteText();
			street1.sendKeys(street);
			Thread.sleep(1000);
				
		
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com");
//        driver.manage().window().maximize();
//        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LunchURL();
        login("Admin","admin123");
        Myinfo();
       contactDetails();
        
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.tagName("button")).click();
//        
        
//        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
//       
//        driver.findElement(By.linkText("Contact Details")).click();
//        Thread.sleep(2000);
       
       //Street 1
//        WebElement street1 = driver.findElement(By.xpath("//label[contains(text(),'Street 1')]//parent::div//parent::div//input"));
//        street1.click();
//        Thread.sleep(1000);
//        DeleteText();
//		street1.sendKeys("Gajanan nagar");
//		Thread.sleep(1000);
		
//		//Street 1
//		WebElement street2 = driver.findElement(By.xpath("//label[contains(text(),'Street 2')]//parent::div//parent::div//input"));
//		street2.click();
//		Thread.sleep(1000);
//       DeleteText();
//	   street2.sendKeys("MG road");
//		
//		//city
//		WebElement City = driver.findElement(By.xpath("//label[contains(text(),'City')]//parent::div//parent::div//input"));
//		City.click();
//		Thread.sleep(1000);
//		DeleteText();
//		City.sendKeys("Mumbai");
//		
//		//state
//		WebElement State=driver.findElement(By.xpath("//label[contains(text(),'State/Province')]//parent::div//parent::div//input"));
//		State.click();
//		Thread.sleep(1000);
//		DeleteText();
//		State.sendKeys("Maharashtra");
//		
//		//zip code
//		WebElement ZipCode=driver.findElement(By.xpath("//label[contains(text(),'Zip/Postal Code')]//parent::div//parent::div//input"));
//		ZipCode.click();
//		Thread.sleep(1000);
//		DeleteText();
//		ZipCode.sendKeys("423106");
//		
//		
//		 driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
//		 Thread.sleep(1000);
//		 Robot robot = new Robot();	
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		
//		Thread.sleep(1000);
//		
//		WebElement home = driver.findElement(By.xpath("//label[contains(text(),'Home')]//parent::div//parent::div//input"));
//		home.click();
//		Thread.sleep(1000);
//		DeleteText();
//		home.sendKeys("02423 245158");
//     
//		
//		WebElement mobile = driver.findElement(By.xpath("//label[contains(text(),'Mobile')]//parent::div//parent::div//input"));
//	    mobile.click();
//	    Thread.sleep(1000);
//	    DeleteText();
//		mobile.sendKeys("9822829929");
//		
//		WebElement work = driver.findElement(By.xpath("//label[contains(text(),'Work')]//parent::div//parent::div//input"));
//		work.click();
//		Thread.sleep(1000);
//		DeleteText();
//		work.sendKeys("7972454500");
//		
//		WebElement WorkEmail = driver.findElement(By.xpath("//label[text()=\"Work Email\"]//parent::div//parent::div//input"));
//		WorkEmail.click();
//		Thread.sleep(1000);
//		DeleteText();
//		WorkEmail.sendKeys("sanket2015@gmail.com");
//		
//		WebElement OtherEmail = driver.findElement(By.xpath("//label[text()=\"Other Email\"]//parent::div//parent::div//input"));
//		OtherEmail.click();
//		Thread.sleep(1000);
//		DeleteText();
//		OtherEmail.sendKeys("sanketnale20@gmail.com");
//		
//		
//		driver.findElement(By.xpath("(//button[text()=\" Save \"])[1]")).click();
//		
//				System.out.println("test is passed");
//				
//				Thread.sleep(3000);
//				
//				driver.findElement(By.xpath("//button[text()=\" Add \"]")).click();
//		driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
//		
//		StringSelection str=new StringSelection("C:\\Users\\sankesan\\Pictures\\Screenshots\\Screenshot (2).png");
//       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//       Thread.sleep(3000);
//       robot.keyPress(KeyEvent.VK_CONTROL);
//       robot.keyPress(KeyEvent.VK_V);
//       
//       robot.keyRelease(KeyEvent.VK_CONTROL);
//       robot.keyRelease(KeyEvent.VK_V);
//       
//       robot.keyPress(KeyEvent.VK_ENTER);
//       robot.keyRelease(KeyEvent.VK_ENTER);
//       
//       driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("Welcome");
//       driver.findElement(By.xpath("(//button[text()=\" Save \"])[2]")).click();
//       
//       
//       
	}

}
