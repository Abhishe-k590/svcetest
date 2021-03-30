package Generic_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("file:///E:/abishake/html%20scorce%20code/dropdown.html");
		WebElement ele = d1.findElement(By.name("fishland hotel"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		
		/*for(WebElement we:options){
			String text = we.getText(); 
			System.out.println(text);
	
	}*/
		
		for(int i=0;i<count;i++){
			
			if(i%2==1){
				String text = options.get(i).getText();
				System.out.println(text);
				
			}
		}
	}
	
}