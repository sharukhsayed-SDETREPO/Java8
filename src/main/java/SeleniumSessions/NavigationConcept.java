package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver obj =new ChromeDriver();
		obj.get("https://www.google.com/");
		System.out.println(obj.getTitle());
		obj.navigate().to("https://www.amazon.in/");
		System.out.println(obj.getTitle());
		obj.navigate().back();
		System.out.println(obj.getTitle());
		obj.navigate().forward();
		System.out.println(obj.getTitle());
		obj.navigate().refresh();
		System.out.println(obj.getTitle());
		
		
		
		
		

	}

}
