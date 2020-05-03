package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.hubspot.Base.BasePage;
import Com.qa.hubspot.pages.LoginPage;
import Com.qa.hubspot.util.Constants;

public class LoginTest {

	
		BasePage basepage;
		WebDriver driver;
		LoginPage Page;
		Properties Prop;

			@BeforeMethod
			
			public void setup()
			{
				basepage=new BasePage();
				
				Prop=basepage.initialize_properities();
				
				driver=basepage.intialize_webdriver(Prop);
				
	
				Page=new LoginPage(driver);
			}
			
			@Test
			
			public void loginTest()
				{
				
				Page.doLogin(Prop.getProperty("username"),Prop.getProperty("pasword"));
				
			}
			
			@Test
			
			public void loginPageTitleTest()
			{
				String title=Page.getLoginPagetitle();
				System.out.println("Login Page title is : " +title);
			    Assert.assertEquals(title, Constants.login_Page_Ttttle);
			    
			    
			}
			@AfterMethod
			
			public void tearDown()
			{
				driver.close();
			}
				

	}


