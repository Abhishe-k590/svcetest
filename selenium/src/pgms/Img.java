package pgms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Img {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("https://www.amazon.in");
		List<WebElement> src = d1.findElements(By.xpath("//img"));
		FileInputStream fis = new FileInputStream("./exel/demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		for(int i=0;i<src.size();i++){
		Row r = sh.createRow(i);
		Cell c = r.createCell(0);
		 c.setCellValue(src.get(i).getAttribute("src"));
		}
	FileOutputStream fou=new FileOutputStream("./exel/demo.xlsx");
	wb.write(fou);

	}

}
