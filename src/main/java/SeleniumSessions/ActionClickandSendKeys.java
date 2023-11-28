package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickandSendKeys {
        private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.navigate().to("https://app.hubspot.com/login");
		Thread.sleep(5000);
		By uname=By.id("username");
		By pwd= By.id("password");
		By btn= By.id("loginBtn");
		
		PerformActionClick(uname);
	
		PerformSendKeys(uname, "Sharukh");
		
		PerformSendKeys(pwd, "thsserhbser");
		
		PerformActionClick(btn);

driver.quit();

}
	
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void PerformActionClick(By loc) {
		Actions ac =new Actions(driver);
		ac.click(getelement(loc)).perform();;
		
	}
	
	
	public static void PerformSendKeys(By locator,String value) {
		Actions ac =new Actions(driver);
		ac.sendKeys(getelement(locator), value).perform();;
	}
	
	

}
