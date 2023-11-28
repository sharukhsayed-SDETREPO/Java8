package SeleniumSessions;

public class HubSpotLogin {
	
	
	public static String Browser ="CHROME";
	
	public static String URL ="https://app.hubspot.com/login";
	
	public static void main(String[] args) {

		
		WebDriverFactory wf= new WebDriverFactory();
		
		wf.launchBrowser(Browser);
		wf.LaunchURL(URL);
		System.out.println(wf.getTitle());
		System.out.println(wf.getCurrentURL());
		wf.QuitBrowser();
		
		
		
	}

}
