package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	
	
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();;
		
		driver=new ChromeDriver();
		
		driver.navigate().to("https://app.hubspot.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testdesignstudiomal@gmail.com");;
		driver.findElement(By.id("password")).sendKeys("Qw123456789)");
		driver.findElement(By.id("loginBtn")).click();
		
	//	Thread.sleep(18000);
		//driver.navigate().to("https://app.hubspot.com/contacts/44380249/objects/0-1/views/all/list")
		;
	

		
		
		//driver.findElement(By.id("loginBtn")).click();

	driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[@id='nav-secondary-contacts']")).click();;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='private-truncated-string__inner']/span[text()='My contacts']")).click();;
		Clickoncheckbox("Thirdwala nosurname", driver);
		System.out.println(Getphonnumber("Firstcontact sadasdfsfs", driver));

}
	
	
	
	public static void Clickoncheckbox(String value,WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'"+value+"')]//ancestor::td//preceding-sibling::td//span[@class='UICheckbox__PrivateCheckboxIndicator-sc-3mzro5-1 dEypPr private-checkbox__indicator']")).click();;
		
	
	}
	
	
	
	public static String  Getphonnumber(String value,WebDriver driver) {
		
		return driver.findElement(By.xpath("//a[contains(text(),'"+value+"')]//ancestor::td//following-sibling::td[2]")).getText();
		
	}
	
	

}
