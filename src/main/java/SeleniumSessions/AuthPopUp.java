package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      
      driver =new ChromeDriver();
      
      driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
