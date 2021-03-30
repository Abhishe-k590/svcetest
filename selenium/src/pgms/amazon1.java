package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("https://www.amazon.in");
	WebElement ele = d1.findElement(By.xpath("//a[@href='http://www.amazon.com.br/ref=footer_br']"));
	String font = ele.getCssValue("z-index");
	System.out.println(font);
}
}
