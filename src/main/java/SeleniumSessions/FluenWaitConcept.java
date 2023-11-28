package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluenWaitConcept {
	
	
	
	public static WebDriver driver;
	
	public static void main(String [] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		driver=new ChromeDriver();
		
		
		
		driver.get("https://classic.crmpro.com/");
		By uname= By.name("username");
		
		
		WaitforWebelement(driver, uname, 20).sendKeys("Test234234324");
		

	}
	public static WebElement  WaitforWebelement( WebDriver driver546 , final By locator,int  timeout) {
		Wait<WebDriver> wat=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(1)).
				ignoring(NoSuchElementException.class)
				;
				;
	WebElement ele= wat.until(new Function<WebDriver,WebElement>(){
		@Override
		public WebElement apply(WebDriver driver546) {
			 	return  driver546.findElement(locator); 
		}
	});
	return ele;
	}
	///Similar can be achieved by 
	public static WebElement  WaitforWebelementB( WebDriver driver546 , final By locator,int  timeout) {
		Wait<WebDriver> wat=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(1)).
				ignoring(NoSuchElementException.class)
				;
				;
	
		return wat.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	
	}
	
}
