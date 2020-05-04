package com.qa.hubspot.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.hubspot.Base.BasePage;
import Com.qa.hubspot.pages.HomePage;
import Com.qa.hubspot.pages.LoginPage;

public class HomepageTest
{

	//BeforeTest launches the browser only once where BeforeMethid launches before each and every test case

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
			
			//Webdriverwait wait=new WebDriverwait(driver,10)
			//wait.untill(ExpectedConditions.titleContains("HubSpot"));
			
			String title=homepage.homepageTitle();
			System.out.println("Homepage tiltle is "+title);
			Assert.assertEquals(title, "HubSpot login");
		}
		
		@Test
		
		public void VerifyHomePageHeader()
		{
			String HeaderVal=homepage.homepageHeader();
			
			//assert.assertTrue(HeaderVal.contains("Salaes Dashboard"));
 
	     
		}
		
	 @Test
	 
	 public void VerifyAccountName()
	 {
		String AccountNmae= homepage.getAccountName();
		System.out.println(AccountNmae);
	 }
	 
	 
	  
		
  }

	


