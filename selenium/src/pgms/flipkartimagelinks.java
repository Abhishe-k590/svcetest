package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartimagelinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		List<WebElement> links = d1.findElements(By.xpath("//a|//img"));
		int count = links.size();
		System.out.println(count);

	}

}
