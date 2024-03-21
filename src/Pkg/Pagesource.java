package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		String baseurl = "https://www.google.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		
		String exp = "Google";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	
		driver.quit();
	
	}

}
