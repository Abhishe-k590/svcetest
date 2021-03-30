package pgms;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1 =new FirefoxDriver();
		d1.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement a1 = d1.findElement(By.id("box3"));
		WebElement b1 = d1.findElement(By.id("box103"));
		Thread.sleep(3000);
		WebElement a2 = d1.findElement(By.id("box7"));
		WebElement b2 = d1.findElement(By.id("box107"));
		Thread.sleep(3000);
		WebElement a3 = d1.findElement(By.id("box6"));
		WebElement b3 = d1.findElement(By.id("box106"));
		WebElement a4 = d1.findElement(By.id("box5"));
		WebElement b4 = d1.findElement(By.id("box105"));
		Thread.sleep(3000);
		WebElement a5 = d1.findElement(By.id("box4"));
		WebElement b5 = d1.findElement(By.id("box104"));
		WebElement a6 = d1.findElement(By.id("box1"));
		WebElement b6 = d1.findElement(By.id("box101"));
		WebElement a7 = d1.findElement(By.id("box2"));
		WebElement b7= d1.findElement(By.id("box102"));
		
		Actions act =new Actions(d1);
		act.dragAndDrop(a1,b1).perform();
		act.dragAndDrop(a2, b2).perform();
		act.dragAndDrop(a3, b3).perform();
		act.dragAndDrop(a4, b4).perform();
		act.dragAndDrop(a5, b5).perform();
		act.dragAndDrop(a6, b6).perform();
		act.dragAndDrop(a7, b7).perform();
		

	}

}
