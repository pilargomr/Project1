package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC003_Admin_AddNewUser {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC003_Admin_AddNewUser_Script() {
	  
	//Random numerico 
	  int random = (int)(Math.random()*1000); 
	  String rndName = "Auto"+random;

	  //Random alfanumerico
	  //int random2 = (int)(Math.random()*1000);
	  //String rndName = generatedStringRandom(5) + random2;

	  
	  
	  
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
	  Reporter.log("Click Add");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //Step 6
	  Reporter.log("Enter valid Employee Name");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("Pilar");
	  
	  	  
	  
	  
	  //Step 7
	  Reporter.log("Enter valid username");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Pilar");
	  
	  //Step 7.1
	  Reporter.log("Enter User Role");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  //driver.findElement(By.xpath("")).click();//aqui poner xpath del user rol como admin dentro del drop down 
	  
	  //Step 7.2
	  Reporter.log("Enter Status");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  //driver.findElement(By.xpath("")).click(); //aqui poner el xpath del status como enabled dentro del drop down 
	  	  
	  
	  //Step 8
	  Reporter.log("Enter new password and confirm");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("pilar123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("pilar123");
	  
	  //Step 9
	  Reporter.log("Click Save");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	  
	  //Step 10
	  Reporter.log("Search username in field \"Username\"");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Pilar");
	  //xpath utilizado en el curso
	  	//input[@id=\"searchSystemUser_userName\"]
	  
	  //Step 11
	  Reporter.log("Click Search");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  //xpath utilizado en el curso
	  	//input[@id=\'searchBtn']
	  
	  //Step 12
	  Reporter.log("Verify username exist in table");
	  String actualValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
	  Assert.assertEquals(actualValue, "Pilar"); //HardAssertion
	  
	  //SoftAssert soft = new SoftAssert(); //SoftAssertion
	  //soft.assertEquals(actualValue, "Admon");
	  
	  //xpath utilizado en el curso
	  	//tbody/tr[1]/td[2]
	  //xpath copiado de la pag web:
	  	//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div
	  	
	  
	  //Step 13
	  Reporter.log("Log out");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //xpaths utilizado en el curso
	  	//a[@id='welcome']
	  	//a[contains(text(), 'Logout')]
		  
	  //Step 15
	  Reporter.log("Close Browser");
	  driver.close();

	  //soft.assertAll(); 
	  //el programa nunca se detiene y cada ves q se pone esta linea reporta todo lo q salio mal, si no se pone esta linea no lo reporta

	  
	  
  }
  
	// Random string
//	public static String generatedStringRandom(int StringLenght) {
//		int leftLimit = 97; // letter 'a' 
//		int rightLimit = 122; // letter 'z' 
//		Random random = new Random();
//		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(StringLenght)				
//				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//		return generatedString;
//	}
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
