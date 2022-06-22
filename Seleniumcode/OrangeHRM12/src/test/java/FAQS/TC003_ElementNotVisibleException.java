package FAQS;

import java.util.concurrent.TimeUnit;

//http://makeseleniumeasy.com/2017/09/28/handling-elementnotvisibleexception-and-element-is-not-clickable-exception-in-selenium/

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003_ElementNotVisibleException {
	
	
	WebDriver driver;
	
	//https://www.seleniumhq.org/exceptions/stale_element_reference.jsp

	@Test
	public void Open_Mercury1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://platform.drawbrid.ge");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      //  findElement(By.xpath(".//*[@id='_loginButton']")).click();
       // findElement(By.xpath("//div[@class='page']//div[@id='_loginButton']"));
        
       // findElement(By.xpath(".//*[@id='_emailInput1']"));
      findElement(By.xpath(".//*[@id='_loginButton']")).click();
        
        
        
	      
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
