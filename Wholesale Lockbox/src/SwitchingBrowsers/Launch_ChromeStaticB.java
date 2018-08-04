package SwitchingBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_ChromeStaticB
{
    static 
    {
    	String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key,value);
    }
	public static void main(String[] args) 
	{
		
        ChromeDriver driver = new ChromeDriver();
        driver.close();
	}

}



