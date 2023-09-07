package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class DEMO1 {    

          static WebDriver driver = new ChromeDriver();    

          public static void launchURL(String url) {

                driver.get(url);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

          public static void login(String username,String password){

                    driver.findElement(By.name("username")).sendKeys(username);
                    driver.findElement(By.name("password")).sendKeys(password);
                    driver.findElement(By.tagName("button")).click();
                    
                    
            }

     public static void myInfo() {
         driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
        }    

     public static void navigateToEmergencyContacts() {

            WebElement emergencyContactsLink = driver.findElement(By.linkText("Emergency Contacts"));
            emergencyContactsLink.click();

        }   
     
     public static void  contacts(String name,String relationship ,String telephone,String mobile,String wrkTelephone  ) throws InterruptedException {
    	 driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[1]")).click();
    	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(name);    
       driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[1]//div[2]//div[1]//div[2]//input[1]")).sendKeys(relationship);
       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys(telephone);
       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys(mobile);
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys(wrkTelephone); 
       driver.findElement(By.xpath("(//button[text()=\" Save \"])[1]")).click();
	}
     
     public static void attchment() throws InterruptedException, AWTException {
    	 driver.findElement(By.xpath("(//button[text()=\" Add \"])[2]")).click(); 
    	 driver.findElement(By.xpath("//button[text()=\" Add \"]")).click();
 		driver.findElement(By.xpath("//div[@class='oxd-file-button']")).click();
 		
 		StringSelection str=new StringSelection("C:\\Users\\sankesan\\Pictures\\Screenshots\\Screenshot (2).png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Thread.sleep(3000);
        Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("Welcome");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()=\" Save \"]")).click();
		
	}

     public static void clickAndWait(WebElement element, long milliseconds) throws InterruptedException {
         element.click();
         Thread.sleep(milliseconds);
     }

     public static void clickElementWithJavaScript(WebElement element) {
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", element);

     }    

     public static void uploadFileUsingRobot(String filePath) throws AWTException, InterruptedException {

         Robot rd1 = new Robot();

     }

      public static void main(String[] args) throws AWTException, InterruptedException {

          launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            login("Admin", "admin123");
            myInfo();
            navigateToEmergencyContacts();
            
            contacts("Hyma","Mother","123456","086497762","1234567890");
     
            attchment();

            WebElement saveButton = driver.findElement(By.xpath("(//button[text()=\" Save \"])[1]"));
            clickAndWait(saveButton, 3000);

            WebElement addButton = driver.findElement(By.xpath("(//button[text()=\" Add \"])[2]"));

            clickAndWait(addButton, 3000);

            WebElement fileButton = driver.findElement(By.className("oxd-file-button"));

            clickElementWithJavaScript(fileButton);

            Robot rd1 = new Robot();

            rd1.delay(2000); // Delays the robot's actions by 2000 milliseconds (2 seconds)

            String filePath = "C:\\Users\\HMANDAPA\\Downloads\\dependencies555 (1).txt";

            uploadFileUsingRobot(filePath);

            WebElement commentInput = driver.findElement(By.xpath("(//textarea[@placeholder='Type comment here'])[1]"));

            commentInput.sendKeys("HelloSelenium");

            WebElement saveLink = driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]"));

            clickAndWait(saveLink, 0);


}	
      
      }