package pgms;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome_mouse_hover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.flipkart.com");
		d1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element = d1.findElement(By.xpath("//span[.='Men']"));
		Actions s = new Actions(d1);
		s.moveToElement(element).perform();
		Thread.sleep(2000);
		d1.findElement(By.linkText("T-Shirts")).click();

	}
}
