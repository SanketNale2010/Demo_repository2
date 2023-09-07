package practice1;

 

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test21 {

 

   	

 

    public static void main(String[] args) throws InterruptedException {
    	
         WebDriver driver = new ChromeDriver();

 

         driver.manage().window().maximize();

 

         driver.get("https://demowebshop.tricentis.com/");

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         
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

         
         //login
         
         //Using LinkText locator
         driver.findElement(By.linkText("Log in")).click();
         driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sanketnale@gmail.com");
         driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sanket555");
        //handle check box
         driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
         
         driver.findElement(By.xpath("//input[@value='Log in']")).click();
         
           //Books
           driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();
           driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();

           //Computer
           driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']")).click();
         



           //Notebooks
            WebElement Notebooks=driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000232_notebooks_125.png']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;

 

            js.executeScript("arguments[0].scrollIntoView()",Notebooks );

 

            js.executeScript("arguments[0].click()", Notebooks);

            WebElement addcart=driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
            js.executeScript("arguments[0].scrollIntoView()",addcart );

 

            js.executeScript("arguments[0].click()", addcart);


           //Electronics
             driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Electronics']")).click();
           

               //cellphones

             WebElement cellphones=driver.findElement(By.xpath("//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']"));
             JavascriptExecutor js1 = (JavascriptExecutor) driver;

 

                js1.executeScript("arguments[0].scrollIntoView()",cellphones );

 

                js1.executeScript("arguments[0].click()",cellphones);

                WebElement addtocart=driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));

              js.executeScript("arguments[0].scrollIntoView()",addtocart );

 

              js.executeScript("arguments[0].click()", addtocart);


           //Apparel&Shoes
           driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Apparel & Shoes']")).click();
           driver.findElement(By.xpath("(//input[@value='Add to cart'])[5]")).click();


           //Digital Downloads
           driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Digital downloads']")).click();
           driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();


           //Jwellary
           driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Jewelry']")).click();
           driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();


           //Giftcard
          driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Gift Cards']")).click();
           driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
           //Thread.sleep(3000);

           //WebElement recipientNameInput = driver.findElement(By.id("giftcard_43_RecipientName")); 
          driver.findElement(By.xpath("//div[@class='giftcard'] //input[@name='giftcard_3.RecipientName']")).sendKeys("Shweta");


          //driver.findElement(By.xpath("//div[@class='giftcard'] //input[@name='giftcard_3.RecipientName']")).sendKeys("Shweta");
           //JavascriptExecutor js2 = (JavascriptExecutor) driver;

 

           //js2.executeScript("arguments[0].scrollIntoView()",name );

 

           //js2.executeScript("arguments[0].click()",name);
           //recipientNameInput.sendKeys("Shweta");



           driver.findElement(By.xpath("//input[@id='giftcard_3_SenderName']")).sendKeys("Priya");
           driver.findElement(By.xpath("//textarea[@id='giftcard_3_Message']")).sendKeys("Done");
           //driver.findElement(By.xpath("//input[@id='addtocart_3_EnteredQuantity']")).sendKeys("1");

           WebElement addtoacart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-3']"));
           js.executeScript("arguments[0].scrollIntoView()",addtoacart );

 

           js.executeScript("arguments[0].click()", addtoacart);





           //Shopping cart
           driver.findElement(By.xpath("(//span[normalize-space()='Shopping cart'])[1]")).click();


           //checkbox

         
                  List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[name='removefromcart']"));
                  
                  //System.out.println("total number of checkboxes;"+checkboxes.size());                  
                  for (int i = 0; i < checkboxes.size(); i++) {
          			checkboxes.get(i).click();
                  }


           //agree
                  driver.findElement(By.xpath("//input[@id='termsofservice']")).click();

           //checkout
                  driver.findElement(By.xpath("//button[@id='checkout']")).click();
}        
}