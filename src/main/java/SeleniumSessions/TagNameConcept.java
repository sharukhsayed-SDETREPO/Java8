package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(8000);
	By AllLinks=	By.tagName("a");
		
		List<WebElement> AllLinksI=driver.findElements(AllLinks);
		System.out.println(AllLinksI.size());
		
		
		for (WebElement result : AllLinksI) {
			
			
			if(!result.getText().isEmpty()){
			System.out.println(result.getText());
			
		}
		}
		driver.quit();
		
		
		
	}

}
