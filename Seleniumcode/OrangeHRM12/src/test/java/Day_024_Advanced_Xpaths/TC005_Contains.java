package Day_024_Advanced_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC005_Contains {
	
	WebDriver driver;
	
	String Nationality_xpath ="//*[contains(@id,'menu_admin_nationality')]";
	String Nationality_xpath1 ="//*[contains(text(),'Nationalit')]";
	
	@Test
	public void Test1()throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();			
		
		findElement(By.linkText("Admin")).click();	
		
		findElement(By.xpath(Nationality_xpath1)).click();
		

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
