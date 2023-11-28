package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		
		driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		///return all the search options in a string
		//create a reuable utulity to click on any one options
		By editbox=By.name("q");
		By listoptions= By.xpath("//ul[@class='G43f7e']/li");
		driver.findElement(editbox).sendKeys("selenium");
		Thread.sleep(8000);
		getAlloptions(listoptions);	
		
		
		SelectjQueryDropdown(listoptions, "selenium ide");
	}
	public static void getAlloptions(By loc) {
		List<WebElement> allopt=driver.findElements(loc);
		for(int i = 0;i<allopt.size();i++) {
			System.out.println(allopt.get(i).getText());
		}
		}

	
	
	public static void SelectjQueryDropdown(By loc,String value) {
		List<WebElement> allopt=driver.findElements(loc);
		for(int i = 0;i<allopt.size();i++) {
			if(allopt.get(i).getText().equals(value)) {
		allopt.get(i).click();
		break;
			}
			
		}
	}
}
