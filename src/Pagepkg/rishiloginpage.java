package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class rishiloginpage {
	
	
WebDriver driver;

By account = By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span");
By health = By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
By stock = By.xpath("//*[@id=\"outOfStockFilter\"]");
By dropdown = By.xpath("//*[@id=\"input-sort\"]");
By alphabet = By.xpath("//*[@id=\"input-sort\"]/option[2]");
By product = By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a");
By Wishlist = By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span");
public rishiloginpage(WebDriver driver)
{
	this.driver = driver;
}
public void account()
{
	driver.findElement(account).click();
}

public void health()
{
	driver.findElement(health).click();
}

public void stock() 
{
     driver.findElement(stock).click();
}

public void dropdown()
{
   driver.findElement(dropdown).click();
}
public void alphabet()
{
   driver.findElement(alphabet).click();	
}

public void product()
{
	driver.findElement(product).click();
}

public void wishlist()
{
	driver.findElement(Wishlist).click();
}


}
