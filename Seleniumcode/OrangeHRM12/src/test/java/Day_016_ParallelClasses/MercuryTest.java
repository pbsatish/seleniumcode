package  Day_016_ParallelClasses;
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
		driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		
		//Close Browser		
		driver.quit();
	}
}                                                  












