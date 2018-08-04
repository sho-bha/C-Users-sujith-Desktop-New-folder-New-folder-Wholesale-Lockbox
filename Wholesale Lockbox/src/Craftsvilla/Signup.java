package Craftsvilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		

		// Step 1: Launch the fire fox driver
		String key = "webdriver.gecko.driver";
	    String value = "./softwares/geckodriver.exe";
	    System.setProperty(key,value);
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    // step 2: enter url
	    driver.get("https://www.craftsvilla.com/?gclid=EAIaIQobChMI4oK1krWu3AIVUI2PCh30WQbvEAAYASAAEgJNmvD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=brand_search&ef_id=W1I4PgAAAKHK8tNr:20180720193006:s");
	    
	    Thread.sleep(3000);
	    
        //step 3: click on sign in button
	    driver.findElement(By.xpath("//span[.='Sign In']")).click();
	    
	    //step 4: enter email id
	    driver.findElement(By.xpath("(//label[.='Enter Your Email'])[1]")).sendKeys("mahesh.boyz@gmail.com");
	    
	    //step 5: click on continue button
	    //driver.findElement(By.xpath("//div[.='CONTINUE']")).click();
	    
	    Thread.sleep(3000);
	    
	    //step 6: set a password
	    driver.findElement(By.xpath("//input[@id='set-password']")).sendKeys("Welcome@123");
	    
	    //step 7: click on register button
	    driver.findElement(By.xpath("//div[.='Register']")).click();
	    
	    
	}

}
