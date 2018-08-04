package SwitchingBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox_Static {
	static 
	{
		String key = "webdriver.gecko.driver";
		String value = "./softwares/geckodriver.exe";
		System.setProperty(key,value);
	}


public static void main(String[] args) 
{
	
    FirefoxDriver driver = new FirefoxDriver();
    driver.close();
}

}