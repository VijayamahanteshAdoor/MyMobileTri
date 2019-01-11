package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;



public class TriangleObjRepo_TCPage extends DriverProvider{
UtilityMethod propdata =new UtilityMethod();
	
	public void TC_Accept()
	{
		WebElement TC_Accept_btn=null;
		
		try {
			
			TC_Accept_btn = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("TC_btn_Accept", Constants.TRIANGLE_TCINITIALOBJREPO)));
			TC_Accept_btn.click();
			
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		
	}

}
