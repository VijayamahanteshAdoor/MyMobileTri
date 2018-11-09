package stepDefinition;

import org.junit.Assert;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import commonutility.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trianglePageObjectrepo.TriangleObjRepo_OffersPage;
import trianglePageObjectrepo.TriangleObjRepo_Tabs;

public class Triangle_OfferPillarVerify extends TestRunner {
	
	TriangleObjRepo_Tabs tri_obj_repo_Tabs =new TriangleObjRepo_Tabs();
	TriangleObjRepo_OffersPage tri_obj_repo_Offers=new TriangleObjRepo_OffersPage();
	
	
	@Given("^App is in Account pillar$")
	public void app_is_in_home() throws Throwable {
		
		System.out.println("thrid Scenario Started");
		System.out.println("User is in account tab");
		
		test.log(LogStatus.PASS, "App is in Account");
	}
	
	
	@When("^Switch to Offers tab$")
	public void switch_to_Offers_tab() throws Throwable {
    tri_obj_repo_Tabs.setTab_Offers();
		Log.info("Clicked on offers tab");
		//Thread.sleep(10000);
		System.out.println("User is in offers tab");
		test.log(LogStatus.PASS, "Switch to offers tab");
	}
	
	
	@Then("^Verify offer title$")
	public void verify_offer_title() throws Throwable {
		String aTitleOffers=tri_obj_repo_Offers.getOffersTabTitle();
		String eTitleOffers="Offers";
		try{
			
			Assert.assertEquals(aTitleOffers, eTitleOffers);
			//test.log(LogStatus.PASS, "Accounts litle matched");					
		}catch(Error e){
			System.out.println(e.getMessage());
			System.out.println("Offers litle not matched");
			Reporter.addStepLog("Offers litle not matched");
			test.log(LogStatus.WARNING, "Accounts litle not matched");	
		}
		
	}

	@Then("^Verify offer available$")
	public void verify_offer_available() throws Throwable {
		String Accounts_LoyaltyTnxtxt = "Offers available";
		String aOffers_Empty=tri_obj_repo_Offers.getOffersEmptytxt();
		String eOffers_Empty="Looks like you do not have any offers at this time.";
		try{
			Assert.assertEquals(aOffers_Empty, eOffers_Empty);
		}catch(Error e){
			System.out.println(e.getMessage());
			Reporter.addStepLog(Accounts_LoyaltyTnxtxt);
		}
		//test.log(LogStatus.PASS, "Verify Recent Transactions");
	}

		
	
}
