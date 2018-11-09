package stepDefinition;

import com.relevantcodes.extentreports.LogStatus;
import com.triangleScenarios.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "first step");
	}
	//@Test
	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "second step");
	}
	//@Test
	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//test.log(Status.PASS, "third step");
	}



}
