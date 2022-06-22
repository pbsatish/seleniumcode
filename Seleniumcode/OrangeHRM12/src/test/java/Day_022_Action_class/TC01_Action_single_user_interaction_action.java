package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;

import org.testng.annotations.Test;

public class TC01_Action_single_user_interaction_action {
	
	
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
	//findElement(By.id("btnLogin")).click();
	
	WebElement Login_Button=findElement(By.id("btnLogin"));
	
	Actions builder = new Actions(driver);
    //Action mouseOverHome = builder.moveToElement(Login_Button).build().perform();

	
	
	
	
	
		
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
