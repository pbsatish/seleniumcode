package Day_022_Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC03_Context_Menu {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	
	
	WebElement RButton=findElement(By.xpath("//span[text()='right click me']"));
	
	Actions actions = new Actions(driver);
	actions.contextClick(RButton).perform();
	
	
	
	findElement(By.xpath("//span[text()='Quit']")).click();
	
    Alert alert = driver.switchTo().alert();
    
    Thread.sleep(1000);
    
    //alert.accept();
    alert.dismiss();
		
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
