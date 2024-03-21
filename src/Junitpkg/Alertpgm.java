package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	ChromeDriver driver;
	String baseurl="file:///C:/Users/santhosh/Desktop/ANSYSACADEMICSTUDENT_2021R1_WINX64/alert.html";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	
  @Test
  public void alert()
  {
	  driver.findElement(By.xpath("//input[@type='button']")).click();
	  Alert a= driver.switchTo().alert();
	  String alerttext = a.getText();
	  System.out.println("alerttext="+alerttext);
	  a.accept();
	  
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("aaaa");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
}



