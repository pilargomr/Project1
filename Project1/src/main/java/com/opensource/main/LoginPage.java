package com.opensource.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.opensource.base.Base;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Objects
	By txtUsername = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");							   //
	By txtPassword = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By btnLogin = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	By lnkWelcome =  By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p");
	By lnkLogout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
		
	
	/*
	 * Login OrangeHRM
	 * @author pilar.gomez
	 * @date 16/10/2023
	 */
	public void loginOrange(String username,String password) {
		reporter("Enter Username and Password");
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		implicitlyWait();
	}
	
	/*
	 * Logout
	 */
	public void logoutOrange () {
		reporter("Logout Orange HRM Portal.. ");
		click(lnkWelcome);
		waitForElementPresent(lnkLogout);
		click(lnkLogout);
		implicitlyWait();
		closeBrowser();
	}
	
	
}
