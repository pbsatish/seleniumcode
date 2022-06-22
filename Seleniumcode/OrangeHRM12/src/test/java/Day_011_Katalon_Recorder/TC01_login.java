package  Day_011_Katalon_Recorder;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;


public class TC01_login
{
	
	WebDriver driver;
	Reporter1 R1;
	
	
	public void TC01_Report_Test() throws Exception {
		
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
	
	}
	
	
	  @Test
	  public void testTC01() throws Exception {
		  
		  driver = TestBrowser.OpenChromeBrowser();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	   
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    
	    driver.findElement(By.id("menu_admin_nationality")).click();
	    
	    driver.findElement(By.id("btnAdd")).click();
	    
	    driver.findElement(By.id("nationality_name")).click();
	    driver.findElement(By.id("nationality_name")).clear();
	    driver.findElement(By.id("nationality_name")).sendKeys("indian1235");
	    
	    driver.findElement(By.id("btnSave")).click();
	    
	    driver.quit();
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












