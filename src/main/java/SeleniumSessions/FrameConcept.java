package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	
	
	
	
	
	public static void main(String args []) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.navigate().to("https://classic.crmpro.com/index.html");
		
		Thread.sleep(9000);
		driver.findElement(By.name("username")).sendKeys("srkatye");
		driver.findElement(By.name("password")).sendKeys("srkatye"); 
		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();; 
		
		
		
		driver.switchTo().frame("mainpanel");
		
		
		driver.findElement(By.cssSelector("#navmenu > ul > li:nth-child(4) > a")).click();;
		
		
		driver.findElement(By.cssSelector("body > table:nth-child(3) > tbody > tr:nth-child(2) > td:nth-child(1) > div > table > tbody > tr > td:nth-child(4) > a")).click();;
	}
}
