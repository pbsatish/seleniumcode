package Day_024_Advanced_Xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC011_Parent {
	
	WebDriver driver;
	
	
	@Test
	public void Test1()throws Exception
	{
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		
		findElement(By.xpath("//*[@id='txtUsername']//parent::div[1]" ));
		Thread.sleep(5000);
		findElement(By.xpath("//*[@id='txtUsername'] "));
							
		Thread.sleep(5000);

		findElement(By.xpath("//*[@id='txtPassword']//parent::div[1]"));
		Thread.sleep(5000);
		findElement(By.xpath("//*[@id='txtPassword'] "));

		
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
