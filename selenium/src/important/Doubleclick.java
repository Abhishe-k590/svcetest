package important;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Doubleclick {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/abishake/html%20scorce%20code/333.html");
		
	//driver.findElement(By.className("gdsd")).clear();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("document.getElementsByName('santosh').click()");
	
		//js.executeScript("document.getElementById('abhi').click()");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('ihba').value='ABHI'");
		

//js.executeAsyncScript("document.getElementById('abhi').click()");
		
		//
		js.executeScript("document.querySelector('input[id=abhi]').click()");
		
		js.executeScript("document.getElementById('ihba').clear()");
		

}
}