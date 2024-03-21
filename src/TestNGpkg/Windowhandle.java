package TestNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

;

public class Windowhandle {
	
	ChromeDriver driver;
	
	
	@BeforeTest
    public void setup()
    {
		driver = new ChromeDriver();
    }
	
	@Test
	public void test()
	{
		driver.get("http://demo.guru99.com/popup.php");
		
		
		String Parentwindow = driver.getWindowHandle();
		System.out.println("parent window handle ="+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowhandle=driver.getWindowHandles();
		for(String handle : allwindowhandle)
		{
			if(!handle.equalsIgnoreCase(Parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
				driver.close();
				
				driver.switchTo().window(Parentwindow);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
