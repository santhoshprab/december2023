package TestNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demogururightclick {
	
	ChromeDriver driver;
	String baseurl ="https://demo.guru99.com/test/simple_context_menu.html";
	
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
    public void test()throws InterruptedException
    {
    	
    	Thread.sleep(1000);
    	WebElement rightclick =driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
    	WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
    	
    	
    	Actions act = new Actions(driver);
    	act.contextClick(rightclick).perform();
    	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
    	driver.switchTo().alert().accept();
    	act.doubleClick(doubleclick).perform();
    	Alert a = driver.switchTo().alert();
    	String alerttext =a.getText();
    	System.out.println("alerttext="+alerttext);
        a.accept();
    
    	
    	
    	
    }
}
