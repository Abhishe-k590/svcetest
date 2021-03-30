package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.amazon.in");
		WebElement ele = d1.findElement(By.xpath("//a[@href='http://www.amazon.com.br/ref=footer_br']"));
		Point text = ele.getLocation();
		int x = text.getX();
		System.out.println(x);
		 int y=text.getY();
		 System.out.println(y);                                                                                                                        
	
		
		

	}

}
