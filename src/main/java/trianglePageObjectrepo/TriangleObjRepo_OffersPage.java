package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;

public class TriangleObjRepo_OffersPage extends DriverProvider {
	UtilityMethod propdata =new UtilityMethod();
	
	public String getOffersTabTitle()
	{
		WebElement Offers_title_txt;
		String Offers_title = null;
		try{
			Offers_title_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Offers_txt_Title", Constants.TRIANGLE_OFFERSOBJREPO)));
			Offers_title=Offers_title_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Offers_title;
	}

	public String getOffersEmptytxt()
	{
		WebElement Offers_empty_txt;
		String Offers_empty_text = null;
		try{
			
			Offers_empty_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Offers_txt_empty_list", Constants.TRIANGLE_OFFERSOBJREPO)));
			Offers_empty_text=Offers_empty_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Offers_empty_text;
	}
}
