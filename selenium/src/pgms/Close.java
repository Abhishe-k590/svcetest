package pgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		Thread.sleep(2000);
		d1.close();
		d1.quit();

	}

}
