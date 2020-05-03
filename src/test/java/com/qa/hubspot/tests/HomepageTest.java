package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.hubspot.Base.BasePage;
import Com.qa.hubspot.pages.HomePage;
import Com.qa.hubspot.pages.LoginPage;

public class HomepageTest
{

	

	BasePage basepage;
	WebDriver driver;
	LoginPage Page;
	Properties Prop;
	HomePage homepage;

		@BeforeMethod
		
		public void setup()
		{
			basepage=new BasePage();
			
			Prop=basepage.initialize_properities();
			
			driver=basepage.intialize_webdriver(Prop);
			
			Page=new LoginPage(driver);
			
			homepage=Page.doLogin(Prop.getProperty("username"), Prop.getProperty("pasword"));
		}
		
		@Test
		
		public void verityHomepageTitile()
		{
			String title=homepage.homepageTitle();
			System.out.println("Homepage tiltle is "+title);
			//Assert.assertEquals(title, expected);
		}
		
		@Test
		
		public void VerifyHomePageHeader()
		{
			String Header=homepage.homepageHeader();
			System.out.println("Home page Header is "+Header);
		}
		
	 @Test
	 
	 public void VerifyAccountName()
	 {
		String AccountNmae= homepage.getAccountName();
		System.out.println(AccountNmae);
	 }
	 
	 
	  
		
  }

	


