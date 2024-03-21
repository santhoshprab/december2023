package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	
	
	
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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
