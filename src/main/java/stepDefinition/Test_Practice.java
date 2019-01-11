package stepDefinition;

import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test_Practice extends TestRunner {
	
	
	
	
	@Given("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		test.log(LogStatus.PASS, "login page");
	   
	}
	
	@When("^user enters credential$")
	public void user_enters_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "enters credential");
	}
	
	@Then("^user logged in$")
	public void user_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "loggedIn");
	}
	////////////////////////////////////////////////////
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "first step");
		System.out.println("this is the first step");
	}
	
	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "second step");
		System.out.println("this is the second step");
		TestRunner.elogin = false;
		
			Assert.assertEquals(true, TestRunner.elogin);
		
		 
	}
	
	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "third step");
		System.out.println("this is the third step");
	}
	///////////////////////////////////////////////////////
	@Given("^this is the four step$")
	public void this_is_the_four_step() throws Throwable {
		Assert.assertEquals(true, TestRunner.elogin);
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "first step");
		System.out.println("this is the four step");
	}
	
	@When("^this is the five step$")
	public void this_is_the_five_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "second step");
		System.out.println("this is the five step");
	}
	
	@Then("^this is the six step$")
	public void this_is_the_six_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "third step");
		System.out.println("this is the six step");
	}
	///////////////////////////////////////////////////////////
	@Given("^this is the seven step$")
	public void this_is_the_seven_step() throws Throwable {
		Assert.assertEquals(true, TestRunner.elogin);
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "first step");
		System.out.println("this is the seven step");
	}
	
	@When("^this is the eight step$")
	public void this_is_the_eight_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "second step");
		System.out.println("this is the eight step");
	}
	
	@Then("^this is the nine step$")
	public void this_is_the_nine_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "third step");
		System.out.println("this is the nine step");
	}


}
