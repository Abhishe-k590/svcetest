package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repeat {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1= new FirefoxDriver(); 
	d1.get("file:///E:/abishake/html%20scorce%20code/checkbox.html");
	List<WebElement> check = d1.findElements(By.tagName("input"));
	int count = check.size();
	for(WebElement we:check)
	{
	we.click();

	}

	}}
