package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

	
	public static WebDriver getDriver(String browserName)
	
	{
		if (browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe" );
			return new ChromeDriver();
		}
	    
	
		
		else if (browserName.equals("firefox"))
		{System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Driver\\geckodriver.exe" );
			return new FirefoxDriver();
	    }
		
		
		else if (browserName.equals("ie"))
		{System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Driver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
	    }
		
		else return null;
	
		
		
      }
}