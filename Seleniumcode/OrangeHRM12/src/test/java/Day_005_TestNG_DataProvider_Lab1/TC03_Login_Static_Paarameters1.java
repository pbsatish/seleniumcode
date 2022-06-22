package Day_005_TestNG_DataProvider_Lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC03_Login_Static_Paarameters1 {
	
	
	static WebDriver driver;
	
	

	 @DataProvider(name = "TC01_OrangeHRM")
	  public static Object[][] TestDataforTest() throws Exception {
		 
	        return new Object[][] { 
	        	
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian3901" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian3902" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian3903" }
	        	
	        	};   	
	  }
	 
	 

	@Test(dataProvider="TC01_OrangeHRM")
	public void Login_Test(String TestURL,String UserName,String Password,String Nationality) throws Exception
	{
		
		TC03_Login_Static_Paarameters1.OpenChromeBrowser();
		TC03_Login_Static_Paarameters1.OpenOrangeHRM(TestURL);
		TC03_Login_Static_Paarameters1.Login(UserName,Password);
		TC03_Login_Static_Paarameters1.AddNationalities(Nationality);
		driver.quit();
	}
	
	//local variables
	public static void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName1);
		findElement(By.name("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
	}
	
	public static void OpenOrangeHRM(String TestURL) throws Exception
	{
		
		driver.get(TestURL);
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
 
	
	
	
	
	
	
	
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	
	
	public static   void AddNationalities(String Nationality1) throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality1);
		findElement(By.id("btnSave")).click();
		
	}
	
	
	
	
	
	

}
