package Task;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sceanrio1 {
    public static void main(String[] args) throws InterruptedException {
        
//        // Initialize the WebDriver
//        WebDriver driver = new ChromeDriver();
//        
//        // Navigate to the webpage
//        driver.get("https://www.bostonscientific.com/en-IN/products/accessories/cellebrity.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//  
//        driver.manage().window().maximize();
//          Thread.sleep(1000);
//          
//          
//         
//          driver.findElement(By.xpath("//a[normalize-space()='Accept']")).click();
//          
//          //click on products
//          driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
//          
//          //click on Accessories
//          driver.findElement(By.xpath("(//a[text()=\"Accessories \"])[2]")).click();
//          
//          //click on Cytology Brushes
//        driver.findElement(By.xpath("//a[contains(text(),'Cytology Brushes')]")).click();
//        
//        // Find the breadcrumb element
//        WebElement breadcrumbElement = driver.findElement(By.xpath("//section[@class='row bsc-breadcrumb']"));
//
//        // Get the text from the breadcrumb element
//        String breadcrumbText = breadcrumbElement.getText();
//         System.out.println(breadcrumbText);
//       
//         // Specify the expected breadcrumb text
//        String expectedBreadcrumb = "Products Accessories Cellebrityᵀᴹ";
//
//        // Check if the breadcrumb contains the expected text in the same order
//        boolean breadcrumbContainsExpectedText = breadcrumbText.equals(expectedBreadcrumb);
//
//        // Print the result
//        if (breadcrumbContainsExpectedText) {
//            System.out.println("Breadcrumbs contain the expected text in the same order.");
//        } else {
//            System.out.println("Breadcrumbs do not contain the expected text in the same order.");
//        }

       // Close the browser
//       driver.quit();
	
    	
    	
    	
    
	
    	        
//    	        // Initialize Chrome WebDriver
    	        WebDriver driver = new ChromeDriver();

    	        // Navigate to the webpage
    	        driver.get("https://www.bostonscientific.com/en-IN/products/accessories/cellebrity.html");
//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
          Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Accept']")).click();

		// click on products
		driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();

		// click on Accessories
		driver.findElement(By.xpath("(//a[text()=\"Accessories \"])[2]")).click();

		// click on Cytology Brushes
		driver.findElement(By.xpath("//a[contains(text(),'Cytology Brushes')]")).click();
      
    	        

    	        // Define the expected breadcrumb texts
    	        String s1 = "Product";
    	        String s2 = "Accessories";
    	        String s3 = "Cellebrity";
    	        
    	        String expectedResult=s1.concat(s2).concat(s3);
    	        
    	        System.out.println(expectedResult);
   	   	        
    	     // Locate and collect the breadcrumb elements
    	        List<WebElement> breadcrumbs = driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[1]/section[1]/nav/a"));

    	        if (breadcrumbs.size() == 3) { // Ensure there are three breadcrumbs
    	            String breadcrumbText1 = breadcrumbs.get(0).getText();
    	            String breadcrumbText2 = breadcrumbs.get(1).getText();
    	            String breadcrumbText3 = breadcrumbs.get(2).getText();
                    
    	           String actualResult=breadcrumbText1.concat(breadcrumbText2).concat(breadcrumbText3);
    	           System.out.println(actualResult);
    	           
    	        // Verify the breadcrumb texts in the same order
    	            if (actualResult.equals(expectedResult)) {
    	            	 System.out.println("Breadcrumbs are in the correct order.");
    	            	 
    	            }
    	            else {
    	            	System.out.println("Breadcrumbs are not in the correct order.");
					}
    	        }


 	        // Close the browser
//    	        driver.quit();
    	    }
    	}

   
