package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import commonutility.DriverProvider;
import cucumber.api.Scenario;
import cucumber.api.java.After;

import cucumber.api.java.Before;


public class Hooks_Steps extends DriverProvider {
	DriverProvider driverProvider= new DriverProvider();
	
	/*@Before
	public void beforeScenario()
	{
		System.out.println("before Scenario");
		driverProvider.launchApp();
	}*/
	
	@After
	public void afterScenario(Scenario scenario)
	{
		/*System.out.println("After Scenario");
		 if (scenario.isFailed()) {
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				try {
					//This takes a screenshot from the driver at save it to the specified location
					File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					//Building up the destination path for the screenshot to save
					//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
					File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
					
					//Copy taken screenshot from source location to destination location
					FileUtils.copyFile(sourcePath, destinationPath);   

					//This attach the specified screenshot to the test
					Reporter.addScreenCaptureFromPath(destinationPath.toString());
					
				} catch (IOException e) {
				} 
			}*/
		  //driver.quit();
		  //driver.close();
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try{
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//Building up the destination path for the screenshot to save
			//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
			File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
			
			//Copy taken screenshot from source location to destination location
			FileUtils.copyFile(sourcePath, destinationPath);   

			//This attach the specified screenshot to the test
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@Before("@Start")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
        driverProvider.launchApp();      
    }
	/*@After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");  
        
    }*/
	
	/*@Before("@Second")
	public void beforeSecond()
	{
		System.out.println("This will run only before the Second Scenario");
	}*/
	
	@After("@End")
	public void afterSecond() {
		System.out.println("This will run only after the end Scenario");
		driver.quit();
		//driver.close();
				
	}
	
	
	
}
