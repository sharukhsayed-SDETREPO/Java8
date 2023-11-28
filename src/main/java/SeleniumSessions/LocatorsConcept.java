package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorsConcept {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	
		 driver =new ChromeDriver();
		driver.navigate().to("https://app.hubspot.com/login");
			

//		
		
//By ID	
//		By USername=	By.id("username");
//		By Password=	By.id("password");
//		By LoginButton=	By.id("loginBtn");
		
//By NAME ---no name was available  in DOM
//		By USername=	By.name("username");
//		By Password=	By.name("password");
//		By LoginButton=	By.name("loginBtn");
		
		
// By class name		
//		By USername=	By.className("login-email");
//	    By Password=	By.className("login-password");
//		By LoginButton=	By.className("login-submit");
		
// By xpath name		
//				By USername=	By.xpath("//*[@id=\'username\']");
//			    By Password=	By.xpath("//*[@id=\'password\']");
//				By LoginButton=	By.xpath("//*[@id=\'loginBtn\']");
//By CSS selector
				By USername=	By.cssSelector("#username");
			    By Password=	By.cssSelector("#password");
				By LoginButton=	By.cssSelector("#loginBtn");
//BY Linktext/By Partail Link text 
//By tagname				
		
		dosendKeys(USername, "Test@gmaol.com");
		dosendKeys(Password, "Test@gmaol.com");
		doClick(LoginButton);
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
		}

	public static void dosendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
}
