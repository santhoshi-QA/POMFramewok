package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.hubspot.Base.BasePage;
import Com.qa.hubspot.pages.LoginPage;
import Com.qa.hubspot.pages.LoginPagePF;

public class LoginTestPF {
	
	BasePage basepage;
	WebDriver driver;
	LoginPagePF Page;
	Properties Prop;

		@BeforeMethod
		
		public void setup()
		{
			basepage=new BasePage();
			
			Prop=basepage.initialize_properities();
			
			driver=basepage.intialize_webdriver(Prop);
			

			Page=new LoginPagePF(driver);
		}
		
		@Test
		
		public void loginTest()
			{
			
			Page.doLogin(Prop.getProperty("username"),Prop.getProperty("pasword"));
			
		}
		
		
		
		@AfterMethod
		
		public void teardown()
		{
			basepage.quitBrowser();
		}
		
		

}
