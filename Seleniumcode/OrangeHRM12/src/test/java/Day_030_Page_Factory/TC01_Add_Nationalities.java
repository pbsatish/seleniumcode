package  Day_030_Page_Factory;

import org.testng.annotations.Test;

import CommonUtil.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class TC01_Add_Nationalities
{
	WebDriver driver;
	
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	@Test
	public void Book_OneWay_Flight() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		Nationalities N1= new Nationalities();
		N1.Nationalities(driver);
		N1.AddNationality();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
		
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {
		
		driver.quit();
	}
	
	
	
}












