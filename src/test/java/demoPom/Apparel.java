package demoPom;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Apparel {

	public static void main(String[] args) throws InterruptedException {
		
	

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Apparel & Shoes']")).click();

		driver.findElement(By.xpath("//select[@id='products-orderby']")).click();

		driver.findElement(By.xpath("//select[@id='products-orderby']")).sendKeys("Price:Low to High");

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)", "");

		driver.findElement(By.xpath("//li[@class='individual-page']")).click();

		// Add to cart

		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

		// Checkout

		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
	}
}