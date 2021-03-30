package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_url {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.amazon.in/");
		List<WebElement> link = d1.findElements(By.xpath("//a"));
		int count = link.size();
		System.out.println(count);
		for(WebElement we:link)
		{
			String url = we.getAttribute("href");
			System.out.println(url);
		}
		
		
		

	}

}
