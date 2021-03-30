package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class val {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1= new FirefoxDriver();
	d1.get("file:///E:/abishake/html%20scorce%20code/ab.html");
	d1.findElement(By.xpath("//input[@value='abhishek']"));
	String url = d1.getCurrentUrl();
	System.out.println(url);
	if(url.equals("file:///E:/abishake/html%20scorce%20code/ab.html"))
	{
		System.out.println("pass");
	}
	else
		System.out.println("fail");
	}
	
}


