package practice1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test23 {
    public static void main(String[] args) throws InterruptedException {
        

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        
        
        //pass the URL
        driver.get("https://demowebshop.tricentis.com/cart");
        
        driver.manage().window().maximize();
        
        
        //Register page
        
        //using implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //using class locator
        driver.findElement(By.className("ico-register")).click();
        
        //using name locator
        driver.findElement(By.name("Gender")).click();
        
        //ID locator
        driver.findElement(By.id("FirstName")).sendKeys("Sanket");
        
        //using relative xpath
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Nale");
        
        //using sendkeys method
        driver.findElement(By.id("Email")).sendKeys("sanketnale@gmail.com");
        
        
        //using CSS Selector locator
        driver.findElement(By.cssSelector("#Password")).sendKeys("sanket555");
        
        
        //using thread.sleep
        Thread.sleep(300);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sanket555");
        
        
        //using submit method
        driver.findElement(By.xpath("//input[@id='register-button']")).submit();
        
        
      //login page
        
        //Using LinkText locator
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sanketnale@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sanket555");
       //handle check box
        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        
        
        
        
    }
}
        
        
      
 
