package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	ChromeDriver driver;
	String baseurl = "https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
	@Test
	public void Test()
	{
		WebElement uploadfile =driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		uploadfile.sendKeys("C:\\Users\\santhosh\\Pictures\\Screenshots\\EQUIAVELENT STRESS  .png");
		 driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	     
		WebElement submit =driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		System.out.println("text ="+submit.getText());
		submit.click();
	}

}
