package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver  d1=new FirefoxDriver();
	d1.get("https://www.flipkart.com");
d1.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abhisheksnexus@gmail.com");
d1.findElement(By.xpath("//input[@type='password']")).sendKeys("ad@1234");
d1.findElement(By.xpath("(//span[.='Login'])[3]")).click();
d1.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9110411840");
	}

}
