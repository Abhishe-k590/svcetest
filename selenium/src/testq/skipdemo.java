package testq;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipdemo {
	private static final String invocation = null;
	@Test(priority=0)
	public void skipTest()
	{
		System.out.println("heelo hown r u");
	}
	@Test(invocationCount=3)
	public void addtest(){
		System.out.println("i want to fail");
		
	}
		

}
