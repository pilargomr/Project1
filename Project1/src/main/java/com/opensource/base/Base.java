package com.opensource.base;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Base {

	private WebDriver driver;
	
	/*
	 * Constructor
	 * @author pilar.gomez
	 * @param
	 * @return
	 * @throws
	 */
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Reporter
	 * @author pilar.gomez
	 */
	public void reporter(String log) {
		Reporter.log(log);
	}
	
	/*
	 *Set WebDriver 
	 */
	public WebDriver chromeDriver()	{
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY, GlobalVariables.CHROME_DRIVER_NAME);
		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * Implicitly wait
	 */
	public void implicitlyWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch(TimeoutException e ) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Implicitly wait (overloading)
	 */
	public void implicitlyWait() {
		try {
			driver.manage().timeouts().implicitlyWait(GlobalVariables.GENERAL_IMPLICITLY_TIMEOUT, TimeUnit.SECONDS);
		} catch(TimeoutException e ) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Wait for element present (sync)
	 */
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait (driver, GlobalVariables.GENERAL_TIMEOUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Wait for element present (sync) (overloading)
	 */
	public void waitForElementPresent(By locator, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait (driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Launch Browser
	 */
	public void launchBrowser (String url) {
		reporter (GlobalVariables.LAUNCHING_MESSAGE + url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait();
	}
	
	/*
	 * Type (sendKeys)
	 */
	public void type (By locator, String inputText) {
		try {
		driver.findElement(locator).sendKeys(inputText);
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Click
	 */
	public void click(By locator) {
		try {
		driver.findElement(locator).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
		
	/*
	 * isDisplayed
	 */
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/*
	 * get text
	 */
	public String getText (By locator) { 
		try {
			return driver.findElement(locator).getText();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	
	/*
	 * Hard Assertion (String)
	 */
	public void assertEquals (String actuaValue, String expectedValue) {
		try {
			Assert.assertEquals(actuaValue, expectedValue);
		}catch (AssertionError e) {
			Assert.fail(e.getMessage()+"Actual value: "+actuaValue+" does not match with Expected Value: "+expectedValue);
		}	
	}

	/*
	 * Close browser
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	/*
	 * Soft assertion (String
	 */
	public SoftAssert softAssertEquals (String actuaValue, String expectedValue) {
		try {
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actuaValue, expectedValue);
			return soft;
		}catch (AssertionError e) {
			Assert.fail(e.getMessage()+"Actual value: "+actuaValue+" does not match with Expected Value: "+expectedValue);
			return null;
		}		
	}
	
	/*
	 * Get table value
	 */
//	public String tablevalue() {
//		reporter ("Select a random value from the table");
//		int tr, td, max;
//		WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
//		List <WebElement> rows = table.findElement(By.tagName(("tr")));
//		System.out.println(rows.setSize());
//		max = rows.size();
//		tr = (int)(Math.random()*max+1);
//		td = 2;
//		String xpath = "//tbody/tr[" + tr + "]/td[" + td + "]";
//		return driver.findElement(By.xpath(xpath)).getText();		
//	}
	
	
	
	
	

	
}
