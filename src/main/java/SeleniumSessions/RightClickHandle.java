package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickHandle {

	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
		driver.navigate().to("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions ac= new Actions(driver);
		ac.contextClick(ele).perform();;
		Thread.sleep(5000);
		//same Css selector
		//ul.context-menu-list.context-menu-root li.context-menu-item.context-menu-icon
		By loc= By.cssSelector("ul.context-menu-list.context-menu-root li.context-menu-item.context-menu-icon");
		driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]"));
		

		PErformRightClick(loc, "Paste");
		
	}

	public static void PErformRightClick(By Loc, String value) {
		List<WebElement> ele =driver.findElements(Loc);
		
		for(int i =0;i<ele.size();i++) {
			String Optvalu= ele.get(i).getText();
			
			if(Optvalu.equalsIgnoreCase(value)) {
				System.out.println(Optvalu);
				ele.get(i).click();
				
				
				break;
			}
		}
		
		
	}

	
	
	
	
	
}
