package TestNGpkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {

	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.ebay.com/");
		// driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(40));
		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		
	}
}
