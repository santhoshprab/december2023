package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif {
	
	
	ChromeDriver driver;
	String baseurl = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
	driver = new ChromeDriver();
	driver.get(baseurl);
	}
	
	@Test
	public void rediff()
	{
	boolean logo =driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("present");
	}
	else
	{
		System.out.println("absent");
	}
	
boolean radio=	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
if(radio)
{
	System.out.println("selected");
}
else
{
	System.out.println("Not ok");
}
	
	
	}

}
