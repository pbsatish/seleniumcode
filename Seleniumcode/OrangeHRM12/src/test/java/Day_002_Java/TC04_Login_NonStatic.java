package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04_Login_NonStatic {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
		TC04_Login_NonStatic TN1= new TC04_Login_NonStatic();
		
		
		   TN1.OpenChromeBrowser();
		   TN1.OpenOrangeHRM();
		   TN1.Login();
		   TN1.Addnatialities();
		   TN1.Logout();
		   TN1.closebrowser();
	
	}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
		
	 
	public  void OpenChromeBrowser()  throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	}


	public  void OpenOrangeHRM() throws Exception
	{
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	


	public  void Login() throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.name("Submit")).click();
		
		
	}
	

	
	
	public  void Addnatialities() throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Kenyas2");
		findElement(By.id("btnSave")).click();
		
	}
	
	
	
	
	public   void closebrowser() throws Exception
	{
		
		 driver.quit();

	}
	
	
	public   void Logout()throws Exception
	 {
		 findElement(By.id("welcome")).click();	 
		 Thread.sleep(3000);
		 findElement(By.linkText("Logout")).click();
		 
	 }
	
	
	

}
