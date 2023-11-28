package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
	
         WebDriverManager.chromedriver().setup();
         
         ChromeOptions co= new ChromeOptions();
         co.addArguments("--headless");
		WebDriver driver =new ChromeDriver(co);
driver.navigate().to("https://www.google.com/");;
		
		//simple ,method
		
		driver.get("https://www.google.com/");
		
		System.out.println("The title of the page is : " + driver.getTitle());
		
		
		if (driver.getTitle().equals("Google")) {
			
			System.out.println("Title is correct");
		}
		
		else {
			System.out.println("Title is incorrect :"+ driver.getTitle());
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().contains("Amazon")) {
			System.out.println("Amazon was navigated sucessfully");
			
		}
		
		
		else
		{
			System.out.println("Invalid URL check again");
			
		}
		
//System.out.println(driver.getPageSource());		

		
		
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File fs=ts.getScreenshotAs(OutputType.FILE);
		String dest="/Users/shari/Desktop/Performance testing/test.png";
			
	 
		File desti= new File (dest);
		
		FileUtils.copyDirectory(fs, desti);
		
		
		
		
		
		
		
		

Thread.sleep(3000);
driver.quit();
		
		
	}

}
