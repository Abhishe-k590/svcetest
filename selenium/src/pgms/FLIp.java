package pgms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_test.Store_generic;

public class FLIp extends Store_generic {
	@Test
	public void add()
	{
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//div[.='Grocery']")).click();
	}

}
