package stepDefinition;

import org.junit.Assert;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import commonutility.Log;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trianglePageObjectrepo.TriangleObjRepo_MessagesPage;
import trianglePageObjectrepo.TriangleObjRepo_OffersPage;
import trianglePageObjectrepo.TriangleObjRepo_Tabs;

public class Triangle_MessagePillarVerify extends TestRunner {
	TriangleObjRepo_Tabs tri_obj_repo_Tabs =new TriangleObjRepo_Tabs();
	TriangleObjRepo_MessagesPage tri_obj_repo_Messages=new TriangleObjRepo_MessagesPage();
	
	@Given("^App is in offers pillar$")
	public void app_is_in_Offers_pillar() throws Throwable  {
		Assert.assertEquals(true, TestRunner.elogin);
		System.out.println("fourth Scenario Started");
		System.out.println("User is in account tab");
		
		test.log(LogStatus.PASS, "App is in Offers pillar");
	}

	@When("^Swith to message pillar$")
	public void swith_to_message_pillar() throws Throwable {
		tri_obj_repo_Tabs.setTab_Messages();
		Log.info("Clicked on Messages tab");
		//Thread.sleep(10000);
		System.out.println("User is in Messages tab");
		test.log(LogStatus.PASS, "Switch to Messages tab");
	}

	@Then("^Verify message title$")
	public void verify_Message_title() throws Throwable {
		String aTitleMessages=tri_obj_repo_Messages.getMessagesTabTitle();
		String eTitleMessages="Messages";
		
		if(eTitleMessages.equals(aTitleMessages)){
			
			Reporter.addStepLog("Messages title is displaying as expected");
		}else{
			
			Reporter.addStepLog("Messages not logged in successfully");
			Assert.assertEquals(true, false);
		}
		
		/*try{
			
			Assert.assertEquals(aTitleMessages, eTitleMessages);
			//test.log(LogStatus.PASS, "Accounts litle matched");					
		}catch(Error e){
			System.out.println(e.getMessage());
			System.out.println("Messages litle not matched");
			Reporter.addStepLog("Messages litle not matched");
			test.log(LogStatus.WARNING, "Messages litle not matched");	
		}*/
	}

	@Then("^Verify inbox title$")
	public void verify_Inbox_title() throws Throwable {
	   
	}

	@Then("^Verify saved messages title$")
	public void verify_saved_Messages_title() throws Throwable {
		
	}

	@Then("^Verify inbox messages not available$")
	public void verify_Inbox_messages_available() throws Throwable {
		String eMessages_inboxEmpty_txt = "Looks like there are no new messages for you at the moment. Check back in a day or two (we promise we aren't ignoring you.)";
		String aMessages_inboxEmpty=tri_obj_repo_Messages.getMessagesinboxEmptytxt();
		//String eMessages_Empty="Looks like you do not have any offers at this time.";
		//try{
			Assert.assertEquals(eMessages_inboxEmpty_txt, aMessages_inboxEmpty);
			Reporter.addStepLog("No messages avaliable");
		/*}catch(Error e){
			System.out.println(e.getMessage());
			Reporter.addStepLog(Accounts_LoyaltyTnxtxt);
		}*/
	}

	@Then("^Verify saved messages available$")
	public void verify_Saved_Messages_available() throws Throwable {
	    
	}



}
