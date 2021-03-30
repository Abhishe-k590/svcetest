package pgms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.naukri.com/");
		String par_id = d1.getWindowHandle();
		Set<String> allw = d1.getWindowHandles();
		int count1 = allw.size();
		System.out.println(count1);
		allw.remove(par_id);
		int count = allw.size();
		System.out.println(count);
		
		Thread.sleep(2000);
		for(String p:allw){
			d1.switchTo().window(p);
			String t = d1.getTitle();
			System.out.println(t);
			
			d1.close();
		}
	}

}
