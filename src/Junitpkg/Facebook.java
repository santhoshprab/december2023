package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("aaaaaa@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("aaaaaaaa");
		driver.findElement(By.name("login")).click();
	}
	
	
	

}
