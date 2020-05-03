package Com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class HomePage 
{

	WebDriver driver;
	//define locators
	
	By Header=By.xpath("//span[@class='private-dropdown__button-label uiDropdown__buttonLabel']/h1");
	By AccountMenu=By.xpath("//a[@id='account-menu']");
	By AccName=By.xpath("//div[text()='santhoshi B']");
	
	
	//constructor of the page class
	
	public HomePage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	//Page Actions
	
	public String homepageTitle()
	{
		return driver.getTitle();
	}
	public String homepageHeader()
	{
		return driver.findElement(Header).getText();
	}
	
	public String getAccountName()
	{
		WebElement Adrop=driver.findElement(AccountMenu);
	
		Actions act=new Actions(driver);
		act.moveToElement(Adrop).click();
		
		return driver.findElement(AccName).getText();
			
	
	}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

	}


