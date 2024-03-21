package TestNGpkg;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robofileuploadmthd {
	
	
	ChromeDriver driver;
	String baseurl = "https://www.ilovepdf.com/word_to_pdf";
	
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
     @Test
     public void test()throws Exception
     {
    	 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
     fileupload("C:\\Users\\santhosh\\Downloads\\Untitled spreadsheet - Sheet1.pdf");
     }
public  void fileupload(String p)throws AWTException
{
	StringSelection StrSelection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StrSelection, null);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
	

	
}
