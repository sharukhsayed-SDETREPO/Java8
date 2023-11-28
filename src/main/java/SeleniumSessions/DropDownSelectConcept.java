package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectConcept {

	
	static WebDriver driver;
	
	
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver ();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		By Country= By.id("Form_getForm_Country");
		ArrayList<String> allcount=returnAllOprionsfromSelect(Country);
	System.out.println(allcount);		
	}
	

	public static WebElement getele(By loc) {
		return driver.findElement(loc);
	}
	public static ArrayList<String> returnAllOprionsfromSelect(By loc) {
		ArrayList<String> values= new ArrayList<String>();
		Select sec= new Select(getele(loc));
		List<WebElement> allopt=sec.getOptions();
		for(int i = 0;i<allopt.size();i++) {
			//System.out.println(i +"--->" + allopt.get(i).getText());
			values.add(allopt.get(i).getText());
			
			
		}	
		
		return values;
	}
}
