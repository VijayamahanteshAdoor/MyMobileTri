package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;

public class TriangleObjRepo_MessagesPage extends DriverProvider{
	UtilityMethod propdata =new UtilityMethod();
	
	public String getMessagesTabTitle()
	{
		WebElement Messages_title_txt;
		String Messages_title = null;
		try{
			Messages_title_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Messages_txt_Title", Constants.TRIANGLE_MESSAGESOBJREPO)));
			Messages_title=Messages_title_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Messages_title;
	}
	public String getMessagesinboxEmptytxt()
	{
		WebElement Messages_inboxempty_txt;
		String Offers_inboxempty_text = null;
		try{
			
			Messages_inboxempty_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Messages_inboxtxt_empty_list", Constants.TRIANGLE_MESSAGESOBJREPO)));
			Offers_inboxempty_text=Messages_inboxempty_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Offers_inboxempty_text;
	}

}
