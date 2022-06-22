 package Day_40_Key_Word_Driven;
 
 import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import CommonUtil.TestBrowser;
import org.testng.Reporter;

	  
	 public class Actions 
	 {
		 
		 static WebDriver driver;
		 
		 	  @Test
			  public static void openBrowser() throws Exception
			  { 
				  driver=TestBrowser.OpenChromeBrowser();
			  }
	   
		 	 @Test
			  public static void navigate()
			  { 
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get("http://newtours.demoaut.com");
			  Reporter.log("Open mercury Tour");
			  }
			   
		 	 @Test
			  public static void input_Username() throws Exception
			  {
				  findElement(By.name("userName")).sendKeys("mercury"); 
				  Reporter.log("Enter UserName");
			  }
			   
		 	 @Test
			  public static void input_Password() throws Exception 
			  {
				  	findElement(By.name("password")).sendKeys("mercury");
				    Reporter.log("Enter Password");;
			  }
			   
		 	 @Test
			  public static void click_Login() throws Exception
			  {
				  findElement(By.name("login")).click();
				    Reporter.log("Click  Login");;
			  }
			  @Test
			  public static void verify_login()
			  {
			  String pageTitle = driver.getTitle();
			  Assert.assertEquals(pageTitle, "Find a Flight: Mercury Tours:"); 
			  Reporter.log(pageTitle);;
			  }
			  
			  @Test
			  public static void closeBrowser()
			  {
				  
				  Reporter.log("Close Browser");
			  driver.quit();
			  }
			  
	
		
		

				public static WebElement findElement(By by) throws Exception 
				{
			
					WebElement elem = driver.findElement(by);  
					
					if (driver instanceof JavascriptExecutor) 
					{
					 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
				 
					}
					return elem;
				}



 }