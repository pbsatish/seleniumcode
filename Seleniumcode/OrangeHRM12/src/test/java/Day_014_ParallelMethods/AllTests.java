package  Day_014_ParallelMethods;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class AllTests
{
	
	
	@Test
	public void OrangeHRM() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.quit();
	}
	
	
	@Test
	public void Mercury() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("http://newtours.demoaut.com/");

		//SendKeys
		driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		
		//Close Browser		
		driver.quit();
	}
	
	
	
}                                                  












