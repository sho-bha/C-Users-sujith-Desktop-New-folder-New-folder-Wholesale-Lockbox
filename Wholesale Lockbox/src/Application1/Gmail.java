package Application1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{

	public static void main(String[] args) 
	{
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sujith/Desktop/link13.html");
		
		//WebElement ele = driver.findElement(By.xpath("//input(@value='abc'"));
		//boolean b = ele.isDisplayed();
		//System.out.println(b);
		}

}
