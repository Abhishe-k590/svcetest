package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exam2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("file:///E:/abishake/html%20scorce%20code/hom1.html");
		Thread.sleep(2000);
		 WebElement ele = d1.findElement(By.id("a1"));
		d1.findElement(By.id("a2")).sendKeys("i hate those people who talk in behind me");
		Thread.sleep(2000);
		ele.sendKeys("i hate those people who talk in behind me");
		ele.clear();
		
	}

}
