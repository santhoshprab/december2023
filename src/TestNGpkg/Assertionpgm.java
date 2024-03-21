package TestNGpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assertionpgm {
	
	
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/login/");
		
		
		String exp = "facebook";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(exp, actualtitle);
	}

}
