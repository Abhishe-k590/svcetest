package pgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aleret {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("http://demo.guru99.com/test/delete_customer.php");
		d1.findElement(By.name("cusid")).sendKeys("susu");
		d1.findElement(By.name("submit")).click();
		Alert a= d1.switchTo().alert();
		a.accept();
		
		
		
		
		

	}

}
