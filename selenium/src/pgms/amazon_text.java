package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("https://www.amazon.in/");
		List<WebElement> links = d1.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)
		{
			String text = we.getText();
			System.out.println(text);
		}

	}

}
