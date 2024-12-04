package Locator;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.WebDriverActions;

public class addEmployeeLocator extends WebDriverActions {
	////div[@class = 'oxd-file-div oxd-file-div--active']//preceding-sibling::input[@type='file']
	
	private By userName = By.name("username");
	private By passowrd = By.name("password");
	private By loginButton = By.cssSelector("button[type='submit']");
	private By PIM = By.xpath("//span[text()='PIM']");
	private By addEmployeeOption=By.xpath("//a[text()='Add Employee']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By lastName= By.xpath("//input[@name='lastName']");
	private By uploadPhoto=By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input");
	private By saveButton = By.cssSelector("button[type='submit']");
	private By employeeListOption=By.xpath("//a[text()='Employee List']");
	

	public void validUserLogin(String UserName, String Passowrd) {
				waitUntilVisibilityOfElement(userName).sendKeys(UserName);
		waitUntilVisibilityOfElement(passowrd).sendKeys(Passowrd);
		waitUntilVisibilityOfElement(loginButton).click();
		Assert.assertEquals(getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	public void navigateToPIMPage() {
		waitUntilVisibilityOfElement(PIM).click();
		Assert.assertEquals(getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}

	public void clickAddEmployeeoption() {
		
		waitUntilVisibilityOfElement(addEmployeeOption).click();
	}

	public void enterEmployeeData(String Firstname, String Lastname) {
		waitUntilVisibilityOfElement(firstName).sendKeys(Firstname);
		waitUntilVisibilityOfElement(lastName).sendKeys(Lastname);
	}

	public void uploadPhoto()
	{
		waitUntilVisibilityOfElement(uploadPhoto).sendKeys("C:\\Users\\Hello\\Downloads\\rabbit-7018901_1280");
	}
	public void clickSaveButton() {
		waitUntilVisibilityOfElement(saveButton).click();

	}
	public void verifyEmployeeList()
	{
		waitUntilVisibilityOfElement(employeeListOption);
		Assert.assertEquals(getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/");
	}

}
