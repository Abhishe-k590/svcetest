package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver d1 = new FirefoxDriver();
		d1.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement ele = d1.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		ele.click();
	}

}
