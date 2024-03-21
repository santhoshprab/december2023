package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrollby {

	
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
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)" , "");
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
	}
}
