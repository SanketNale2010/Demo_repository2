package Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class scenario2 {
    public static void main(String[] args) throws InterruptedException {
        

        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.saucedemo.com/inventory.html");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
         WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        
        Select option=new Select(dropdown);
        option.selectByVisibleText("Price (low to high)");
        
        Thread.sleep(3000);

        // Locate and collect the item prices
        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        // Create an ArrayList to store the prices
        ArrayList<String> pricesList = new ArrayList<String>();
        
        

        for (WebElement priceElement : priceElements) {
            pricesList.add(priceElement.getText().replace("$", ""));
           
        }
        
        
        ArrayList<Double> doubleList = new ArrayList<>();

        // Convert and add elements from the String ArrayList to the Double ArrayList
        for (String str : pricesList) {
            try {
                double value = Double.parseDouble(str);
                doubleList.add(value);
            } catch (NumberFormatException e) {
                // Handle invalid or non-numeric strings here
                System.err.println("Invalid numeric value: " + str);
            }
        }
       System.out.println(doubleList);
        // Check if the ArrayList is in ascending order
        ArrayList<Double> ascendingOrder = new ArrayList<>(doubleList);
        Collections.sort(ascendingOrder);
        
       System.out.println(ascendingOrder);

        if (doubleList.equals(ascendingOrder)) {
            System.out.println("The prices are in ascending order.");
        } else {
            System.out.println("The prices are not in ascending order.");
        }

        // Check if the ArrayList is in descending order
        ArrayList<String> descendingOrder = new ArrayList<>(pricesList);
        Collections.sort(descendingOrder, Collections.reverseOrder());

        if (doubleList.equals(descendingOrder)) {
            System.out.println("The prices are in descending order.");
        } else {
            System.out.println("The prices are not in descending order.");
        }

        // Close the browser
       // driver.quit();
    }
}
