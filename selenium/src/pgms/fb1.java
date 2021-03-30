package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.fb.com");
		d1.findElement(By.id("email")).sendKeys("9110411840");
		d1.findElement(By.xpath("//input[@type='password']")).sendKeys("abhi@123");
		d1.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		String url = d1.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.facebook.com/"))
		{
		System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

	}

}
