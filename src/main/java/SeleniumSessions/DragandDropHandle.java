package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropHandle {
	
	
	
	private static WebDriver driver; 
	public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceWE=driver.findElement(By.id("draggable"));
		WebElement destWE=driver.findElement(By.id("droppable"));
		
		
		Actions ac= new Actions(driver);
	
 //ac.clickAndHold(sourceWE).moveToElement(destWE).release().build().perform();
 
 //OR 
 ac.dragAndDrop(sourceWE, destWE).build().perform();
 driver.quit();
 
	}

}
