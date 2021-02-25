package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Printed:User is on Login page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("Printed:User is on Login page");
	}

	@And("click on login button")
	public void click_on_login_button() { 
		System.out.println("Printed:User is on Login page");
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 System.out.println("Printed:User is on Login page");
	}


}
