package stepDefinition;




import org.junit.Assert;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import commonutility.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trianglePageObjectrepo.TriangleObjRepo_AccountsPage;
import trianglePageObjectrepo.TriangleObjRepo_Tabs;


public class Triangle_AccountsPillarVerify extends TestRunner{

	TriangleObjRepo_Tabs tri_obj_repo_Tabs =new TriangleObjRepo_Tabs();
	TriangleObjRepo_AccountsPage tri_obj_repo_Accounts =new TriangleObjRepo_AccountsPage();
	//public static ExtentReports extent;
	//public static ExtentTest test;
	
	@Given("^App is in home pillar$")
	public void app_is_in_home() throws Throwable {
		Assert.assertEquals(true, TestRunner.elogin);
		System.out.println("Second Scenario Started");
		System.out.println("User is in Home tab");
		test.log(LogStatus.PASS, "App is in home");
	}

	
	@When("^Switch to Accounts tab$")
	public void switch_to_Accounts_tab() throws Throwable {
		tri_obj_repo_Tabs.setTab_Accounts();
		Log.info("Clicked on accounts tab");
		Thread.sleep(10000);
		System.out.println("User is in Accounts tab");
		test.log(LogStatus.PASS, "Switch to Accounts tab");
	}

	
	@Then("^Verify accounts title$")
	public void verify_accounts_title() throws Throwable {
		
		String aTitleAccounts=tri_obj_repo_Accounts.getAccountsTabTitle();
		String eTitleAccounts="Account";
		//try{
			
			Assert.assertEquals(aTitleAccounts, eTitleAccounts);
			Reporter.addStepLog("Accounts litle not matched");
			//test.log(LogStatus.PASS, "Accounts litle matched");					
		/*}catch(Error e){
			System.out.println(e.getMessage());
			System.out.println("Accounts litle not matched");
			Reporter.addStepLog("Accounts litle not matched");
			test.log(LogStatus.WARNING, "Accounts litle not matched");	
		}*/
		
		
	}

	
	@Then("^Verify card title$")
	public void verify_card_title() throws Throwable {
		tri_obj_repo_Accounts.getAccountsCardTitle();
		System.out.println("Card Title");
		String aCardTitle=tri_obj_repo_Accounts.getAccountsCardTitle();
		String eCardTitle="Triangle RewardsTM Card®";
		Assert.assertEquals(aCardTitle, eCardTitle);
		if(eCardTitle.equals(aCardTitle)){
			
			Reporter.addStepLog("Accounts title displaying as expected");
		}else{
			
			Reporter.addStepLog("Accounts title not displaying as expected");
			Assert.assertEquals(true, false);
		}
		
		//test.log(LogStatus.PASS, "Verify card title");
	}
	
	
	@Then("^Verify four digit Card number$")
	public void verify_four_digit_Card_number() throws Throwable {
		String aCardNumber=tri_obj_repo_Accounts.getAccountsCardNumber();
		String eCardNumber="4942";
		Assert.assertEquals(aCardNumber, eCardNumber);
		
		if(eCardNumber.equals(aCardNumber)){
			
			Reporter.addStepLog("Card number displaying as expected");
		}else{
			
			Reporter.addStepLog("Card number not displaying as expected");
			Assert.assertEquals(true, false);
		}
		
		//test.log(LogStatus.PASS, "Verify four digit Card number");
	}

	
	@Then("^Verify CT money balance$")
	public void verify_CT_money_balance() throws Throwable {
		tri_obj_repo_Accounts.getAccountsCTMoneyBalance();
		//test.log(LogStatus.PASS, "Verify CT money balance");
	}

	
	@Then("^Verify Recent Transactions header$")
	public void verify_Recent_Transactions_header() throws Throwable {
		String aRecent_Transaction=tri_obj_repo_Accounts.getAccountsloyaltyTnxHeader();
		String eRecent_transaction="Recent Transactions";
		Assert.assertEquals(aRecent_Transaction, eRecent_transaction);
		//test.log(LogStatus.PASS, "Verify Recent Transactions header");
	}
	
	
	@Then("^Verify Recent Transactions$")
	public void verify_Recent_Transactions() throws Throwable {
		String Accounts_LoyaltyTnxtxt = "Recent Transaction available";
		String aRecent_Transaction_Empty=tri_obj_repo_Accounts.getAccountsLoyaltyTnxEmptyTxt();
		String eRecent_Transaction_Empty="No Recent Transactions";
		try{
			Assert.assertEquals(aRecent_Transaction_Empty, eRecent_Transaction_Empty);
		}catch(Error e){
			System.out.println(e.getMessage());
			Reporter.addStepLog(Accounts_LoyaltyTnxtxt);
		}
		//test.log(LogStatus.PASS, "Verify Recent Transactions");
	}


}
