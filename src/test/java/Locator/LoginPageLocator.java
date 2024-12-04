package Locator;

import org.openqa.selenium.By;
import org.junit.Assert;
import Utilities.WebDriverActions;

public class LoginPageLocator extends WebDriverActions{

	private By userName=By.name("username");
	private By passWord=By.name("password");
	private By loginButton=By.xpath("//button['type=submit']");
	private By dashboard=By.xpath("//h6['class=oxd-text  -text --h6 oxd tophbar-header-breadcrumb-module ']");
	private By err=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	
	public void verifyLandingPage() {
		Assert.assertEquals(getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void enterUsername(String username)
	{
		waitUntilVisibilityOfElement(userName).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		waitUntilVisibilityOfElement(passWord).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		waitUntilElementToBeClickable(loginButton).click();
	}
	public void verifyDashboardPage()
	{
		Long.parseLong(System.getProperty("timeOut"));
		waitUntilVisibilityOfElement(dashboard);
		//javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", dashboard);
		Assert.assertEquals(getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	}
	public void errorMessage()
	{
		Assert.assertEquals(waitUntilVisibilityOfElement(err).getText(),"Invalid credentials");
	}
}
