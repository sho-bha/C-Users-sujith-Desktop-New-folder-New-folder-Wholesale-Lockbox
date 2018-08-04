package BlueStone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginScript 
{
  public static void main(String[] args) throws InterruptedException
  {
	  
	// Step 1: Launch the fire fox driver
	String key = "webdriver.gecko.driver";
    String value = "./softwares/geckodriver.exe";
    System.setProperty(key,value);
    
    WebDriver driver = new FirefoxDriver();
    
    // step 2: enter url
    driver.get("https://www.bluestone.com/");
    
    Thread.sleep(3000);
    
    //step 3: click on login button
    driver.findElement(By.xpath("//span[.='Login']")).click();
    
    //step 4: verify the login page
    //driver.getTitle();
    
    //step 5: enter email id
    driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("shob.shobha@gmail.com");
    
    //step 6: enter password
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome@123");
    
    //step 6: click on login button
    driver.findElement(By.xpath("(//input[@name='SubmitLogin'])[1]")).click();
    
    Thread.sleep(3000);
    
    
    //step 7: click on myaccount
    
    driver.findElement(By.xpath("(//span[.='Sho'])[1]")).click();
    
    //Actions ac = new Actions(driver);
    
    //ac.moveToElement(ele).perform();
    //step8: click on log off
    driver.findElement(By.xpath("//span[.='Sign Out']")).click();
    
    //verify login page 
    //Assert
    
}
}