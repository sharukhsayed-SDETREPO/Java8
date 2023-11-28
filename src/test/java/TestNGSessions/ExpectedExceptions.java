package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	
	@Test(expectedExceptions= {Throwable.class,ArithmeticException.class}    ,invocationCount=10)
	public void testexception() {
		int q= 9/0;
	}
}
