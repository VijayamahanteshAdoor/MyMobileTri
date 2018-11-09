package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;



public class TriangleObjRepo_TourOnepage extends DriverProvider{
	
UtilityMethod propdata =new UtilityMethod();
	
	public void Tour_SignIn()
	{
		WebElement Tour_SignIn_btn=null;
		
		try {
			
			Tour_SignIn_btn = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Tour_btn_SignIn", Constants.TRIANGLE_TOUROBJREPO)));
			Tour_SignIn_btn.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
