package ABC_Demo5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login_Static_Parameters {
	
	static WebDriver driver;
	
	//step1
	String UserName="Admin",Password="admin123";
	String Nationality_text="Indian899";
	
	
	@Test
	public void loginTest() throws Exception
	{
		TC01_Login_Static_Parameters.OpenChromeBroswer();
		TC01_Login_Static_Parameters.Login(UserName,Password); //step2
		TC01_Login_Static_Parameters.AddNationalities(Nationality_text);//stp2
		TC01_Login_Static_Parameters.CloseBrowser();
	}
	
	
	public static void OpenChromeBroswer() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	

	public static  void Login(String UserName1,String Password1) throws Exception //step3
	{
		findElement(By.id("txtUsername")).sendKeys(UserName1);  //step4
		findElement(By.id("txtPassword")).sendKeys(Password1);  //step4
		findElement(By.id("btnLogin")).click();
	}
	

	public static void AddNationalities(String Nationality_text1) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality_text1);//step4
		findElement(By.id("btnSave")).click();
	}
	

	public static void CloseBrowser() throws Exception
	{
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
