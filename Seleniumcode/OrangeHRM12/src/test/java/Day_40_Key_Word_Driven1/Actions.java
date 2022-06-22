 package Day_40_Key_Word_Driven1;
 
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
			  public static void openChromeBrowser() throws Exception
			  { 
				  driver=TestBrowser.OpenChromeBrowser();
				  Reporter.log("Open Browser");
			  }
		 	  
		 	 @Test
		 	public static void OpenOrangeHRM() throws Exception
		 	{
		 		
		 		driver.get("https://opensource-demo.orangehrmlive.com/");
		 	}
		 	
		 	  
	   
		 	 @Test
			  public static void Login() throws Exception
			  { 
		 		findElement(By.name("txtUsername")).sendKeys("Admin");
				findElement(By.name("txtPassword")).sendKeys("admin123");
				findElement(By.id("btnLogin")).click();
				Reporter.log("Login method Invoked");
			  }
			   
		 	 
			 @Test 
		 	public static void AddNationality() throws Exception
			{
				findElement(By.id("menu_admin_viewAdminModule")).click();
				findElement(By.id("menu_admin_nationality")).click();
				findElement(By.id("btnAdd")).click();
				findElement(By.id("nationality_name")).sendKeys("Mexican791");
				findElement(By.id("btnSave")).click();
				
			}
			
		 	
			
			  
			  @Test
			  public static void closeBrowser()
			  {
				  
				  Reporter.log("Close Browser");
				  driver.quit();
			  }
			  
			  @Test
			  public static void AddSkills() throws Exception
			  {
				driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				driver.findElement(By.id("menu_admin_Qualifications")).click();
				driver.findElement(By.id("menu_admin_viewSkills")).click();
				driver.findElement(By.id("btnAdd")).click();
				driver.findElement(By.id("skill_name")).sendKeys("Selenium2");
				driver.findElement(By.id("skill_description")).sendKeys("Selenium Decsription2");
				driver.findElement(By.id("btnSave")).click();
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