package  Day_35_Execute_Failed_TestCases;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class OrangeHRMTest
{
	WebDriver driver;
	
	@Test
	public void Open_OrangeHRM() throws Exception {
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.quit();
	}
	
}                                                  












