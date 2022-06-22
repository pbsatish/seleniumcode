package  Day_013_TestNG_Paraneters1;
import CommonUtil.*;

import org.openqa.selenium.JavascriptExecutor;


import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class BrowserTesting_DataProvider3
{
	
	WebDriver driver;
	Reporter1 R1;
	public static int iRow = 0;

	@Parameters({"Browser"})
	@BeforeTest
	public void OpenBrowser(String browser) throws Exception {


		if(browser.equalsIgnoreCase("Chrome")){
			driver = TestBrowser.OpenChromeBrowser();
			System.out.println("Chrome Brwoser Started :"+browser);
		}
		
		else if(browser.equalsIgnoreCase("IE")){
			driver = TestBrowser.OpenIEBrowser();
			
		}
		
		else if(browser.equalsIgnoreCase("FireFox")){
			driver = TestBrowser.OpenFirefoxBrowser();
		
		}
		
		else
		{
			driver = TestBrowser.OpenChromeBrowser();
			System.out.println("Chrome Brwoser Started :"+browser);
		}
		
	}
	


@DataProvider(name = "TC01_Sample")
public static Object[][] Authentication1() throws Exception {

	ExcelApiTest4 eat = new ExcelApiTest4();
	Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Sample.xlsx", "Sheet1");
	System.out.println(testObjArray.length);
	return (testObjArray);
}

	
	@Test(dataProvider = "TC01_Sample")
	public void Test3(String TestURL,String UserName,String Password,
			String Nationality) throws Exception {
		
		if (iRow==0)
		{
			//iRow++;
			iRow=iRow+1;
			
			String str= "TC01_Nationality".concat("_Iterration_").concat(String.valueOf(iRow)) ;
			R1= new Reporter1(driver,str);	
			
			 driver.get(TestURL);
			 R1.TakeScreenShotAuto(driver,"Open chrome Browser and URL ","Pass");
			 
			 
			 enter_login_details(UserName,Password);
			 AddNationalities(Nationality);
			
		}
		
		else
		{
			//iRow++;
			iRow=iRow+1;
			
			String str= "TC01_Nationality".concat("_Iterration_").concat(String.valueOf(iRow)) ;
			R1= new Reporter1(driver,str);	
			
			AddNationalities(Nationality);
			
			
			
		}
		
			

	}
	
	
	
	
	@AfterTest
	public void CloseBrowser() throws Exception 
	{
		driver.quit();
	}
	
	
	
	public void enter_login_details(String UserName,String Password) throws Exception {
		
		findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
		R1.TakeScreenShotAuto(driver,"UserName Entered","Pass");
	
		
		findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
		R1.TakeScreenShotAuto(driver,"Password Entered","Pass");

		findElement(By.xpath(OR.login_click)).click();
		R1.TakeScreenShotAuto(driver,"Sign In  Clicked","Pass");

	
	}
	
	
	public void AddNationalities(String Nationality) throws Exception {
	
	 findElement(By.xpath(OR.Admin_focus));
	 R1.TakeScreenShotAuto(driver,"Clicked on Admin ","Pass");
	 
	 findElement(By.xpath(OR.Admin_focus)).click();
	 
	 findElement(By.xpath(OR.Nationality_link));
	 R1.TakeScreenShotAuto(driver,"Clicked on Nationality ","Pass");
	 findElement(By.xpath(OR.Nationality_link)).click();

	 findElement(By.xpath(OR.Nationality_add)).click();
	 R1.TakeScreenShotAuto(driver,"Clicked on Nationality Add ","Pass");
	 
	 findElement(By.xpath(OR.Nationality_sendkeys)).sendKeys(Nationality);
	 R1.TakeScreenShotAuto(driver,"Entered Nationality Text","Pass");
	 
	 findElement(By.xpath(OR.Nationality_click)).click();
	 R1.TakeScreenShotAuto(driver,"Clicked on Nationality Save","Pass");
	 
	
	WebElement Element2 = findElement(By.linkText(Nationality));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", Element2);
	
	R1.TakeScreenShotAuto(driver,"Scroll Nationality ","Pass");
	
	}
	
	

	
	
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public WebElement findElement(By by) throws Exception {
		WebElement elem = driver.findElement(by);

		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		}
		Thread.sleep(10);

		return elem;
	}
	
	
	

	
	
	
	
}












