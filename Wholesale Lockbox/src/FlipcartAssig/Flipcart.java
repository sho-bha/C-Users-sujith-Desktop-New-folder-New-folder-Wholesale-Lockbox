package FlipcartAssig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException 
	{
		// Step 1: Launch the fire fox driver
		String key = "webdriver.gecko.driver";
	    String value = "./softwares/geckodriver.exe";
	    System.setProperty(key,value);
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    // step 2: enter url
	    driver.get("https://www.flipkart.com/");
	    
	    Thread.sleep(3000);
	    
	    //step 3: click on login button
	   //driver.findElement(By.xpath("//a[.='Login & Signup']")).click();
	    
	   // Thread.sleep(5000);
	    
	    //step 4: enter mobile number
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8884972711");
	    //driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("8884972711");
	    
	    //step 5: enter password
	    driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).click();
	    driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Welcome@123");
	    
	    //step 6: click on login
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    
	   // Thread.sleep(3000);
	    
	    //step 7: mouse over on men
	    
	    WebElement ele = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
	    
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(ele).perform();
	    
	    //step 8: click on ethnic wear
	    driver.findElement(By.xpath("//a[@title='Top wear']")).click();
	    
	    driver.findElement(By.xpath("//a[.='Ethnic Wear']")).click();
	    
	    Thread.sleep(3000);
	    
	    //step 9: select min and max price
	    
	    WebElement ele1 = driver.findElement(By.xpath("(//select)[1]"));
	    Select s = new Select(ele1);
	    s.selectByIndex(3);
	    
	    Thread.sleep(1000);
	    
	    WebElement ele2 = driver.findElement(By.xpath("(//select)[2]"));
	    
	    Select s1  = new Select(ele2);
        s1.selectByIndex(4);
	    
        Thread.sleep(1000);
        
        //step 10: check the checkbox for brand
        driver.findElement(By.xpath("(//div[@class='_1p7h2j'])[2]")).click();
        
        Thread.sleep(3000);
        
        //step 11: check the size check box
        driver.findElement(By.xpath("(//div[@class='_1p7h2j'])[16]")).click();
        
        //step 12: select color check box
        driver.findElement(By.xpath("(//div[@class='_1p7h2j'])[29]")).click();
        
        //step 13: click on one image
        driver.findElement(By.xpath("(//img)[3]")).click();
        
	}
}
