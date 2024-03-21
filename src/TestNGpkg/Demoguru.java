package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoguru {
	
	ChromeDriver driver;
	String baseurl = "https://demo.guru99.com/test/drag_drop.html";
	
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
    public void test()
    {
    	WebElement account =driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
    	WebElement amount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
    	WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a "));
    	WebElement amount2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a "));
    	WebElement acct =driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
    	WebElement amnt =driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
    	WebElement sales =driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
    	WebElement amnt2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    	
    	
    	Actions act = new Actions(driver);
    	act.dragAndDrop(bank, account).build().perform();
    	act.dragAndDrop(amount2, amount).build().perform();
    	act.dragAndDrop(sales ,acct).build().perform();
    	act.dragAndDrop(amnt2, amnt).build().perform();
    	
    	
    	
    }
}
