package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptgetTitle {

	

	public static void main(String[] args) {
	
       WebDriverManager.chromedriver().setup();
       WebDriver driver;
       
       driver=new ChromeDriver();
       
       
       
//       driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
//       
//       
//       
////       String text =doGetTitle(driver, 10, "Amazon");
////      System.out.println(text);
////      
////      System.out.println(doIsTitle(driver, 10, text));
//       
//       By proceedd= By.xpath("//input[@type='submit']");
//       ElementUtil ele =new ElementUtil(driver);
//       
//       ele.doGetPageCurrentUrl(10, "login");
//       ele.waitForElementToBeClickable(proceedd, 10).click();;
//       System.out.println(ele.WaitforAlert(5).getText());
//       ele.WaitforAlert(10).accept();;
       
       
       
       By AllCountres= By.cssSelector("nav.sc-662dedcb-0.fMAcTI .sc-6293d692-0.eNMhGa");
       driver.navigate().to("https://www.freshworks.com/");
       
       ElementUtil ele =new ElementUtil(driver);
       
       
       System.out.println(ele.WaitForElementToBEDisplayedwithoutExplicit(AllCountres, 20));
       
//      List<WebElement> allcoun= ele.waitforelementstobevisible(AllCountres, 10);
//       
//       System.out.println(allcoun.size());
//       
//       for(WebElement el3e: allcoun) {
//    	   if(!el3e.getText().isEmpty()) {
//    		   System.out.println(el3e.getText());
//    	   }
//       }
//       
       
	}
	
	
	
	
	
	public static String doGetTitle(WebDriver driver,int timeout,String value) {
		
		WebDriverWait wait =new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(value));
				return driver.getTitle();
		
	}
public static String doIsTitle(WebDriver driver,int timeout,String value) {
		
		WebDriverWait wait =new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(value));
				return driver.getTitle();
		
	}
	
	

}
