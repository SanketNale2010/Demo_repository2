package Task;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class timeCard {
	public static void main(String[] args) {
//			WebDriver driver=null;
		//WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//NAVIGATE TO TALENT PAGE
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
		driver.get("https://talent.capgemini.com/in/");
		//driver.manage().window().maximize();
		
		//CLOSING THE SPLASH SCREEN
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='close_popin_btn']"))).click();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)","");
		
		String parentHandle=driver.getWindowHandle();
		System.out.println("parent window" +parentHandle);
		
		//OPEN TIMECARD APPLICATION
		//CLICK ON TIMECARD MODULE
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Time Card Application']"))).click();
		
		Set <String> handles=driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				//System.out.println("child window",+handle );
			
		
		//CLICK ON TIMECARD SUMMARY TAB
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ctl00_Menu1\"]/ul/li[1]/a"))).click();
		js.executeScript("window.scrollBy(0,500)","");
			
		
			}}
		//OPEN FIRST WEEK ATTENDANCE SHEET
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_grvTimecardSummary_ctl02_lnkTimevcardID']"))).click();
		
		//VERIFY EMPLOYEE ID AND NAME
		WebElement empid = driver.findElement(By.xpath("//span[text()='46301917']"));
		String EMPID = empid.getText();
		Assert.assertEquals(EMPID, "46301917");
		
		WebElement empname = driver.findElement(By.xpath("//span[text()='Shekhar Chothe, Saurabh']"));
		String EMPNAME = empname.getText();
		Assert.assertEquals(EMPNAME, "Shekhar Chothe, Saurabh");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.quit();
		
		
		
		
			
		}}
	