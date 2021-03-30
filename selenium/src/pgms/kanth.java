package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kanth {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("file:///E:/abishake/html%20scorce%20code/as1.html");
		List<WebElement> links = d1.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		
		
	

	}

}
