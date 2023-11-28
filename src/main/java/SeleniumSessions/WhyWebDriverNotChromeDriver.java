package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhyWebDriverNotChromeDriver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();
		
		
		ChromeDriver obj= new ChromeDriver();// this will be only effective on chrome driver 
		
		
		WebDriver obj2= new ChromeDriver(); //obj2 can be reassigned to any other browser 
		
		obj2 =new InternetExplorerDriver();
		
		
		
		
		

	}

}
