package  Day_008_Emailable_Report;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestExample
{
	
	WebDriver driver;
	@Test
	public void Test1() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(TestURL);
	    Reporter.log("Pass- open Orangehrm");
	    
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password");
		
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Pass- Click on Signin");
		
		driver.close();
	
	}

}












