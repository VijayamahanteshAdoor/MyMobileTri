package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void beforeScenario()
	{
		/*String exePath = "C:\\Users\\P7108625.NESSINBLR\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");*/
		System.out.println("Before");
	}
	
	@After
	public void afterScenario()
	{
		//driver.quit();
		System.out.println("After");
	}
}
