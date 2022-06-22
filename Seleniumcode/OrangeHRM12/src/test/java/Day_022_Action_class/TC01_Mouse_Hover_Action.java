package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class TC01_Mouse_Hover_Action {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	findElement(By.name("txtUsername")).sendKeys("Admin");
	findElement(By.name("txtPassword")).sendKeys("admin123");
	findElement(By.id("btnLogin")).click();
	
	WebElement Admin=findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
	WebElement User_Management=findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	WebElement Users=findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));

	Actions actions = new Actions(driver);
	
	 actions.moveToElement(Admin).
	 moveToElement(User_Management).
	 moveToElement(Users).click().build().perform();
		
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
