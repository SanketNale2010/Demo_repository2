package ddd;





import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.time.Duration;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

 

public class OrangeHrm extends KeyboardActions {

    // Initialize the WebDriver Globally

    static WebDriver driver = new ChromeDriver();

    

    public static void launchURL() {

        //Launch URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Maximize the window
        driver.manage().window().maximize();
      //using implicitlyWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    

    public static void login(String username, String password) {
    	
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    public static void myinfo() {

        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
    }

    

    public static void details(String firstname, String middlename, String lastname, String nickname, String employeeid, String otherid, String  licensenumber, String expirydate, String ssn, String sinnumber,String dob,String militaryservice ) throws AWTException, InterruptedException {

    	DeleteData();
      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
       
      Thread.sleep(1000);
       
        DeleteData();
        driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(middlename);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(),'Nickname')]//parent::div//parent::div//input")).sendKeys(nickname);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(),'Employee Id')]//parent::div//parent::div//input")).sendKeys(employeeid);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(),'Other Id')]//parent::div//parent::div//input")).sendKeys(otherid);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(), 'License Number')]//parent::div//parent::div//input")).sendKeys(licensenumber);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(), 'License Expiry Date')]//parent::div//parent::div//parent::div//input")).sendKeys(expirydate);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(), 'SSN Number')]//parent::div//parent::div//input")).sendKeys(ssn);
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(), 'SIN Number')]//parent::div//parent::div//input")).sendKeys(sinnumber);

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        Thread.sleep(1000);
        KeyPressI();

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        Thread.sleep(1000);
        KeyPressM();

        driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]//parent::div//parent::div//input")).sendKeys(dob);

        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
        Thread.sleep(1000);
        DeleteData();

        driver.findElement(By.xpath("//label[contains(text(),'Military Service')]//parent::div//parent::div//input")).sendKeys(militaryservice);

        driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();

        driver.findElement(By.xpath("(//button[text()=\" Save \"])[1]")).click();

    }

    

    

    

    

 

    public static void main(String[] args) throws InterruptedException, AWTException {

        // TODO Auto-generated method stub

 

//        // Initialize the WebDriver

//        WebDriver driver = new ChromeDriver();

        

        launchURL();

        

//        //Launch URL

//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        

//        //Maximize the window

//        driver.manage().window().maximize();

 

//        //using implicitlyWait

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        

        login("Admin","admin123");

//        //Username field

//        driver.findElement(By.name("username")).sendKeys("Admin");

//        Thread.sleep(1000);

//        

//        //Password field

//        driver.findElement(By.name("password")).sendKeys("admin123");

//        Thread.sleep(1000);

//        

//        //Login

//        driver.findElement(By.xpath("//button[@type='submit']")).click();

//        Thread.sleep(1000);

        

//        //My Info

//        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();

//        Thread.sleep(1000);

        myinfo();

        

        details("sailaja", "reddy","papireddy","sailu","319173","124892","12141415","124236346","121415","1241637","2000-02-11","service");

        

//        //firstname

//        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));

//        firstname.click();

//        Thread.sleep(1000);

//        DeleteData();

//        firstname.sendKeys("sailaja");

//        Thread.sleep(1000);

//        

//        //Middlename

//        WebElement middlename = driver.findElement(By.xpath("//input[@name='middleName']"));

//        middlename.click();

//        Thread.sleep(1000);

//        DeleteData();

//        middlename.sendKeys("reddy");

//        Thread.sleep(1000);

//        

//        //lastname

//        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));

//        lastname.click();

//        Thread.sleep(1000);

//        DeleteData();

//        lastname.sendKeys("papireddy");

//        Thread.sleep(1000);

//        

//        //Nickname

//        WebElement nickname = driver.findElement(By.xpath("//label[contains(text(),'Nickname')]//parent::div//parent::div//input"));

//        nickname.click();

//        Thread.sleep(1000);

//        DeleteData();

//        nickname.sendKeys("sailu");

//        Thread.sleep(1000);

//        

//        //Employee Id

//        WebElement employeeid = driver.findElement(By.xpath("//label[contains(text(),'Employee Id')]//parent::div//parent::div//input"));

//        employeeid.click();

//        Thread.sleep(1000);

//        DeleteData();

//        employeeid.sendKeys("5425623");

//        Thread.sleep(1000);

//        

//        //Other Id

//        WebElement otherid = driver.findElement(By.xpath("//label[contains(text(),'Other Id')]//parent::div//parent::div//input"));

//        otherid.click();

//        Thread.sleep(1000);

//        DeleteData();

//        otherid.sendKeys("54256213");

//        Thread.sleep(1000);

//        

//        //License number

//        WebElement licensenumber = driver.findElement(By.xpath("//label[contains(text(), 'License Number')]//parent::div//parent::div//input"));

//        licensenumber.click();

//        Thread.sleep(1000);

//        DeleteData();

//        licensenumber.sendKeys("8971984124d61c1");

//        Thread.sleep(1000);

//        

//        //Driver's License expiry date

//        WebElement expirydate = driver.findElement(By.xpath("//label[contains(text(), 'License Expiry Date')]//parent::div//parent::div//parent::div//input"));

//        expirydate.click();

//        Thread.sleep(1000);

//        DeleteData();

//        expirydate.sendKeys("2000-09-12");

//        Thread.sleep(1000);

//

//        //SSN

//        WebElement ssn = driver.findElement(By.xpath("//label[contains(text(), 'SSN Number')]//parent::div//parent::div//input"));

//        ssn.click();

//        Thread.sleep(1000);

//        DeleteData();

//        ssn.sendKeys("200143921");

//        Thread.sleep(1000);

//        

//        //SIN

//        WebElement sinnumber = driver.findElement(By.xpath("//label[contains(text(), 'SIN Number')]//parent::div//parent::div//input"));

//        sinnumber.click();

//        Thread.sleep(1000);

//        DeleteData();

//        sinnumber.sendKeys("200143977");

//        Thread.sleep(1000);

//        

//        //Nationality

//        WebElement nationality = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));

//        nationality.click();

//        Thread.sleep(1000);

//        Robot robot = new Robot();

//        robot.keyPress(KeyEvent.VK_I);

//        robot.keyRelease(KeyEvent.VK_I);

//        Thread.sleep(1000);

//        robot.keyPress(KeyEvent.VK_I);

//        robot.keyRelease(KeyEvent.VK_I);

//        Thread.sleep(1000);

//        robot.keyPress(KeyEvent.VK_I);

//        robot.keyRelease(KeyEvent.VK_I);

//        

//        nationality.click();

//        Thread.sleep(2000);

//        

//        //Marital Status

//        WebElement maritalstatus = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));

//        maritalstatus.click();

//        Thread.sleep(1000);

//        robot.keyPress(KeyEvent.VK_M);

//        robot.keyRelease(KeyEvent.VK_M);

//        maritalstatus.click();

//        Thread.sleep(1000);

//        

//        //Date of birth

//        WebElement dob = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]//parent::div//parent::div//input"));

//        dob.click();

//        Thread.sleep(1000);

//        DeleteData();

//        dob.sendKeys("2020-03-11");

//        Thread.sleep(1000);

//        

//        //Gender

//        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();

//        Thread.sleep(1000);

//        

//        //Military service

//        WebElement militaryservice = driver.findElement(By.xpath("//label[contains(text(),'Military Service')]//parent::div//parent::div//input"));

//        militaryservice.click();

//        Thread.sleep(1000);

//        DeleteData();

//        militaryservice.sendKeys("service");

//        Thread.sleep(1000);

//        

//        //Smoker checkbox

//        driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();

//        Thread.sleep(2000);

//        

//        //Save 1

//        driver.findElement(By.xpath("(//button[text()=\" Save \"])[1]")).click();

//        Thread.sleep(1000);

        

        //driver.quit();

    }

 

}