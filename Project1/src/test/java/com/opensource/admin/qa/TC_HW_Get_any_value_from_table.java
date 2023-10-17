package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_HW_Get_any_value_from_table {
//* Crear metodo customizado de obtener cualquier valor de la tabla
	
		//Instancias
		WebDriver driver;
		Base base;
		LoginPage login;
		AdminPage admin;
		String username, password;
		
		
  @BeforeTest
  public void beforeTest() {
	//Set up driver
	  //vamos a instanciar el objeto webdriver
	  base = new Base(driver);
	  driver = base.chromeDriver();
	  //luego vamos a setear los objs q acabamos de crear
	  login = new LoginPage(driver);
	  admin = new AdminPage(driver);
	  
	  // Test data
	  this.username = "Admin";
	  this.password = "admin123";
  }

  @Test
  public void C_HW_Get_any_value_from_table_Script() {
	  //Step 1
	  	base.launchBrowser(GlobalVariables.QA_URL);
	  
	  //Step 2
	  	login.loginOrange(username, password);
	  	
	  //Step 3
	  	admin.validateLogged();
	  	
	  //Step 4
	  	admin.clickAdmin();
	  	
	  //Step 5
	 //	admin.getTableValue();
	  	
	  //Step 6
	  	login.logoutOrange();
	  	
  }
     
  
  @AfterTest
  public void afterTest() {
  }

}
