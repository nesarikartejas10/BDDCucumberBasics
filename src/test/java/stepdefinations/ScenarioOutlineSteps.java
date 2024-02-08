package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at the signup page")
	public void user_is_at_the_signup_page() {
	  System.out.println("Given statement");
	}

	@When("User enters {string} in the form")
	public void user_enters_in_the_form(String string) {
	   System.out.println("User enters name as "+string);
	}

	@When("User enters {string} inside form")
	public void user_enters_inside_form(String string) {
		System.out.println("User enters age as "+string);
	}

	@When("User select {string} in form")
	public void user_select_in_form(String string) {
		 System.out.println("User select gender as "+string);
	}

	@When("User clicks on signup button")
	public void user_clicks_on_signup_button() {
	  System.out.println("User clicked signup button");
	}

	@Then("User gets successfully signup message")
	public void user_gets_successfully_signup_message() {
	    System.out.println("Successful signup");
	}

}
