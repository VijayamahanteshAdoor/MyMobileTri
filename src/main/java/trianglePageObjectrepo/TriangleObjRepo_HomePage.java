package trianglePageObjectrepo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;






public class TriangleObjRepo_HomePage extends DriverProvider{
	UtilityMethod propdata =new UtilityMethod();
	
	
	public String getHomeTitle()
	{
		WebElement Home_title_txt=null;
		String Title=null;
		try {
			
			Home_title_txt = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Home_txt_Title", Constants.TRIANGLE_HOMEOBJREPO)));
			Title=Home_title_txt.getText();
			//System.out.println(Title);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Title;
	}
	
}
