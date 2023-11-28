package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.navigate().to("https://www.google.co.in/");
		
		By loc= By.xpath("//*[@id='SIvCob']/a");
		
		ClickonSpecificLanguage("ਪੰਜਾਬੀ", driver, loc);
		
		driver.close();

	}
	
	
	public static void ClickonSpecificLanguage(String lang,WebDriver driver,By loct) {
		 List<WebElement> alllang= driver.findElements(loct);
		 
		for(int i=0;i<alllang.size();i++) {
			
			alllang.get(i).click();
			alllang= driver.findElements(loct);
			
		}
		
		 
		 //this for loop will give stale element exception not sure why 
 		
//		for (WebElement ele : alllang) {
//			
//			ele.click();
//			alllang=driver.findElements(loct);
//			
//		}
		
		
		
		
		 
		
		
		
		
		
	}

}
