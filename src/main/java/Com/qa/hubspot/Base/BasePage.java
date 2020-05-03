package Com.qa.hubspot.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

public WebDriver driver;
Properties prop;

/**
 * This method return webDriver instance
 * This method is used to Initialize the driver on the basis of browser
 */

public WebDriver intialize_webdriver(Properties Prop)

{
	String browser=Prop.getProperty("browser");
	
	//String browser="chrome";
	
	if(browser.equals("chrome"))
		
	{
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return driver;
   }


 public Properties initialize_properities()
  {
	 prop=new Properties();
	 
	 try {
		FileInputStream ip=new FileInputStream("C:/Users/Naga/workspace/POMFramework/src/main/java/config/qa/hubspot/config/Config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
	 return prop;
	 
	 
	 
	
  }
 
 public void quitBrowser()
 {
	 driver.quit();
 }
	}



