package  Day_008_Emailable_Report;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestExample1
{
	
	static WebDriver driver;
	
	
	@BeforeTest
	public void Test1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
	}
	
	
	@Test
	public void Test2() throws Exception {
		
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	    Reporter.log("Pass- open Orangehrm1");
		
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name1");
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password1");
		
		driver.findElement(By.xpath(OR.login_click)).click();
		Reporter.log("Pass- Click on Signin1");
	
	}
	
	
	
	@AfterTest
	public void Test3() throws Exception {
		
		driver.close();
		
	}
	
	
	
	
	

}












