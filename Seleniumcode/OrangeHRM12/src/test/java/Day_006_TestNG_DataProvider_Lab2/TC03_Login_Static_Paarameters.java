package Day_006_TestNG_DataProvider_Lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

public class TC03_Login_Static_Paarameters {
	
	
	static WebDriver driver;
	
	//Global Variables
	//static String UserName="Admin", Password="admin123";
	//static String Nationality="Mexican99";
	
	
	@DataProvider(name = "OrangeHRM")
	  public static Object[][] Test1() throws Exception {
	 
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
		
	  }
	
	@Test (dataProvider="OrangeHRM")
	public void Login_Test(String TestURL,String UserName,String Password,String Nationality) throws Exception
	{
		
		TC03_Login_Static_Paarameters.OpenChromeBrowser();
		TC03_Login_Static_Paarameters.OpenOrangeHRM(TestURL);
		TC03_Login_Static_Paarameters.Login(UserName,Password);
		TC03_Login_Static_Paarameters.AddNationalities(Nationality);
		driver.quit();
	}
	
	
	
	//local variables
	public static void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName1);
		findElement(By.name("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();
	}
	
	public static   void AddNationalities(String Nationality1) throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality1);
		findElement(By.id("btnSave")).click();
		
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
 
	
	
	
	
	
	public static void OpenOrangeHRM(String TestURL) throws Exception
	{
		
		driver.get(TestURL);
	}
	
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
