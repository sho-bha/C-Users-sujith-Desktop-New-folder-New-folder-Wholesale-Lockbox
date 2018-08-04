package BlueStone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchBangles {

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

	    //step 7: click on search 
	    driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).click();
		
		//step 8: enter bangles and select 1st option
	    //List<webDriver> eles = driver.findElements(By.xpath())
	    
	    //step 9: click on search button
	    driver.findElement(By.xpath("//input[@name='submit_search']")).click();
	    
	    //step 10: verify the design counts
	    driver.findElement(By.xpath("//span[@class='total-designs']"));
	}

}
