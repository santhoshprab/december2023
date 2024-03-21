package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;

public class fblogintest {
	
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void test()
	{
		Fbloginpage ob = new Fbloginpage(driver);
		ob.setvalues("satheeshkammath@gmail.com", "satheesh");
		ob.login();
	}

}
