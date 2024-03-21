package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	
	ChromeDriver driver;
	String baseurl="https://www.janasya.com";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
     @Test
     public void login()
     {
    	 driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span")).click();
         driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div/h3")).click();
    	
    	WebElement search= driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
    			search.sendKeys("saree",Keys.ENTER);
    			
    			
    	 List<WebElement>linklist = driver.findElements(By.tagName("a"));
    	 
    	 for(WebElement link : linklist)
    	 {
    		System.out.println(link.getText()+ "-" + link.getAttribute("href"));
    	 }
     }
    
     
    	 
     
     
}
