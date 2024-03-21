package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonjunit {
	
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void amazonlo()
	{
		WebElement search =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a")).click();
	}


}
