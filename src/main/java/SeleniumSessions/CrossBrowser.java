package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	
	static WebDriver driver;
	
	
	
	public static void main(String [] args) {
		String browser= "InternetExplorer";
		if(browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\Downloads\\chromedriver.exe");
			driver =new ChromeDriver();			
		}
		else if (browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.ghecko.driver", "C:\\Users\\shari\\Downloads\\gheckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("SAFARI")) {
			//no set property required for safari
			driver =new SafariDriver();}
		
		else if (browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\shari\\Downloads\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();//Session ID created when browser is launched
			 }
		
		else {
			System.out.println("Please input correct browser name" + browser + " is invalid  ");
		}
		
		if (driver != null) {
			driver.navigate().to("https://www.google.com/");;
			
			//simple ,method
			
			driver.get("https://www.google.com/");
			
			System.out.println("The title of the page is : " + driver.getTitle());
		}
		
		
	}

}
