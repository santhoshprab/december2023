package TestNGpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterfb {
	
  ChromeDriver driver ;
  String baseurl ="https://www.facebook.com/login/";
  
  
  
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
  @Parameters({"login" , "pass"})

  @Test
  public void test(String login , String pass)
  {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(login);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
  }
}
