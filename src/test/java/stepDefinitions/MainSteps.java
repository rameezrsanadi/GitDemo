package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Netbanking landing page");
	}
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application");
		System.out.println("User login into application");
		System.out.println("User login into application");
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed");
		System.out.println("Home Page is displayed");
		System.out.println("Home Page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
		System.out.println("Cards are displayed");
		System.out.println("Cards are displayed");
	}
}
