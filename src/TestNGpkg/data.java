package TestNGpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class data {
	
	WebDriver driver;;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com/login/");
		FileInputStream fi = new FileInputStream("C:\\Users\\santhosh\\Downloads\\Untitled spreadsheet (1).xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("sheet1");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0; i<=rowcount; i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username = "+username);
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password = "+password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
		driver.navigate().refresh();
			
		}
	}

}
