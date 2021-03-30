package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("https://www.youtube.com");
	d1.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf");
	d1.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//yt-formatted-string[@aria-label='KGF Chapter 1 Full Movie In Hindi | KGF Full Movie In Hindi | South New Block Buster Movie by Sahil Khan 1 week ago 2 hours, 21 minutes 82,595 views']")).click();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//paper-ripple[@class='style-scope yt-icon-button circle']")).click();
	Thread.sleep(2000);

	}

}
