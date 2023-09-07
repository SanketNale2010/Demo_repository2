package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario3 {
	
	public static void main(String[] args) throws InterruptedException {
		
			

		        // Initialize the WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage
		        driver.get("https://www.saucedemo.com/inventory.html");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.findElement(By.name("user-name")).sendKeys("standard_user");
		        driver.findElement(By.id("password")).sendKeys("secret_sauce");
		        driver.findElement(By.id("login-button")).click();
		        
		        // Click the "Add to cart" button on one or more products
		        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(),\"Add to cart\")]"));
		        int itemsToAdd = 2; // You can change this to add a specific number of items
		        for (int i = 0; i < itemsToAdd && i < addToCartButtons.size(); i++) {
		            addToCartButtons.get(i).click();
		        }
                
		        
		        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		        
	          // Verify the number of items in the cart
		        WebElement cartCountElement = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		        int itemCount = Integer.parseInt(cartCountElement.getText());

		        if (itemCount == itemsToAdd) {
		            System.out.println("Items added to the cart="+itemCount);
		        } else {
		            System.out.println("Failed to add items to the cart.");
		        }

		        // Try removing items from the cart 
		        List<WebElement> removeButtons = driver.findElements(By.xpath("//button[contains(text(),\"Remove\")]"));
		        int itemsToRemove = 1; // Change this to remove a specific number of items
		        for (int i = 0; i < itemsToRemove && i < removeButtons.size(); i++) {
		            removeButtons.get(i).click();
		        }
		        
                   Thread.sleep(2000);
		        // Verify the number of items in the cart after removal
		        itemCount = Integer.parseInt(cartCountElement.getText());

		        if (itemCount == (itemsToAdd - itemsToRemove)) {
		            System.out.println("Items in the cart="+itemCount);
		        } else {
		            System.out.println("Failed to remove items from the cart.");
		        }
//
//		        // Close the browser
//		        driver.quit();
		    
		

	}

}
