package SwitchingBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Firefox 
{

	public static void main(String[] args) 
	{
		//chrome browser
		
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key,value);
        ChromeDriver driver = new ChromeDriver();
        driver.quit();
        
        //firefox driver
        String key1 = "webdriver.gecko.driver";
		String value1 = "./softwares/geckodriver.exe";
		System.setProperty(key1,value);
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.quit();
	}

}
