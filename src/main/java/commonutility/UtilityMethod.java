package commonutility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;






public class UtilityMethod {
	
	//public AppiumDriver driver;
	
	public String readDataFromPropertyFile(String key, String propfile )
	{
		String value=null;
		try{
		File file =new File(propfile);
		FileInputStream fileinput = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileinput);
		value = properties.getProperty(key);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return value;
	}
	
	
	/*public boolean verifyElementPresent( WebElement ele)
	{
		boolean flag = false;
		
		try{
			
			WebDriverWait wait=new WebDriverWait(driver,3000);
			wait.until(ExpectedConditions.visibilityOf(ele));
			flag=true;
			Assert.assertTrue(flag);
			
		}catch(Exception e){
		System.out.println(e.getMessage());			
		}
		
		
		return flag;
	}*/

	/*public void Explicit_wait(WebElement ele){
		System.out.println("waitstart");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element =wait.until(ExpectedConditions.);
		
		System.out.println("waitend");
		
	}*/
	
	/*public void initApp(){
		try {
		DesiredCapabilities capabilities =new DesiredCapabilities();
		//capabilities.setCapability("BROWSER_NAME", "Android");
		//capabilities.setCapability("VERSION", "23");
		capabilities.setCapability("deviceName", "mydevice");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("noReset",true);
        capabilities.setCapability("fullReset", false);
		
		capabilities.setCapability("appPackage", "com.csam.ctfswallet");
		capabilities.setCapability("appActivity", "com.csam.ctfswallet.activity.SplashActivity");
		//capabilities.setCapability("appActivity", "com.csam.ctfswallet.activity.ReloadSignInActivity");
		//capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		//capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
		
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}*/
}
