package Maven.firstmaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
		public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\arpitdu\\eclipse-workspace\\firstmaven\\src\\test\\java\\Maven\\firstmaven\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
			if (browserName=="chrome")
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpitdu\\OneDrive - AMDOCS\\Eclipse setup\\chromedriver_win32\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.get("http://www.google.com");
			}
			
			else if (browserName=="internetexplorer")
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\arpitdu\\OneDrive - AMDOCS\\Eclipse setup\\geckodriver-v0.27.0-win64");
				
				driver = new InternetExplorerDriver();
				driver.get("http://www.google.com");
			}
			
			else if (browserName=="firefox")
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\arpitdu\\OneDrive - AMDOCS\\Eclipse setup\\geckodriver-v0.27.0-win64");
				
				driver = new FirefoxDriver();
				driver.get("http://www.google.com");
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
