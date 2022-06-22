package Day_012_TestNG_Paraneters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

//import ExcelUtil.ExcelApiTest4;


public class TC02_Login_Static_Paarameters2 {
	
	
	static WebDriver driver;
	
	
 
	@Parameters({"Browser1","UserName1","Password1","Nationality1"})
	@Test
	public void Login_Test(String Browser,String UserName,String Password,String Nationality) throws Exception
	{
		
	
					if(Browser.equalsIgnoreCase("Chrome"))
					{
						
					    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
					 	driver =new ChromeDriver();
				 	 	driver.manage().window().maximize() ;	
				    }

					if(Browser.equalsIgnoreCase("FireFox"))
					{
							driver = TestBrowser.OpenFirefoxBrowser();
							Thread.sleep(5000);
					}
						
	
	    //TC02_Login_Static_Paarameters.OpenChromeBrowser();
		TC02_Login_Static_Paarameters2.OpenOrangeHRM();
		TC02_Login_Static_Paarameters2.Login(UserName,Password);
		TC02_Login_Static_Paarameters2.AddNationalities(Nationality);
		
		driver.quit();
	}
	
	
	
	
	public static  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
 
	
	
	
	
	
	public static void OpenOrangeHRM() throws Exception
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	public static void Login(String UserName,String Password) throws Exception
	{
		
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.id("btnLogin")).click();
		
		
		
	}
	
	
	public static   void AddNationalities(String Nationality) throws Exception
	{
		
		 
		findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		findElement(By.linkText("Nationalities")).click();

		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();
		
		
		
	}
	
	
	
	
	
	

}
