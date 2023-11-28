package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	     WebDriverManager.chromedriver().setup();
		   /////OR
		WebDriverManager.getInstance(ChromeDriver.class).setup();
		WebDriver driver =new ChromeDriver();
		if (driver != null) {
			driver.navigate().to("https://www.google.com/");;
			
			//simple ,method
			
			driver.get("https://www.google.com/");
			
			System.out.println("The title of the page is : " + driver.getTitle());
			
			driver.quit();
		}

	}

}
