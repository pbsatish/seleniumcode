package  Day_032_TestNG_Groups;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class AllTests
{
	
	
	@Test(groups = { "checkintest" })
	public void OrangeHRM() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.close();
	}
	
	
	@Test(groups = { "functest" })
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
		driver.close();
	}
	
	
	
	
	@Test(groups = { "functest","GoogleGroup" })
	public void Google() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://www.google.co.in/?gws_rd=ssl");

		//SendKeys
	
		
		//Close Browser		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}                                                  












