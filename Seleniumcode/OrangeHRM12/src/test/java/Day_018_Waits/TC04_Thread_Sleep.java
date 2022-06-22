package Day_018_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC04_Thread_Sleep {
	
	
    static WebDriver driver;
	static Reporter1 R1;
	
	
	
	@Test
	public void Login_Test() throws Exception
	{
		    driver=TestBrowser.OpenChromeBrowser();
		    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		    String str= "TC01_Login";
			R1= new Reporter1(driver,str);	

			TC04_Thread_Sleep.OpenOrangeHRM();
			TC04_Thread_Sleep.Login();
			TC04_Thread_Sleep.Logout();
			TC04_Thread_Sleep.closebrowser();
	}
	
	
	public static  void OpenOrangeHRM() throws Exception
	{
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		R1.TakeScreenShotAuto(driver,"Opened Orange HRM","Pass");
	
	}
	


	public static void Login() throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys("Admin");
		R1.TakeScreenShotAuto(driver,"Username Entered","Pass");
		
		findElement(By.name("txtPassword")).sendKeys("admin123");
		R1.TakeScreenShotAuto(driver,"Password Entered","Pass");
		
		findElement(By.id("btnLogin")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Submit","Pass");
		
		
	}
	

	
	
	public static void Addnatialities() throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Admin","Pass");
		
		findElement(By.linkText("Nationalities")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Nationalities","Pass");
		
		findElement(By.name("btnAdd")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Add Nationalitis button","Pass");
		
		findElement(By.id("nationality_name")).sendKeys("Kenyas2");
		R1.TakeScreenShotAuto(driver,"Entered Nationality Text","Pass");
		
		findElement(By.id("btnSave")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Save","Pass");
		
	}
	
	
	
	
	public static  void closebrowser() throws Exception
	{
		
		 driver.quit();

	}
	
	
	public static  void Logout() throws Exception
	 {
		 
			try
			{
				findElement(By.id("welcome")).click();

				Thread.sleep(10000); // time to sleep in milliseconds,  1 Sec= 1000 milli Seconds
				
				findElement(By.linkText("Logout")).click();
				
				
				
				R1.TakeScreenShotAuto(driver,"Clicked on Logout ","Pass");
			}
			catch(Exception e)
			{
				String str=e.getMessage();
				R1.TakeScreenShotAuto(driver,str,"Fail");
			}
		 
	 }
	
	
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public static  WebElement findElement(By by) throws Exception 
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
