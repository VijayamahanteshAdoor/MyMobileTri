package commonutility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;




public class ReusableMethod extends DriverProvider {
	
	 public  boolean isElementPresent(By by) {
		 boolean isPresent = true;
		 try {
		 driver.findElement(by);
		 } catch (NoSuchElementException e) {
		  isPresent = false;
		 }
		return isPresent;
		}

}
