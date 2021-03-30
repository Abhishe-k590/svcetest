package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ass1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
WebDriver d1= new FirefoxDriver();
d1.get("file:///E:/abishake/html%20scorce%20code/as.html");
WebElement ele = d1.findElement(By.xpath("//input[@value='hello']"));
ele.sendKeys(Keys.CONTROL+"ax");
WebElement ele1 = d1.findElement(By.xpath("//input[@value='world']"));
Thread.sleep(2000);
ele1.sendKeys(Keys.CONTROL+"av");
	}

}
