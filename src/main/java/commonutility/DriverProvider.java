package commonutility;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.listener.Reporter;

import io.appium.java_client.android.AndroidDriver;





public class DriverProvider {
	
	public static AndroidDriver driver ;
	UtilityMethod propdata =new UtilityMethod();
	
	//public static ExtentReports extent;
	//public static ExtentTest test;
	  public static final String USERNAME = "v.mantu409@gmail.com";
	  public static final String ACCESS_KEY = "inside409";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
		}
	
	
	public void launchApp() {
		
			try{
				
				
				
				
			DesiredCapabilities capabilities =new DesiredCapabilities();
			//capabilities.setCapability("BROWSER_NAME", "Android");
			//capabilities.setCapability("VERSION", "6.0.1");
			capabilities.setCapability("deviceName", propdata.readDataFromPropertyFile("Device_Name",Constants.TRIANGLE_CAPABILITIES));
			capabilities.setCapability("platformName", propdata.readDataFromPropertyFile("Platform_Name",Constants.TRIANGLE_CAPABILITIES));
			capabilities.setCapability("platformVersion", propdata.readDataFromPropertyFile("Platform_Version",Constants.TRIANGLE_CAPABILITIES));
			capabilities.setCapability("app", Constants.APP_PATH+Constants.APP_FILENAME);
			capabilities.setCapability("noReset",true);
	       // capabilities.setCapability("fullReset", true);
			capabilities.setCapability("appPackage", propdata.readDataFromPropertyFile("App_Package",Constants.TRIANGLE_CAPABILITIES));
			capabilities.setCapability("appActivity", propdata.readDataFromPropertyFile("App_Activity",Constants.TRIANGLE_CAPABILITIES));
			
			capabilities.setCapability("browserName", "");
		    capabilities.setCapability("deviceOrientation", "portrait");
		    capabilities.setCapability("appiumVersion", "1.6.4");
			
			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			driver = new AndroidDriver(new URL("https://v.mantu409@gmail.com:inside409@ondemand.saucelabs.com:80/wd/hub"),capabilities);
			//driver = new AndroidDriver(new URL(URL), capabilities);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//ExcelReadWrite excelrw = new ExcelReadWrite();
			ExcelReadWrite.setExcel(Constants.PATH_TESTDATA, Constants.FILE_TESTDATA);			
			DOMConfigurator.configure("log4j.xml");
			
						
			Thread.sleep(5000);
			//return driver;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			//return driver;
			
		}
	public static String capture(String screenShotName) throws IOException
    {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir").trim()+"\\ScreenShot_IRCTC\\"+screenShotName+".png";
        Log.info("Taking Screen Shot");
        File destination = new File(dest);
        Log.info("Cpying Screen Shot to Destination Path ...");
        FileUtils.copyFile(source, destination);
        Log.info("Screen Shot copied to destination " +destination);
        return dest;
    }
	
	public static void addScreenshotToStep(String screenName) throws IOException
	{
		String screenShot = capture(screenName);
		Reporter.addScreenCaptureFromPath(screenShot);
		Log.info("Captured "+screenName+ "Added to Extent report");
	}
	

	
}
