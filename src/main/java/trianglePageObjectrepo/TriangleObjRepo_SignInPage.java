package trianglePageObjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonutility.Constants;
import commonutility.DriverProvider;
import commonutility.UtilityMethod;



public class TriangleObjRepo_SignInPage extends DriverProvider{
	UtilityMethod propdata =new UtilityMethod();
	
	
	public void Enter_Emailaddress(String value)
	{
		WebElement Signin_Emailaddress_txtbx=null;
		
		try {
			
			Signin_Emailaddress_txtbx = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Signin_txtbx_EmailAddress", Constants.TRIANGLE_SIGNINOBJREPO)));
			Signin_Emailaddress_txtbx.clear();
			Signin_Emailaddress_txtbx.sendKeys(value);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void Enter_Password(String value)
	{
		WebElement Signin_Emailaddress_txtbx=null;
		
		try {
			
			Signin_Emailaddress_txtbx = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Signin_txtbx_Password", Constants.TRIANGLE_SIGNINOBJREPO)));
			Signin_Emailaddress_txtbx.clear();
			Signin_Emailaddress_txtbx.sendKeys(value);
			driver.hideKeyboard();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void SignIn()
	{
		WebElement Signin_btn=null;
		
		try {
			
			Signin_btn = driver.findElement(By.xpath(propdata.readDataFromPropertyFile("Signin_btn_SignIn", Constants.TRIANGLE_SIGNINOBJREPO)));
			Signin_btn.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
