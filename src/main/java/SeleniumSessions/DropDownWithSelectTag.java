package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {

	
	
	static WebDriver  driv;
	
	public static void main(String[] args) throws InterruptedException {
	
     WebDriverManager.chromedriver().setup();
     driv =new ChromeDriver();
     
     driv.get("https://www.facebook.com/");
     
    By CreatNewAcc= By.linkText("Create new account");
    By day= By.id("day");
    By month= By.id("month");
    By year= By.id("year");
   
    
    doClick(CreatNewAcc);
    Thread.sleep(3000);
    performselectByVisibleText(day, "20");
    performselectByVisibleText(month, "Dec");
    performselectByVisibleText(year, "1993");
	}
	
	public static WebElement getelement(By loc) {
		
	       return driv.findElement(loc);
			}
		
	
	public static void doClick (By locator) {
		getelement(locator).click();
	}
	
	
	public static void performselectByVisibleText(By loc,String value) {
		Select sec =new Select (getelement(loc));
		sec.selectByVisibleText(value);	
		
	}
	
	
	public static void performselectByIndex(By loc,int value) {
		Select sec =new Select (getelement(loc));
		sec.selectByIndex(value);	
		}
	
	

	public static void performselectValueAt(By loc,String value) {
		Select sec =new Select (getelement(loc));
		sec.selectByValue(value);	
		}
	
	
	
}
