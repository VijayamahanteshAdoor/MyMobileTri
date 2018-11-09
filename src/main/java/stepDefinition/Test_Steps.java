package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		String exePath = "C:\\Users\\P7108625.NESSINBLR\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
		//driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    
	}
 
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
 
//	@When("^User enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
//		driver.findElement(By.id("log")).sendKeys(username); 	 
//	    driver.findElement(By.id("pwd")).sendKeys(password);
//	    driver.findElement(By.id("login")).click();
//	}
 
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {
 
		//Write the code to handle Data Table
		for (Credentials credentials : usercredentials) {			
			driver.findElement(By.id("log")).sendKeys(credentials.getUsername()); 
		    driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
		    driver.findElement(By.id("login")).click();
			}		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
 
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
 
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
		driver.quit();
	}
	
	public class Credentials {
		private String username;
		private String password;

		public String getUsername() {
	        return username;
	    }
		public String getPassword() {
	        return password;
	    }	
	}

}
