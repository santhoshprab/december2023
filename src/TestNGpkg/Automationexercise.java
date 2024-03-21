package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void test()
	{
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("sagar");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sagar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sagar1234");
		WebElement day =driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails = new Select(day);
		daydetails.selectByValue("2");
		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails = new Select(month);
		monthdetails.selectByValue("February");
		WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails = new Select(year);
		yeardetails.selectByValue("2000");
		
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("sagar");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("monus");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("lottry stall");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("kamath house , kannur , p.o kovvappuram");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("kamath house , kannur , p.o kovvappuram");
		Select dropcountry =new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		dropcountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("KERALA");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("KANNUR");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("1111");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9400924827");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}

}
