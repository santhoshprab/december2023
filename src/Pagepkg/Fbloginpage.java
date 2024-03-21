package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	
	WebDriver driver;
	
	By fbemail = By.xpath("//*[@id=\"email\"]");
	By fbpassword = By.xpath("//*[@id=\"pass\"]");
	By fblogin = By.xpath("//*[@id=\"loginbutton\"]");
	
	
	
	

		public Fbloginpage(WebDriver driver) {
			this.driver = driver;
		}
	

	public void setvalues(String useraname , String password)
	{
		driver.findElement(fbemail).sendKeys(useraname);
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
