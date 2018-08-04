package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		
p.load(new FileInputStream("./p2.properties"));
		
		String v = p.getProperty("city");
		
		System.out.println(v);
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(v);
	}
	

}
