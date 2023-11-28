package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUPPage {

	public static void main(String[] args) {


		
		
		
		
		
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver= wf.launchBrowser("CHROME");
		
		
		
		
		wf.LaunchURL("https://www.orangehrm.com/30-day-free-trial");
		
		
		By name = By.id("Form_getForm_Name");
		By email = By.id("Form_getForm_Email");
		By phonenumber = By.id("Form_getForm_Contact");
		By country = By.id("Form_getForm_Country");

		ElementUtil ele=new ElementUtil(driver);
		ele.doSendKeys(name, "Sharuh");
		ele.doSendKeys(email, "Test@34324.com");
		ele.doSendKeys(phonenumber, "12323434534645");
		ele.selectValuesFromDropDown(country, "India");
	wf.QuitBrowser();

		
	}

}
