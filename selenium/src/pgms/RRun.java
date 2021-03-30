package pgms;

import org.testng.annotations.Test;

import Generic_test.Store_generic;
import testq.test_login;

public class RRun extends Store_generic{
	@Test
	public void red() throws InterruptedException
	{
		test_login d1= new test_login();
		Thread.sleep(20000);
		d1.cli();
		Thread.sleep(10000);
	}
	

}
