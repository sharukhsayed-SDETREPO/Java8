package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationss {

	
	
	
	@BeforeSuite
	public void BeforeSuite() {
		
		
		System.out.println("Before Suite--This will be executed before suite eg -connect to DB ");
	}
	
	@BeforeTest
	
	public void beforeTest() {
		System.out.println("Before Test--This will be executed before every test -eg create a user in db");
	}
	
	//both will be based on how you configure your runner xml for regression,sanity ...etc
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class--This will be executed before your test class--g launch browser and URL");
	}
	
	
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method---This will be executed before very test based on the priority");
	}
	
	
	
	@Test(priority=1)
	public void firsttest() {
		System.out.println("First test");
	}
	
	@Test(priority=2)
	public void Secondtest() {
		System.out.println("second test");
	}
	
	
	
	
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method this will be executed after each and every method");
	}
	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class--this will be executed after your testcalss based on runner configured");
	}
	
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("After test-this will be executed after your entire completion of test based on runner configured");
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite-This will be excuted after your suite");
	}
}
