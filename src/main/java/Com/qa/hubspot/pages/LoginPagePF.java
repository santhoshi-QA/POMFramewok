package Com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.qa.hubspot.util.ElementUtilPF;

public class LoginPagePF {
	
	WebDriver driver;
	ElementUtilPF EPF;
	
	//Define Webelements in PF model
	
	@FindBy(id="username")
	WebElement emailId;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="loginBtn")
	WebElement loginButton;
	
	
	//Constructor of the pageClass
	
	public LoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		EPF=new ElementUtilPF(driver);
		
		
	}
	
//Page Actions
	
	public void doLogin(String Username,String pwd)
	{
		
		EPF.waitForWebelementPrsent(emailId);
		emailId.sendKeys(Username);
		Password.sendKeys(pwd);
		loginButton.click();
			
	}
	
	

}
