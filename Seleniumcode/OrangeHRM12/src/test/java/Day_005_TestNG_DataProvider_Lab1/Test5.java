package  Day_005_TestNG_DataProvider_Lab1;
import CommonUtil.*;
import Day_002_Java.TC05_Login_NonStatic_Paarameters;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Test5
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
		
		Test5 TN1=new Test5();
		
		TN1.OpenChromeBrowser();
		TN1.OpenOrangeHRM(TestURL);
		TN1.Login(UserName,Password);
		TN1.AddNationalities(Nationality);
		TN1.Scrollbar(Nationality);
		TN1.CloseBrowser();
		
		

	}
	
	
	public  void OpenOrangeHRM(String Testurl ) throws Exception
	{
		
		driver.get(Testurl);
	}
	
	
	public  void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	public  void Login(String UserName,String Password) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
	    findElement(By.id("btnLogin")).click();
	}
	
	
	public    void AddNationalities(String Nationality) throws Exception
	{
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();	
	}
	
	public    void Scrollbar(String Nationality) throws Exception
	{
		 WebElement Element1 = findElement(By.linkText(Nationality));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", Element1);	
	}
	
	public    void CloseBrowser() throws Exception
	{
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
	
	
	
	
	
	
	 
	













