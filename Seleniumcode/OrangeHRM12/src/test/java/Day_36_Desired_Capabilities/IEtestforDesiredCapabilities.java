package  Day_36_Desired_Capabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.testng.annotations.*;

import Day_034_TestNG_Listeners.TestBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEtestforDesiredCapabilities
{
	WebDriver driver;
	
	@Test
	public void Open_OrangeHRM() throws Exception {

		 
		 driver= TestBrowser.OpenChromeBrowser();
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");		
			
		 ChromeOptions options = new ChromeOptions();
		 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			
			driver = new ChromeDriver(options);
			driver.get("http://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();

		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.id("txtUsername")).click();
		findElement(By.id("txtUsername")).clear();
		findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		findElement(By.id("btnLogin")).click();
		
		
		
		
		//driver.quit();
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












