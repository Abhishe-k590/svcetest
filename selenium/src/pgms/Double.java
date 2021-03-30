package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement e = d1.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions act=new Actions(d1);
		
		act.doubleClick(e).perform();
				
		

	}

}
