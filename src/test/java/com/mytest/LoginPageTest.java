package com.mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	
	
	@Test
	
	
	public void gettitletforLoginPage() {
		driver.findElement(By.name("username")).sendKeys("srkatye");
		driver.findElement(By.name("password")).sendKeys("srkatye"); 
		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();; 
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
	}

}
