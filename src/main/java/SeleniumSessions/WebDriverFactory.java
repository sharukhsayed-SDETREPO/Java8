package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	
	public WebDriver driver;
	
	/**
	 * This method will launch your browser
	 * @param BrowserName
	 * @return driver 
	 */
	
	public WebDriver launchBrowser(String BrowserName) {
		System.out.println("Launching browser: " + BrowserName );
		 switch (BrowserName) {
		 case "CHROME":
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 break;
			 
		 case "InterNetExplorer":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 break;
		 case "Safari":
			 WebDriverManager.getInstance(SafariDriver.class).setup();
			 driver= new SafariDriver();
			 break;
			default:
				System.out.println("Incorrect browser name" + BrowserName);
			 
		 }
		 
		return driver;
		
	}
	
	
	/**
	 * Launch your URN 
	 * 
	 */
	public void LaunchURL(String URL) {
		
		driver.navigate().to(URL);
	}
	
	/****
	 * @return Title of your webpage
	 */
	
 public String getTitle() {
	 return driver.getTitle();
 }
 
 /*
  * @return CurrentURL
  */
 public String getCurrentURL() {
	 
	 return driver.getCurrentUrl();
 }
 
 
 /**
  * Close your browser
  */
 
 public void QuitBrowser() {
	 driver.quit();
 }
 
 
}
