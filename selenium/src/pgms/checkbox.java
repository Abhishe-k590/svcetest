package pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class checkbox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver d1=new FirefoxDriver();
d1.get("file:///E:/abishake/html%20scorce%20code/checkbox.html");
List<WebElement> box = d1.findElements(By.xpath("//input"));
int count = box.size();
System.out.println(count);
for(WebElement we:box)
{
	we.click();
}
Thread.sleep(1000);
for(int i=count-1;i>=0;i--)
{
	WebElement we = box.get(i);
	
	we.click();
}

	}

}
