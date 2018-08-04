package Puma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectShoe {

	public static void main(String[] args) throws InterruptedException {
		
		// Step 1: Launch the fire fox driver
		String key = "webdriver.gecko.driver";
	    String value = "./softwares/geckodriver.exe";
	    System.setProperty(key,value);
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    // step 2: enter url
	    driver.get("https://in.puma.com/");
	    
	    Thread.sleep(5000);
	    
	    //step 3: click on login button
	    driver.findElement(By.xpath("(//a[.='Sign In'])[2]")).click();
	    
	    //step 4: verify the login page
	    //driver.getTitle();
	    
	    //step 5: enter email id
	    driver.findElement(By.xpath("//input[@id='magestore-sociallogin-popup-email']")).sendKeys("shob.shobha@gmail.com");
	    
	    //step 6: enter password
	    driver.findElement(By.xpath("//input[@id='magestore-sociallogin-popup-pass']")).sendKeys("Welcome@123");
	    
	    //step 6: click on login button
	    driver.findElement(By.xpath("//button[@id='magestore-button-sociallogin']")).click();
	    
	    Thread.sleep(3000);
	    
	    //step 7: click on men
	    
	   WebElement ele = driver.findElement(By.xpath("(//a[@class='digimeg-nav-item'])[1]"));
	    
	    Actions ac = new Actions(driver);
	    
	    ac.moveToElement(ele).perform();
	    
	    //step8: click on shoes
	    //driver.findElement(By.xpath("(//a[.='Shoes'])[5]")).click();
	    
	    //step9: click on Running
	    driver.findElement(By.xpath("(//a[.='Running'])[6]")).click();
	    
	    Thread.sleep(3000);
	    
	    //step:10 select 3rd shoe
	    driver.findElement(By.xpath("(//div[@class='category-products']//img)[3]")).click();
	    
	    Thread.sleep(3000);
	    
	    //step11: click on select size
	    driver.findElement(By.xpath("//div[@class='product-size-click-btn']")).click();
	    
	    //step12: select size
	    driver.findElement(By.xpath("(//div[@class='product-size-div']//span)[1]")).click();
	    
	    //click on add cart
	    driver.findElement(By.xpath("//button[@class='button btn-cart']")).click();
	    
	    Thread.sleep(3000);
	    
	    //click on my account 
	    driver.findElement(By.xpath("(//a[.='My Account'])[1]")).click();
	    
	    //click on sign out
	    driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	  

	}

}
