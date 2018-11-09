package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;

public class TriangleObjRepo_AccountsPage extends DriverProvider{
	UtilityMethod propdata =new UtilityMethod();
	
	
	public String getAccountsTabTitle()
	{
		WebElement Accounts_title_txt;
		String Accounts_title = null;
		try{
			Accounts_title_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_Title", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_title=Accounts_title_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_title;
	}
	public String getAccountsCardTitle()
	{
		WebElement Accounts_Cardtitle_txt;
		String Accounts_Cardtitle = null;
		try{
			Accounts_Cardtitle_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_CardTitle", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_Cardtitle=Accounts_Cardtitle_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_Cardtitle;
	}
	public String getAccountsCardNumber()
	{
		WebElement Accounts_CardNumber_txt;
		String Accounts_CardNumber = null;
		try{
			Accounts_CardNumber_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_CardNumber", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_CardNumber=Accounts_CardNumber_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_CardNumber;
	}
	public String getAccountsCTMoneyBalance()
	{
		WebElement Accounts_CTMoney_Balance;
		String Accounts_CTMoneyBalance = null;
		try{
			Accounts_CTMoney_Balance=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_CTMoneyBalance", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_CTMoneyBalance=Accounts_CTMoney_Balance.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_CTMoneyBalance;
	}
	public String getAccountsloyaltyTnxHeader()
	{
		WebElement Accounts_loyaltyTnxHeader_txt;
		String Accounts_loyaltyTnxHeader = null;
		try{
			Accounts_loyaltyTnxHeader_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_loyalty_transaction_header_title", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_loyaltyTnxHeader=Accounts_loyaltyTnxHeader_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_loyaltyTnxHeader;
	}
	public String getAccountsLoyaltyTnxEmptyTxt()
	{
		WebElement Accounts_LoyaltyTnxEmpty_txt;
		String Accounts_LoyaltyTnxEmptytxt="";
		try{
			Accounts_LoyaltyTnxEmpty_txt=driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Accounts_txt_loyalty_transaction_empty_list", Constants.TRIANGLE_ACCOUNTSOBJREPO)));
			Accounts_LoyaltyTnxEmptytxt=Accounts_LoyaltyTnxEmpty_txt.getText();			
			
		}catch(Exception e){
		System.out.println(e.getMessage());
			
		}
		return Accounts_LoyaltyTnxEmptytxt;
	}

}
