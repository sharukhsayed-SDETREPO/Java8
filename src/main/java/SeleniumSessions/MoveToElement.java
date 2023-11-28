package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
    private static WebDriver driver;     
	
    
    
    
    
    
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(5000);
	Actions ac= new Actions(driver);	  
	List<WebElement> ele= driver.findElements(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8']"));
	for(int i = 0;i<ele.size();i++) {
		if(ele.get(i).getText().equalsIgnoreCase("Add-ons")) {			
			ac.moveToElement(ele.get(i)).perform();;
			Thread.sleep(2000);
			driver.findElement(By.linkText("Taxi")).click();
			break;
		}	
	}	
	}

}
