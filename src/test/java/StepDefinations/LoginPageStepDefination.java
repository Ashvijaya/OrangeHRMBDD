package StepDefinations;

import Locator.LoginPageLocator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginPageStepDefination {

	LoginPageLocator LoginPage = new LoginPageLocator();

	@Given("^I am on the landing page$")
	public void verifyLandingPage() {
		LoginPage.verifyLandingPage();
	}

	@And("^I enter username as (.*)$")
	public void enteruserName(String username) {
		LoginPage.enterUsername(username);

	}

	@And("^I enter password as (.*)$")
	public void enterPassword(String username) {
		LoginPage.enterPassword(username);
	}

	@And("^I click on login button$")
	public void clickLoginButton() {
		LoginPage.clickLoginButton();
	}
	@Then("^I am on dashboard page is dispayed$")
	public void verifyDashboardPage()
	{
		LoginPage.verifyDashboardPage();
	}
	@Then("^Error Message Displayed$")
	public void errorMessage()
	{
		LoginPage.errorMessage();
	}
}

