package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;

public class TriangleObjRepo_Tabs extends DriverProvider {
	UtilityMethod propdata =new UtilityMethod();
	
	public void setTab_Accounts()
	{
	
		WebElement Tab_Accounts ;
		
		{
			try{
				Tab_Accounts=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Tab_Accounts", Constants.TRIANGLE_APPTABOBJREPO)));
				Tab_Accounts.click();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
	}
	
	public void setTab_Offers()
	{
	
		WebElement Tab_Offers ;
		
		{
			try{
				Tab_Offers=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Tab_Offers", Constants.TRIANGLE_APPTABOBJREPO)));
				Tab_Offers.click();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
	}
	
	public void setTab_Messages()
	{
	
		WebElement Tab_Messages ;
		
		{
			try{
				Tab_Messages=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Tab_Messages", Constants.TRIANGLE_APPTABOBJREPO)));
				Tab_Messages.click();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
	}

}
