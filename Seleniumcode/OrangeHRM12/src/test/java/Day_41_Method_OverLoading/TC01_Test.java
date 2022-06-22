package  Day_41_Method_OverLoading;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
public class TC01_Test
{
	WebDriver driver;
	
	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality12.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
	
	
	
	
	@Test(dataProvider = "TC01_Add_Nationality")
	public void Test1(String TestURL,String UserName,String Password,String EmployeeID,String EmployeeStatus) throws Exception {
		
		//OpenChromeBrowser
		driver = TestBrowser.OpenChromeBrowser();

		//OpenUrl
		driver.get(TestURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//SendKeys
		 findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		 
		

		WebElement PIM= driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	 
        js.executeScript("arguments[0].click();", PIM);
   
		
	     Thread.sleep(4000);
		// WebElement EmployeeList=driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
		 
		
	        
	       // JavascriptExecutor js1 = (JavascriptExecutor)driver;
	      //  js1.executeScript("arguments[0].click();", EmployeeList);
	        
	        WebElement EmployeeList1=driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
	        EmployeeList1.click();
		
		 
		 System.out.println("EmployeeID :"+EmployeeID);
		 System.out.println("EmployeeStatus :"+EmployeeStatus);
		 
		 int length = EmployeeID.length();
		 System.out.println("Length of EMployee id :"+length);
		 
		 if(length>0)
		 {
			 System.out.println("Search EmployeeID,EmployeeStatus method invoked");
			 Search_Employee(EmployeeID,EmployeeStatus);
			 
			 
		 }
		 else
		 {
			 System.out.println("Search by only EmployeeStatus method invoked");
			 Search_Employee(EmployeeStatus);
		 }
		 
		
		Thread.sleep(6000);	
		
		//driver.quit();		
	}
	
	
	
	public  void Search_Employee(String employeeID, String employeeStatus) throws Exception {
	
		
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeID);
		
		Thread.sleep(2000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("empsearch_employee_status")));
		dropdown1.selectByVisibleText(employeeStatus);
		
		WebElement SearchButton=driver.findElement(By.id("searchBtn"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;	 
        js1.executeScript("arguments[0].click();", SearchButton);
        
        Thread.sleep(5000);
		
	}
	
	
	public  void Search_Employee(String employeeStatus) throws Exception {
		
			
			Select dropdown1 = new Select(driver.findElement(By.id("empsearch_employee_status")));
			dropdown1.selectByVisibleText(employeeStatus);
			
			
			driver.findElement(By.id("searchBtn")).click();
		}


/*
	public static boolean empty( final String s ) {
		  // Null-safe, short-circuit evaluation.
		  return s == null || s.trim().isEmpty();
		}*/
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public  WebElement findElement(By by) throws Exception {
			
		    WebElement elem = driver.findElement(by);
		    	    
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		        
		  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
		        
		    }
		    return elem;
		}
		
	
		
	 
	
}












