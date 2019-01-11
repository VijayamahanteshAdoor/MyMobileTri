package stepDefinition;


import org.junit.Assert;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.GherkinKeyword;
import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import commonutility.ExcelReadWrite;
import commonutility.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sourceforge.cobertura.reporting.Report;
import trianglePageObjectrepo.TriangleObjRepo_HomePage;
import trianglePageObjectrepo.TriangleObjRepo_NotificationAlert;
import trianglePageObjectrepo.TriangleObjRepo_SignInPage;
import trianglePageObjectrepo.TriangleObjRepo_TCPage;
import trianglePageObjectrepo.TriangleObjRepo_TourOnepage;

public class Triangle_HybrisLoginVerify extends TestRunner{
	//public static AndroidDriver driver ;
	//UtilityMethod propdata =new UtilityMethod();
	
	TriangleObjRepo_NotificationAlert tri_obj_repo_Notificaton=new TriangleObjRepo_NotificationAlert();
	TriangleObjRepo_TCPage tri_obj_repo_TC= new TriangleObjRepo_TCPage();
	TriangleObjRepo_TourOnepage tri_obj_repo_TourOnePage=new TriangleObjRepo_TourOnepage();
	TriangleObjRepo_SignInPage tri_obj_repo_SignInPage=new TriangleObjRepo_SignInPage();
	TriangleObjRepo_HomePage tri_obj_repo_Homepage= new TriangleObjRepo_HomePage();
	//ExtentReports extent;
	//ExtentTest logger;
	//public static ExtentReports extent;
	//public static ExtentTest test;
	
	@Given("^Open app$")
	public void Open_app() throws Throwable {
		
		System.out.println("hi this is start");
		
		test.log(LogStatus.PASS, "Open_app");
		
	}

	
	@When("^Navigate to sign in page$")
	public void Navigate_to_sign_in_page() throws Throwable {
		
		try {
			System.out.println("Scenario started");
			Log.startTestCase("SignInApp");
			if (tri_obj_repo_Notificaton.Notification_Allow())
			{
			
			tri_obj_repo_TC.TC_Accept();
			Log.info("TCAccepted");
			
			
			tri_obj_repo_TourOnePage.Tour_SignIn();
			Log.info("Clicked on SignIn in tour Screen");
			//test.log(LogStatus.PASS, "Navigate to sign in page");
			
			}
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	}

	
	@Then("^Enter username and Password$")
	public void Enter_username_and_Password() throws Throwable {
		
		tri_obj_repo_SignInPage.Enter_Emailaddress(ExcelReadWrite.readExcel("HybrisLogin", 2, 1));
		tri_obj_repo_SignInPage.Enter_Password(ExcelReadWrite.readExcel("HybrisLogin", 2, 2));
		//driver.hideKeyboard();
		Log.info("Entred Emailaddress and password");
		test.log(LogStatus.PASS, "Enter username and Password");
	   
	}

	
	@Then("^Click on SignIN button$")
	public void Click_on_SignIN_button() throws Throwable {
		
		tri_obj_repo_SignInPage.SignIn();
		//test.log(LogStatus.PASS, "Click on SignIN button");
	    
	}

	
	@Then("^Verify Hybris Login$")
	public void Verify_Hybris_Login() throws Throwable {
		
		String aTitlehome=tri_obj_repo_Homepage.getHomeTitle();
		//System.out.println("This title "+aTitlehome);
		String eTitlehome="Welcome!";
		if(eTitlehome.equals(aTitlehome)){
			TestRunner.elogin = true;
			Reporter.addStepLog("Home title is displaying as expected");
		}else{
			TestRunner.elogin = false;
			Reporter.addStepLog("Hybris not logged in successfully");
			Assert.assertEquals(true, TestRunner.elogin);
		}
		
		
		//try{
			Assert.assertEquals(aTitlehome, eTitlehome);
			//test.log(LogStatus.PASS, "home litle matched");
		/*}catch(Error e){
			System.out.println(e.getMessage());
			System.out.println("home litle not matched");
			Reporter.addStepLog("home litle not matched");
			test.log(LogStatus.WARNING, "home litle not matched");
		}*/
		
		//softAssert.assertEquals(aTitlehome, eTitlehome);
		
		Log.endTestCase("HybrisLoginVerify");
	   
	}

	
	@Then("^Display message Login Successfully$")
	public void Display_message_Login_Successfully() throws Throwable {
		
	    System.out.println("Verified SignIn by checking home page title");
	   // test.log(LogStatus.PASS, "Display message Login Successfully");
	}

	
	@Then("^Quit the App$")
	public void Quit_the_App() throws Throwable {
		
	    System.out.println("last steps");
	}



}
