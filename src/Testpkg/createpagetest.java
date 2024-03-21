package Testpkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Createpage;


public class createpagetest {
	
	
  WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void test()
	{
		Createpage ob = new Createpage(driver);
		ob.createpageclick();
		
		String actualtitle = ob.titleverification();
		//Assert.assertEquals(actualtitle, "Create a page");
		ob.signupclick();
		
		
	}
	
       
}
