package Com.qa.hubspot.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.qa.hubspot.Base.BasePage;

public class ElementUtilPF extends BasePage{
	
	WebDriver driver;
	
	public ElementUtilPF(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void waitForWebelementPrsent(WebElement Element)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	

}
