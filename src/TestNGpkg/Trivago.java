package TestNGpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
	}
		
		@Test
		public void test() throws InterruptedException 
		{
			
			driver.get("https://www.trivago.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().refresh();
			Thread.sleep(2000);
			
	
			
		
		
			
		
		
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[1]/fieldset/button[1]"));
	    
	    WebElement month = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
	    String monthtext = month.getText();
	    
	    while(true)
	    {
	    	if(monthtext.equals("August 2024"))
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/button[2]/span"));
	    	}
	    }
	    
	    List<WebElement>li = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/time"));
	    for(WebElement ele : li)
	    {
	       String date = ele.getText();
	       if(date.equals("22"))
	       {
	    	   ele.click();
	       }
	       
	       
	    }
	    
		}
	}
	


