package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class TC04_linkText
{
	static WebDriver driver;
	
	 @Test
	  public void testTC02() throws Exception {
		 
		driver = TestBrowser.OpenChromeBrowser();
			
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Nationalities")).click();
	    
	  }
	
	
}












