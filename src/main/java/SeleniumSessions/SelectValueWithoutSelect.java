package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValueWithoutSelect {

	
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        
		String value= "18-Jul-2021";
		driver =new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
	    By CreatNewAcc= By.linkText("Create new account");
	    performClick(CreatNewAcc);
	    Thread.sleep(5000);
	    By daysoptions=By.xpath("//select[@id='day']/option");
	    By monthoptions=By.xpath("//select[@id='month']/option");
	    By yearoptions=By.xpath("//select[@id='year']/option");
	    
	    
	    selectValueswithoutselect(daysoptions, value.split("-")[0]);
	    selectValueswithoutselect(monthoptions, value.split("-")[1]);
	    selectValueswithoutselect(yearoptions, value.split("-")[2]);
	    
	}


	public static WebElement getele(By locator) {
		return driver.findElement(locator);	
	}
	public static void performClick(By loc) {
	getele(loc).click();
	}	
	public static void selectValueswithoutselect(By loc,String value) {
		List<WebElement> allele=driver.findElements(loc);
		for(int i=0;i<=allele.size()-1;i++) {
			//System.out.println(allele.get(i).getText());
			if(allele.get(i).getText().equals(value)) {
			//	System.out.println(allele.get(i).getText());
				allele.get(i).click();
				break;
			}
		}
		
		
	}
	
	
}
