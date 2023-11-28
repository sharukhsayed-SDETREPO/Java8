package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	
	   
	String browser ;
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browsername) {
		if(browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();}
		else if(browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.navigate().to("https://classic.crmpro.com/index.html");
		
				
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
