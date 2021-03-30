package pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("https://www.flipkart.com");
		String title = d1.getTitle();
		System.out.println(title);
		String scr = d1.getPageSource();
		System.out.println(scr);
		d1.quit();
	}

}
