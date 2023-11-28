package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitforWebelement {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver dri =new ChromeDriver();
		dri.navigate().to("https://app.hubspot.com/login");
		By username= By.id("username");
		By password = By.id("password");
		By LgnBtn =  By.id("loginBtn");
		waitforWebelement(dri, 10, username).sendKeys("test@gmail.com");;
		waitforWebelement(dri, 10, password).sendKeys("test@gmail.com");//this is not required
		waitforWebelement(dri, 10, LgnBtn).click();
		
	}

	
	
	public static WebElement  waitforWebelement(WebDriver driver,int timeout,By loc) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		
		
		
		
		
	}
	
	
	
	
	
}
