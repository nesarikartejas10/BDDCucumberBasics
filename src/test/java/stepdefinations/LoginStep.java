package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	@Given("User is at login page")
	public void preconditions()
	{
		System.out.println("User is on the login screen");
	}
	
	@When("User enters username")
	public void enterUsername()
	{
		System.out.println("Entering username");
	}
	
	@And("User enters password")
	public void enterPassword()
	{
		System.out.println("Entering password");
	}
	
	@And("User click on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicking on Login button");
	}
	
	@Then("User should redirect to the home page")
	public void validateResult()
	{
		System.out.println("Succefully redirect to home page");
	}
	

}
