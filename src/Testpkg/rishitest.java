package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.rishiloginpage;

public class rishitest {
	

	
  WebDriver driver;
  
  @BeforeTest
  public void setup()
  {
	  driver = new ChromeDriver();
	  driver.get("https://rishiherbalindia.linker.store/");
  }
  
  @Test
  public void test()
  
  {
	  rishiloginpage ob = new rishiloginpage(driver);
	  ob.account();
	  ob.health();
	  ob.stock();
	  ob.dropdown();
	  ob.alphabet();
	  ob.product();
	  ob.wishlist();
	  
	  
  }
	
	
	
 
 
 
 
 
 

}
