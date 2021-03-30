package pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d1=new FirefoxDriver();
	d1.get("file:///E:/abishake/html%20scorce%20code/dropdown.html");
	WebElement ele = d1.findElement(By.name("fishland hotel"));
	Select s=new Select(ele);
	s.selectByIndex(2);
	s.selectByValue("j");
	s.selectByVisibleText("prawns fry");
	s.deselectByIndex(0);
	boolean b = s.isMultiple();
	
	
	if(b)
	{
		System.out.println("its a multiple select");
	}
	else{
		System.out.println("its a single select");
	}
	}

}
