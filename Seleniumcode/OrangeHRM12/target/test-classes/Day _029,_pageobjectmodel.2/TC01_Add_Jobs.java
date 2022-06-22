
package  Day_029_PageObjectModel;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
public class TC01_Add_Jobs
{
	WebDriver driver;
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();  //driver=112311
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	
	

	
	@Test
	public void Book_OneWay_Flight() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		JobsPsage J1= new JobsPsage();
		J1.JobsPsage(driver);
		J1.AddJobs();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {	
		driver.quit();
	}
	
	
	
}












