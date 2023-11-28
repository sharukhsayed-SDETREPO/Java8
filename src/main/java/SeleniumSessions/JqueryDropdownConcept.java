package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownConcept {

	
	public static WebDriver driver;
	public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       driver =new ChromeDriver();
       driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
       By Editbox= By.cssSelector("input.comboTreeInputBox");
       By allOptions= By.cssSelector("span.comboTreeItemTitle");
       driver.findElement(Editbox).click();
       
       //Select only one value
       //SelctOptionswitoutsec(allOptions, "choice 7");
       
      //Select multiple values
       SelctOptionswitoutsec(allOptions, "choice 1","choice 2","choice 7");
       //select all 
       SelctOptionswitoutsec(allOptions, "ALL");
       
	}
	public static void SelctOptionswitoutsec(By locator , String... value) {
		
		List<WebElement> set=driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("ALL")) {
		for (int i=0;i<set.size();i++) {
			String text=set.get(i).getText();
			System.out.println(text);
			for (int k=0;k<value.length;k++) {
			if(text.equals(value[k])) {
				set.get(i).click();
				break;	
			}
			}
		}
		}
		else {	
			try {
			for (int i=0;i<set.size();i++) {
				
				if(set.get(i).isDisplayed()) {
				set.get(i).click();
			}
			}
			}
			catch (Exception e){	
			}
			}
		}
	}
	

