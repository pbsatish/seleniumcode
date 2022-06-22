package Day_018_Waits;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import CommonUtil.TestBrowser;

public class TC02_Fluent_Wait {
	
	
    static WebDriver driver;
	static Reporter1 R1;
	
	
	
	@Test
	public void Login_Test1() throws Exception
	{
		    driver=TestBrowser.OpenChromeBrowser();
		   
		  //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		    String str= "TC01_Login";
			R1= new Reporter1(driver,str);	

			TC02_Fluent_Wait.OpenOrangeHRM();
			TC02_Fluent_Wait.Login();
			TC02_Fluent_Wait.Logout();
			TC02_Fluent_Wait.closebrowser();
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

			/*	WebDriverWait wait2=  new WebDriverWait(driver,120);
				wait2.pollingEvery(40,TimeUnit.SECONDS);
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"))) ;
				
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
				R1.TakeScreenShotAuto(driver,"Clicked on Logout ","Pass");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
				
				*/
				
				 // Waiting 30 seconds for an element to be present on the page, checking
				  // for its presence once every 5 seconds.
				   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				       .withTimeout(120, TimeUnit.SECONDS)
				       .pollingEvery(40, TimeUnit.SECONDS)
				       .ignoring(NoSuchElementException.class);
				   
				   WebElement Logout1 = wait.until(new Function<WebDriver,WebElement>() {
					     public WebElement apply(WebDriver driver) {
					       return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
					     }
					   });
				
				findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
				R1.TakeScreenShotAuto(driver,"Clicked on Logout ","Pass");
				Logout1.click();
				//findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
				
				
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
