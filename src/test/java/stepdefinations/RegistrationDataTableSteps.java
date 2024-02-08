package stepdefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationDataTableSteps {
	
		@Given("User should be at registration page")
		public void user_should_be_at_registration_page() {
		   System.out.println("Given statement");
		}

		@When("User enters following data")
		public void user_enters_following_data(DataTable dataTable) {
		   
			List<List<String>> data = dataTable.asLists(String.class);
			
			for(List<String> list : data)
			{
				System.out.println(list);
			}
			
			List<String> list1 = data.get(0);
			
			String value = list1.get(1);
			System.out.println(value);
			
			
		}

		@When("User click on submit")
		public void user_click_on_submit() {
		   System.out.println("When statement for clicking on submit for data");
		}

		@Then("Details should get saved")
		public void details_should_get_saved() {
		    System.out.println("Then statement for submit data");
		}

	

}
