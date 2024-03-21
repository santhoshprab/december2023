package Junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	
	
	
	String link = "https://register.rediff.com/register/register.php?FormName=user_details";
	
	
	@Test
	public void link() 
	{
		
	}
		
		
		private void verify(String baseurl)
		{
	  try 
	  {
		URL u = new URL(link);
	HttpURLConnection con =	(HttpURLConnection)u.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("response code is successfull");
	}
	else
	{
		System.out.println("response code is not successfull");
	}
	}
	  catch (Exception e) 
	  {
		System.out.println(e.getMessage());
		
	}
	  
		
	   
		   
	   
		
	}
	

}
