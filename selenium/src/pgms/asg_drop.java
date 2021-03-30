package pgms;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class asg_drop {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("file:///E:/abishake/html%20scorce%20code/dropdown.html");
	WebElement ele = d1.findElement(By.name("fishland hotel"));
	Select s=new Select(ele);
	TreeSet<String>t=new TreeSet<String>();
	List<WebElement> options = s.getOptions();
	int count = options.size();
	for(WebElement we:options)
	{
		String text = we.getText();
		t.add(text);
	}
	for( String y:t)
	{
		System.out.println(y);
	}
	}
	
}


