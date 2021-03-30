package pgms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selen {
	

	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1= new FirefoxDriver();
	d1.get("https://www.selenium.dev/downloads/");
	d1.findElement(By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar']")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	

	}

}
