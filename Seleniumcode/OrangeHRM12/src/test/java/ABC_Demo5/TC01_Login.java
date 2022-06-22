package ABC_Demo5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	
	@Test
	public void loginTest() throws Exception
	{

		TC01_Login T1 = new TC01_Login();
		
		T1.OpenChromeBroswer();
		T1.Login();
		T1.AddNationalities();
		T1.CloseBrowser();
	}
	
	
	public void OpenChromeBroswer() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	

	public void Login() throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
	}
	

	public void AddNationalities() throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("INDIAN792");
		findElement(By.id("btnSave")).click();
	}
	

	public void CloseBrowser() throws Exception
	{
		driver.quit();
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

	

}
