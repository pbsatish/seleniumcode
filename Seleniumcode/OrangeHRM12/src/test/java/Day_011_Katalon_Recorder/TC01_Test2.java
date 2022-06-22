package  Day_011_Katalon_Recorder;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;


public class TC01_Test2
{
	
	WebDriver driver;
	Reporter1 R1;
	
	@Test
	public void TC01_Report_Test() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
		
	
	}
	
	
	

	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		// draw a border around the found element
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
			
		
	
	
	
	
	
	
	
	
	
	
	
	

}












