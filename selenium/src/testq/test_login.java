package testq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic_test.Store_generic;

public class test_login extends Store_generic{
	
	//declaration
	@FindBy (xpath="//button[.='✕']")
	private WebElement ele;
	
	
	//intialization
	public void login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//utlizTION
public  void cli(){
	ele.click();
}
	}


