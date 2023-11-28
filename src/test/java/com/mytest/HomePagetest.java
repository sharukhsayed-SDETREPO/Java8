package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePagetest extends BaseTest{

	

	@Test
	
	
	public void gettitletforLoginPage() {
		Assert.assertEquals(driver.getTitle(), "Free CRM software for customer relationship management, sales, and support.");
	}
}
