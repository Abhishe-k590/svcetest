package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartimages {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe" );
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.flipkart.com/");
		List<WebElement> image = d1.findElements(By.xpath("//img"));
		int count = image.size();
		System.out.println(count);

	}

}
