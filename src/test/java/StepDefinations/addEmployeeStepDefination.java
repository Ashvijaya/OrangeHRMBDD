package StepDefinations;

import Locator.addEmployeeLocator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addEmployeeStepDefination {

	addEmployeeLocator addemp = new addEmployeeLocator();

	@Given("^the user is on the dashboard page with valid login credentials username as (.*) and password as (.*)$")
	public void validUserLogin(String UserName, String Passowrd) {
		addemp.validUserLogin(UserName, Passowrd);
	}

	@When("^the user clicks on PIM option$")
	public void navigateToPIMPage() {
		addemp.navigateToPIMPage();
	}
	@And("^the user clicks on Add Employee option$")
	public void clickAddEmployeeoption()
	{
		addemp.clickAddEmployeeoption();
	}

	@Then("I enters valid data in the mandatory fields {string} and {string}")
	public void enterEmployeeData(String Firstname, String Lastname) {
		addemp.enterEmployeeData(Firstname, Lastname);
	}
	// And the user uploads a photo
	@And("^the user uploads a photo$")
	public void uploadPhoto()
	{
		addemp.uploadPhoto();
	}
	@And("^the user clicks on the Save button$")
	public void clickSaveButton() {
		addemp.clickSaveButton();
	}

	@Then("the employee list page should be visible with employee details")
	public void verifyEmployeeList() {
		addemp.verifyEmployeeList();
	}
}
