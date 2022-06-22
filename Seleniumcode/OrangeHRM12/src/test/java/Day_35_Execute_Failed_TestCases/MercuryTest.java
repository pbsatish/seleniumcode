package  Day_35_Execute_Failed_TestCases;
import org.testng.annotations.Test;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
public class MercuryTest
{
	WebDriver driver;

	@Test
	public void Open_Mercury() throws Exception {
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("http://google.co.in/");

		//SendKeys
		//driver.findElement(By.xpath("//input[@type='text'and @name='userName']")).sendKeys("mercury");
		//driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("mercury");
		
		//Close Browser		
		driver.quit();
	}
}                                                  












