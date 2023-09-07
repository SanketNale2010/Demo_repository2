package practice1;

 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 



 

public class e{

   

     public static void main(String[]args) throws InterruptedException, AWTException {	

         // ChromeOptions ops  = new ChromeOptions();
//
         // ops.addArguments("--remote-allow-origins=*");

       // System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(	);

        // go to chrome
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.findElement(By.id("//input[@id='input']"));sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    //    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();    

        // go to admin


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"]")).click();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

 

    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();


    driver.findElement(By.xpath("(//div[text()=\"-- Select --\"])[1]")).click();
      Robot robot = new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
       // robot.keyPress(KeyEvent.VK_DOWN);

        // Employee name

        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Dominic Chase");


        driver.findElement(By.xpath("//div[text()=\"-- Select --\"]")).click();
        Robot robot1 = new Robot();
        Thread.sleep(1000);
        robot1.keyPress(KeyEvent.VK_DOWN);
       // robot1.keyPress(KeyEvent.VK_DOWN);

        // username
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("abdc@gmail.com");

        //password

        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Capgi@123");

        //comfirm password
         driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Capgi@123");





 




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
//    
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);

 

//        
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)", "");
    }
}