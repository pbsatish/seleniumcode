package  Day_005_TestNG_DataProvider_Lab1;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class Skills
{
	static WebDriver driver;
	
	
	 @DataProvider(name = "TC01_OrangeHRM")
	 
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians125" }
	        	};
	  }
	
	@Test(dataProvider = "TC01_OrangeHRM")
	public void Test1(String TestURL,String UserName,String Password,String Nationality) throws Exception {
		
		//OpenChromeBrowser
		driver = TestBrowser.OpenChromeBrowser();

		//OpenUrl
		driver.get(TestURL);
		

		//SendKeys
		 findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		
		
			
		 	  
		 driver.quit();	 
		 

	}
	

// Draws a red border around the found element. Does not set it back anyhow.
		public  WebElement findElement(By by) throws Exception {
			
		    WebElement elem = driver.findElement(by);
		    	    
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		        
		  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
		        
		    }
		    return elem;
		}
		
	
	
}
	
	
	
	
	
	
	 
	













