package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC001_Admin_SearchEmployee {
  
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC001_Admin_SearchEmployee_Script() {
	  
	  //Step 1
	  Reporter.log("Open Browser \"OrangeHRM\" web page");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  	
	  //Step 2
	  Reporter.log("Enter Username and Password");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  driver.findElement(By.xpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //xpaths utilizado en el curso
	  	//input[@id='txtUsername']
	  	//input[@id='txtPassword']
	  	//input[@id='btnLogin']
	  
	  //Step 3
	  Reporter.log("Validate that you have logged in successfully");
	  WebDriverWait wait = new WebDriverWait (driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='client brand banner']")));
	  //xpath utilizado en el curso
	  	//img[@alt='OrangeHRM']
	  //xpath copiado de la pag web:	
	  	//*[@id="app"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img

	  //Step 4
	  Reporter.log("Click Admin - Go to the admin page");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //xpath utilizado en el curso
	  	//a[@id='menu_admin_viewAdminModule']
	  
	  //Step 5
	  Reporter.log("Search username in field \"Username\"");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //xpath utilizado en el curso
	  	//input[@id=\"searchSystemUser_userName\"]
	  
	  //Step 6
	  Reporter.log("Click Search");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //xpath utilizado en el curso
	  	//input[@id=\'searchBtn']
	  
	  //Step 7
	  Reporter.log("Verify username exist in table");
	  String actualValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]")).getText();								
	  //Assert.assertEquals(actualValue, "Admin"); //HardAssertion
	  
	  SoftAssert soft = new SoftAssert(); //SoftAssertion
	  soft.assertEquals(actualValue, "Admin");
	  
	  //xpath utilizado en el curso
	  	//tbody/tr[1]/td[2]
	  //xpath copiado de la pag web:
	  	//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div
	  	
	  
	  //Step 8
	  Reporter.log("Log out");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //xpaths utilizado en el curso
	  	//a[@id='welcome']
	  	//a[contains(text(), 'Logout')]
		  
	  //Step 9
	  Reporter.log("Close Browser");
	  driver.close();

	  soft.assertAll(); 
	  //el programa nunca se detiene y cada ves q se pone esta linea reporta todo lo q salio mal, si no se pone esta linea no lo reporta
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
