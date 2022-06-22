package Day_024_Advanced_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC004_Text {
	
	WebDriver driver;
	
	//String Nationality_xpath ="//a[text()='Nationalities']";
	//String Nationality_xpath1 ="//*[text()='Nationalities']";
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	//<input name="txtUsername" id="txtUsername" type="text">
	
	//input[@name='txtUsername'  and  @id='txtUsername']
	
	//String Login_Xpath="//*[@type='submit' or @name='btnReset']";
	String 	Login1_Xpath1="//input[@type='submit' and @name='Submit']";

	
	@Test
	public void Test1()throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.xpath(Login1_Xpath1)).click();	
	
		findElement(By.xpath("//b[text()='Admin']")).click();
		findElement(By.xpath("//a[text()='Nationalities']")).click();
		    

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
