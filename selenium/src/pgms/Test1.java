package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.googlemaps.com");
		Thread.sleep(2000);
		d1.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("(//input[@//input[@tooltip='Choose starting point, or click on the map...' and@class='tactile-searchbox-input']]")).sendKeys("bangalore");
		Thread.sleep(2000);
		d1.findElement(By.xpath("//input[@tooltip='Choose destination...']")).sendKeys("tumkur");
Thread.sleep(1000);
	}

}
