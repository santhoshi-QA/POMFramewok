package Com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import Com.qa.hubspot.Base.BasePage;

public class LoginPage extends BasePage{
	
	WebDriver driver;
		
		//Define locators/ or with By Locator(NPF)
		
		By emailId=By.id("username");
		By Password=By.id("password");
		By loginButton=By.id("loginBtn");
	
		//Constructor of the pageClass
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		//Page Actions
		
		public String getLoginPagetitle()
		{
			return driver.getTitle();
		}
		public HomePage doLogin(String username,String Pwd)
		{
			driver.findElement(emailId).sendKeys(username);
			driver.findElement(Password).sendKeys(Pwd);
			driver.findElement(loginButton).click();
			
			return new HomePage(driver);
		}
		@AfterMethod
		
		public void tearDown()
		{
			driver.close();
		}
			

	}


