package Day_007_TestNG_DataProvider_Lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;



public class TC02_Login_Static_Paarameters {
	
	
	static WebDriver driver;
	
	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality2.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
 

	@Test(dataProvider="TC01_Add_Nationality")
	public void Login_Test(String Browser,String TestURL,String UserName,String Password,String Nationality) throws Exception
	{
		
					if(Browser.equalsIgnoreCase("Chrome"))
					{
						driver = TestBrowser.OpenChromeBrowser();
					 	
				    }

					if(Browser.equalsIgnoreCase("FireFox"))
					{
							driver = TestBrowser.OpenFirefoxBrowser();
							Thread.sleep(10000);
					}
					
			
		TC02_Login_Static_Paarameters.OpenOrangeHRM(TestURL);
		TC02_Login_Static_Paarameters.Login(UserName,Password);
		TC02_Login_Static_Paarameters.AddNationalities(Nationality);
		driver.quit();
	}
	
	
	
	public static void Login(String UserName,String Password) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.id("btnLogin")).click();

	}
	

	
	public static void OpenOrangeHRM(String Testurl) throws Exception
	{
		
		driver.get(Testurl);
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
 
	
	
	
	
	
	
	public static   void AddNationalities(String Nationality) throws Exception
	{
		
		 
		//findElement(By.linkText("Admin")).click();
		
	    /* Actions actions = new Actions(driver);   
	     WebElement ele=driver.findElement(By.linkText("Admin"));
	     WebDriverWait wait=  new WebDriverWait(driver,30);
	     wait.until(ExpectedConditions.visibilityOf(ele));
		 actions.moveToElement(ele).click().build().perform(); */
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Admin")).click();
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;		
		 WebElement button =findElement(By.linkText("Admin"));	
	      js.executeScript("arguments[0].click();", button);
		
			Thread.sleep(5000);
	
		findElement(By.linkText("Nationalities")).click();
		Thread.sleep(7000);
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();
		
	}
	
	
	
	
	
	

}
