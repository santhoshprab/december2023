package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class auto {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
		
	}
	
	
	@Test
	public void auto()
	
	{
		String Expected = "https://automationexercise.com/account_created";
		
		driver.get("https://automationexercise.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("1212");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("santhoshramnathprabhu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String actual = driver.getCurrentUrl();
		
		if(Expected == actual)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
			
		
	}

}
