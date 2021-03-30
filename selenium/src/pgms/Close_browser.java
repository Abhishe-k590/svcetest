package pgms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.naukri.com");
		String parent_id = d1.getWindowHandle();
		Set<String> allwh = d1.getWindowHandles();
		allwh.remove(parent_id);
		for(String wh:allwh)
		{
			d1.switchTo().window(wh);
			String title = d1.getTitle();
			System.out.println(title);
			if(title.equals("Apisero")){
				d1.close();	
			}
			
		}
		}
		
			
			
	}


