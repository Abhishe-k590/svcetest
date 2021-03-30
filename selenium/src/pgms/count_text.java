package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class count_text {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("file:///E:/abishake/html%20scorce%20code/count.html");
	List<WebElement> text = d1.findElements(By.xpath("//input"));
	int count = text.size();
	System.out.println(count);
	Thread.sleep(2000);
	for(WebElement we:text)
	{
	  we.sendKeys("automation");
	  }
	Thread.sleep(2000);
	for(int i=count-1;i>=0;i--)
	{
		WebElement we1 = text.get(i);
		we1.clear();
	}
	}

}
