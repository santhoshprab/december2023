package Junitpkg;



import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasyav {
	
	ChromeDriver driver;
	String baseurl = "https://www.janasya.com";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
@Test
public void janasya()
{
  List<WebElement>linklist = driver.findElements(By.tagName("a"));
  
  for(WebElement link : linklist)
  {
	 
	  String os = link.getAttribute("href");
	  verify(os);
  }
}



private void verify(String os) {
	try 

	{
		URL u = new URL(baseurl);
		HttpURLConnection con =(HttpURLConnection)u.openConnection();
				con.connect();
				if(con.getResponseCode()==200)
				{
					System.out.println("Successfull");
				}
				else if(con.getResponseCode()==404)
				{
					System.out.println("broken link ");
				}
				else
				{
					System.out.println("ok da");
				}
	}
	
	catch (Exception e) {
		System.out.println(e.getMessage());
	}

}

}
