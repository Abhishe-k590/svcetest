package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hovflip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new  FirefoxDriver();
	d1.get("https://www.flipkart.com/");
	d1.findElement(By.xpath("//button[.='✕']")).click();
	WebElement ele = d1.findElement(By.xpath("//span[.='Home & Furniture']"));
	Actions act=new Actions(d1);
	act.moveToElement(ele).perform();
Thread.sleep(2000);
	d1.findElement(By.xpath("//a[.='Blankets']")).click();
	
}
}
