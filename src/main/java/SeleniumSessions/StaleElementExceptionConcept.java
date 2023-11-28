package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	
	public static void main (String args []) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver dri =new ChromeDriver();
		
		dri.navigate().to("https://app.hubspot.com/login");
		
		
		dri.findElement(By.id("username")).sendKeys("BeforeREfresh");;
		
		dri.navigate().refresh();
		
		dri.findElement(By.id("username")).sendKeys("AfterResfresh");;
		
		//dri.quit();
		
	}
}
