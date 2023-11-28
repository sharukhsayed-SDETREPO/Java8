package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	public static void main(String args[]) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver dri =new ChromeDriver();
	dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dri.navigate().to("https://app.hubspot.com/login");
	System.out.println(dri.getTitle()); //it wont be appplicable for this
	
	
	dri.findElement(By.id("username")).sendKeys("BeforeREfresh");;
	

	
	dri.findElement(By.id("username")).sendKeys("AfterResfresh");;
}

}
