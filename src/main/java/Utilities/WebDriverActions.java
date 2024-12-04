package Utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverActions {
	private WebDriver driver= DriverFactory.getInstance().getWebDriver();
	private JavascriptExecutor javaScriptExecutor=(JavascriptExecutor)driver;
	
	long timeOut=Long.parseLong(System.getProperty("timeOut"));
	private WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	
	long timeOutInMillis = Long.parseLong(System.getProperty("timeOutInMillis"));
	public WebElement waitUntilElementToBeClickable(By locator)
	{
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(locator));
		executionOrder(element);
		return element;
	}
	
	public WebElement waitUntilVisibilityOfElement(By locator)
	{
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		executionOrder(element);
		return element;
	}
	public void scrollToElement(WebElement element)
	{
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void highlightElement(WebElement element)
	{
		javaScriptExecutor.executeScript("arguments[0].setAttribute('style','background:white; border:2px Solid green;');", element);
	}
	
	public void removeHightLight(WebElement element)
	{
		javaScriptExecutor.executeScript("arguments[0].setAttribute('style','background:white; border:2px Solid green;');", element);
	}

	public void pause() {
		try {
			TimeUnit.MILLISECONDS.sleep(timeOutInMillis);
		} catch (InterruptedException e) {
			Logs.getLog().getLogger().error("{WebDriverActions} ERROR --> failed to wait : "+e.getMessage());
		}
	}
	
	public void executionOrder(WebElement element) {
		scrollToElement(element);
		highlightElement(element);
		pause();
		removeHightLight(element);
		pause();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}	
	

}
