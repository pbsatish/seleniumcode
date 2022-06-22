package  HTMLReport;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.testng.Reporter;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class Reporter2
{
	
	WebDriver driver;
	
	
	
	
	
@Test
	public void Test1() throws Exception {
		
		//Stepcount=0;
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		//Reporter.log("The browser launched1");
		//TakeScreenShotAuto(driver);
		//TakeScreenShotAuto(driver,"OpenBrowser","Pass");

		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		//TakeScreenShotAuto(driver,"UserName Entered","Pass");
		Reporter.log("Enter User Name");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		//TakeScreenShotAuto(driver,"Password Entered","Pass");
		Reporter.log("Enter Password Name");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		//TakeScreenShotAuto(driver,"Sign In  Clicked","Fail");
		//TakeScreenShotAuto(driver);
		Reporter.log("sign in clicked");
		//Reporter.log("<a href='file:///C:/Users/anbajaj/Desktop/test.xml'>Response</a>"); 


	}
	
	
	
	
}












