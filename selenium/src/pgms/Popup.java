package pgms;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		/*String parentid = driver.getWindowHandle();
		Set<String> Allwh = driver.getWindowHandles();
		for(String we:Allwh){
			driver.switchTo().window(we);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Jio")){
				driver.close();*/
		Set<String> set = driver.getWindowHandles();

		for (String act : set) {
			driver.switchTo().window(act);
			String actPageTile = driver.getTitle();
			if (actPageTile.contains("MAE")) {
			
				driver.close();
			}
			}
		}
}

