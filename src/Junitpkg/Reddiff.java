package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff {
	
	
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void reddiff()
	{
		WebElement dob = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		WebElement Dob =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		WebElement DOB = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		DOB.sendKeys("2023" , Keys.ENTER);
		Dob.sendKeys("october" , Keys.ENTER);
		dob.sendKeys("01", Keys.ENTER);
		dob.click();
		
	}

}
