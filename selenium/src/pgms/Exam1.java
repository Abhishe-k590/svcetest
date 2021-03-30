package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("file:///E:/abishake/html%20scorce%20code/hom.html");
		WebElement ele = d1.findElement(By.xpath("//input[@value='hi']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ax");
		WebElement ele2 = d1.findElement(By.xpath("//input[@value='hello']"));
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"av");
		d1.findElement(By.tagName("a")).click();
			
	}

}
