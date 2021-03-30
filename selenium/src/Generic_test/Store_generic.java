package Generic_test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Store_generic {
	public WebDriver driver;
@BeforeMethod
public void openappil()
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
  driver=new FirefoxDriver();
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  driver.get("https://www.flipkart.com");
}
@AfterMethod
public void closeappln()
{
	driver.quit();
}

}
