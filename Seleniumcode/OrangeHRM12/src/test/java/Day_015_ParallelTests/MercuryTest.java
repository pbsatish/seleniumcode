package  Day_015_ParallelTests;
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
		driver.get("http://newtours.demoaut.com/");

		//SendKeys
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		//Close Browser		
		driver.quit();
	}
}                                                  












