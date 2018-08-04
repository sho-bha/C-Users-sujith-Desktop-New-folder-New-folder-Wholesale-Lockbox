package Craftsvilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangePassword {

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
			    driver.findElement(By.xpath("//div[.='CONTINUE']")).click();
			    
			    Thread.sleep(3000);
			    
			    //step 6: enter password
			    driver.findElement(By.xpath("")).sendKeys("Welcome@123");
			    
			    //step 7: click on account
			    driver.findElement(By.xpath("//span[.='Shob.shobha@gmail.com']")).click();
			    
			    //step 8: click on account settings
			    driver.findElement(By.xpath("//span[.='Shob.shobha@gmail.com']")).click();
			    
			    Thread.sleep(3000);
			    
			    //step 9: click on edit button
			    driver.findElement(By.xpath("//img[@id='changePersonalinfo']")).click();
			    
			    //step 10: click on change password
			    driver.findElement(By.xpath("//div[.='CHANGE PASSWORD']")).click();
			    
			    //step 11: enter old password 
			    driver.findElement(By.xpath("//input[@id='current_password']")).sendKeys("We@123");

                //step 12: enter new password
			    driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Wel@123");
			    
			    //step 13: confirm the password
			    driver.findElement(By.xpath("(//input[@id='confirmation'])[2]")).sendKeys("Wel@123");
			    
			    //step14: click on save button
			    driver.findElement(By.xpath("(//button[.='SAVE'])[3]")).click();
			    
	}
	

}
