package TestNGpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
       driver = new ChromeDriver();
	}
	
	
	@Test
	public void test() throws InterruptedException 
	{
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
		
		while(true)
		{
			WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
			String monthtext = month.getText();
			
			if(monthtext.equals("September 2024"))
			{
				break;
		    }
			else
			{
				driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
			}
		}
		
		List<WebElement>li= driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/p"));
		for(WebElement ele : li)
		{
			String date  = ele.getText();
			if(date.equals("16"))
			{
				ele.click();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
		
		
	}
	
	
		
}
	
	


