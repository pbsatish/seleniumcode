package  Day_014_ParallelMethods;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
public class OrangeHRMTest3
{
	WebDriver driver;
	
	
	
	@Test
	public void TC01_Test1() throws Exception {
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

	
	}
	
	@Test(dependsOnMethods = { "TC01_Test1" })
	public void TC02_Test2() throws Exception {
		
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("Nationalities")).click();
		driver.findElement(By.name("btnAdd")).click();
		
		
		driver.findElement(By.id("nationality_name")).sendKeys("Mexican55");
		
		driver.findElement(By.name("btnSave")).click();
		driver.quit();
		
	}
	
	
}                                                  












