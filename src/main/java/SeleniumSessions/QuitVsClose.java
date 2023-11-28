package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shari\\Downloads\\IEDriverServer.exe");
		
		WebDriver obj=new InternetExplorerDriver();//Session ID created when browser is launched

		obj.navigate().to("https://www.google.com/");//Session ID active 
		
		
		System.out.println(obj.getTitle());//Session ID active
		
		
		obj.quit();//Session ID is NULL and browser is closed
		//System.out.println(obj.getCurrentUrl());// org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
	obj=new InternetExplorerDriver(); //Session ID created when browser is launched
	obj.navigate().to("https://www.google.com/");//Session ID active 
	
	
	System.out.println(obj.getTitle());//Session ID active
	
	
	obj.close();//Browser is closed but session ID is active but not valid or does not exist
	
	System.out.println(obj.getCurrentUrl());  //org.openqa.selenium.NoSuchSessionException: session 7987fdc2-9356-495e-8179-55e4a9d98ee4 does not exist
	
	
	}

}
