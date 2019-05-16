package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url"})
	public void setUp(String browser,String url)
	{
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D://softwares//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D://softwares//chromedriver.exe");
				driver = new ChromeDriver();
			}
			else 
				if(browser.equalsIgnoreCase("edge"))
				{
					System.setProperty("webdriver.edge.driver", "D://softwares//MicrosoftWebDriver.exe");
					driver = new EdgeDriver();
					
				}
		driver.get(url);
			
	}
	

}
