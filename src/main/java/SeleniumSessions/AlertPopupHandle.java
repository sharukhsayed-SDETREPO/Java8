package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {
 
	
	public static WebDriver dri;
	public static void main(String[] args) throws InterruptedException {
	
     WebDriverManager.chromedriver().setup();
     
     dri= new ChromeDriver();
     dri.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
     
     dri.findElement(By.name("proceed")).click();;
     Thread.sleep(5000);
     Alert al= dri.switchTo().alert();
     System.out.println(al.getText());
     if (al.getText().equalsIgnoreCase("Please enter a valid user name")) {
    	 System.out.println("coorect username");
     }
     else 
     {
    	 System.out.println("Incorrect user name");
     }
     al.accept();
     dri.switchTo().defaultContent();
     
   
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
