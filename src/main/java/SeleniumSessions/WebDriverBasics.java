package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generat
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shari\\Downloads\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(); //launch browser
		
		
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


Thread.sleep(3000);
driver.quit();	}

}
