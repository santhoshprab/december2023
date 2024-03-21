package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	
	WebDriver driver;
	
 By createfbpage = By.xpath("//*[@id=\"reg_pages_msg\"]/a");
 By signup = By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
 
 
 
 public Createpage(WebDriver driver)
 {
 this.driver = driver;
 }
	
 
 




public void createpageclick()
 {
	 driver.findElement(createfbpage).click();
	 
	 
 }
 
 public void signupclick()
 {
	 driver.findElement(signup).click();
	 
 }
 
 public String titleverification()
 {
	 String actualtitle = driver.getTitle();
	 return actualtitle; 
 }






}

	

