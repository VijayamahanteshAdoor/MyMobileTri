package com.triangleScenarios;

import java.io.File;
import java.lang.reflect.Method;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import commonutility.Constants;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
		features = "Resources",
		glue={"stepDefinition"},
		tags={"~@FunctionalTest",
			  "~@FeatureTest",
			  "@HybrisVerification"},
		monochrome = true
		)
 
public class TestRunner extends AbstractTestNGCucumberTests{
	public static ExtentReports extent;
	public static ExtentTest test;
	
			   
	@BeforeSuite
	public void beforeSuite()
	{
		extent= new ExtentReports("C://Users//P7108625.NESSINBLR//workspace//TriangleAutomation//ExtentReport//TriangleAutomation.html",true);
		extent.loadConfig(new File("C://Users//P7108625.NESSINBLR//workspace//TriangleAutomation//Configs//extent-config.xml"));
		
	}
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		test=extent.startTest((this.getClass().getSimpleName()+"::"+method.getName()),method.getName());
		test.assignAuthor("vijay");
		test.assignCategory("Quick sanity");
		//test.log(LogStatus.PASS, "Test method");
		
	}
	
	
	
	@AfterClass()
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(Constants.REPORTCONFIG_PATH));
		Reporter.assignAuthor("Ness - Vijay");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows 64");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		//test.log(LogStatus.PASS, "after method");
		extent.endTest(test);
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		extent.flush();
		extent.close();
	}

}
