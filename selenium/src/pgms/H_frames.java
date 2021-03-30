package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class H_frames {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver d1=new FirefoxDriver();
 d1.get("file:///E:/abishake/html%20scorce%20code/main.html");

WebElement ele = d1.findElement(By.xpath("//iframe[@id='f1']"));
d1.switchTo().frame(ele);
d1.findElement(By.id("g1")).sendKeys("hi");
	}

}
