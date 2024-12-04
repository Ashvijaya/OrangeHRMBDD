package StepDefinations;

import Locator.addEmployeeLocator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchEmployeeStepDefination {

	addEmployeeLocator addemp = new addEmployeeLocator();

	@Given("^the user is on the dashboard page with valid login credentials username as (.*) and password as (.*)$")
	public void validUserLogin(String UserName, String Passowrd) {
		addemp.validUserLogin(UserName, Passowrd);
	}

	@When("^the user clicks on PIM option$")
	public void navigateToPIMPage() {
		addemp.navigateToPIMPage();
	}
}
