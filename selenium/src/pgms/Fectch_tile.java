package pgms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fectch_tile {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1= new FirefoxDriver();
	 d1.get("https://www.naukri.com/");
	Set<String> allwh = d1.getWindowHandles();
	int count = allwh.size();
	System.out.println(count);
	for(String wh:allwh)
		
	{
		d1.switchTo().window(wh);
		String t = d1.getTitle();
		
		System.out.println(t);
		d1.close();
	}
	

	}

}
