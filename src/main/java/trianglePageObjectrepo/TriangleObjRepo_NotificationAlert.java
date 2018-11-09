package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;
import io.appium.java_client.android.AndroidDriver;



public class TriangleObjRepo_NotificationAlert extends DriverProvider {
	//AndroidDriver driver ;
	UtilityMethod propdata =new UtilityMethod();
	
	public boolean Notification_Allow()
	{
		WebElement Notification_Allow_btn=null;
		
		try {
			
			Notification_Allow_btn = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Notification_btn_Allow", Constants.TRIANGLE_NOTIFICATIONALERTOBJREPO)));
			Notification_Allow_btn.click();
			return true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	public void Notification_DontAllow()
	{
		WebElement Notification_DontAllow_btn=null;
		
		try {
			
			Notification_DontAllow_btn = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Notification_btn_DontAllow", Constants.TRIANGLE_NOTIFICATIONALERTOBJREPO)));
			Notification_DontAllow_btn.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
