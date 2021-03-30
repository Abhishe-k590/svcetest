package pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_ascc {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("file:///E:/abishake/html%20scorce%20code/dropdown.html");
WebElement ele = d1.findElement(By.tagName("select"));
Select s=new Select(ele);
ArrayList<String>l=new ArrayList<String>();
List<WebElement> options = s.getOptions();
int count = options.size();
for(WebElement we:options)
{
	String text = we.getText();
	l.add(text);
	
}
Collections.sort(l,Collections.reverseOrder());
for(String we:l)
{
	System.out.println(we);
}


	

	}

}
