package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	ChromeDriver driver;
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	
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
	
	@Test( groups = {"smoke" ,"sanity"})
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		String expectedtitle = "rediffmail";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("title matched");
		}
		else
		{
			System.out.println("title doesnt  match");
		}
	}
	
	@Test( groups= {"regression" , "smoke"})
	public void logodisplay()
	{
		boolean logo =driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is absent");
		}
	}
		
		@Test
		public void createaccount()
		{
		boolean acct=	driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
		if(acct)	
		{
			System.out.println("create account is enabled");
		}
		else
		{
			System.out.println("create account doesnt enabled");
		}
			
		}
		
		@Test(groups = {"smoke"})
		public void buttontextverification()
		{
			String buttontext =driver.findElement(By.xpath("//input[@id='Register']")).getAttribute("value");
			if(buttontext.equals("create my account"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			
		}
		
		@Test
		public void contentverification()
		{
			String  aa=  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td")).getText();
			
			if(aa.equals("Password"))
			{
				System.out.println("present");
			}
			else
			{
				System.out.println("absent");
			}
		 
				 
		 
		}
		
	
		
	
}
