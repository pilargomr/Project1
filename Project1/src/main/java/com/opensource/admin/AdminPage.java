package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.opensource.base.Base;

public class AdminPage extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Objects
	By imgHeaderOrange = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img");
	By lnkAdmin = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	By txtSearchUsername = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div");
	By btnSearch = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By tblUsername = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div");
	
	/*
	 * Validate login
	 */
	public void validateLogged() {
		reporter ("Validate Loggeed successfully");
		waitForElementPresent(imgHeaderOrange);
	}
	
	/*
	 * clic Admin
	 */
	public void clickAdmin() {
		reporter ("Click Admin Module");
		click (lnkAdmin);
		implicitlyWait();
	}
	
	/*
	 * Search user
	 */
	public void searchUser (String username) {
		reporter("Searching... "+username);
		type(txtSearchUsername,username);
		click (btnSearch);
		implicitlyWait();
	}

	/*
	 * Validate username exists in table 
	 */
	public void validateUsernameTable (String username) {
		reporter ("Verify this value: "+username+" in Admin user table");
		SoftAssert validTable = softAssertEquals (getText(tblUsername), username);
		validTable.assertAll();
	}
	
	/*
	 * Verify user exists in table after click search
	 * @param (Wrapper)
	 */
	public void verifyUserExistsTableAfterClickSearch(String username) {
		clickAdmin();
		searchUser (username);
		validateUsernameTable (username);
	}
	
	//TAREA para TC 2 y 3 estos metodos de abajo
	
	/*
	 * 
	 */
	public void validateRecordNotFound() {
		reporter ("Validating the record was not found");
		//assertionEqualsByLocator (txtNoRecordsFound, "No Records Found");
	}
	
	public void clickAdd() {
		reporter ("Click Add button");
		//click(btnAdd);
	}
	
	public void typeEmployeeName (String employeeName ) {
		reporter ("Input a valid employee name");
		//type(txtEmployeeName, employeeName);
	}
	
//	public String selectValidUserName() {
//		
//	}
	
	public void getTableValue() {
		reporter ("Get a random table value");
	//	String tableValueGotten = tablevalue();
	//	System.out.println(tableValueGotten);
	}
	
}
