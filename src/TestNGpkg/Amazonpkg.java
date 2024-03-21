package TestNGpkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpkg {
	
	
	ChromeDriver driver;
	
	
	@BeforeTest
public void setup()
{
   driver = new ChromeDriver();
}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Amazon.in : mobile phones";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String>allwindowhandle = driver.getWindowHandles();
		for(String handle : allwindowhandle)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)", "");
				
				Thread.sleep(2000);;
				 driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				 
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				driver.close();
				driver.switchTo().window(parentwindow);
				
			}
		}
		
	}
}
