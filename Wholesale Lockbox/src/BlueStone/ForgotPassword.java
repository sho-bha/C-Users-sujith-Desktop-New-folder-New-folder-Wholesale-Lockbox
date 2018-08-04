package BlueStone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {

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
	    //driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("shob.shobha@gmail.com");

	    Thread.sleep(3000);
	    
	    //step 6: click on forgot password
	    driver.findElement(By.xpath("//a[.='Forgot Password']")).click();
	    
	    //step 7: enter email id
	    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("shob.shobha@gmail.com");
	    
	    Thread.sleep(3000);
	    
	    //step8: click on submit button
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    
	    //step9: verify the success message
	    // xpath: //div[@class='success-container-inner'];
	    
	    //step10: close the pop up window
	    driver.findElement(By.xpath("//a[@title='Close']")).click();
	    
	   
	}

}
