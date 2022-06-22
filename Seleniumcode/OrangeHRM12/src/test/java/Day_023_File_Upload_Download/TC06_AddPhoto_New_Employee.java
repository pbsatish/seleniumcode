package  Day_023_File_Upload_Download;
import CommonUtil.*;
//import HTMLReport.TestHTMLReporter8;
//import HTMLReport.TestHTMLReporter8;
import ExcelUtil.ExcelApiTest3;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.interactions.Actions;

 
public class TC06_AddPhoto_New_Employee
{

 public  static 	String UserName, Password ;
 public  static String FirstName, MiddleName, LastName, Id, PhotoPath;
	
	public static int iRow=0;

	
	 WebDriver driver;
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by)throws Exception {
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	    Thread.sleep(10);
	    
	    return elem;
	}
	
	

	
    
	
	


	@DataProvider (name = "TC01_Add_Employee_Data")
    public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest3 eat= new ExcelApiTest3();
        Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_AddEmp.xls","Sheet1");
         System.out.println(testObjArray.length);
          return (testObjArray); 
	}
	
	
	@Test(dataProvider="TC01_Add_Employee_Data")
	public   void AddEmployee_call_allmethods(
			String UserName,String Password,String FirstName,
			String MiddleName,String LastName,String Id,String PhotoPath  )throws Exception
	{  
			
	     	driver=TestBrowser.OpenChromeBrowser();

			openOrangeHRM();
			OrangeHRMlogin(UserName,Password);
			//addEmpdetails(FirstName, MiddleName,LastName,Id);
			Existing_Employee();
			PhotoUpload(PhotoPath);
			driver.quit();

	}	
	
	
	
	 
	 public   void openOrangeHRM()throws Exception
	 {

		 driver.get("https://opensource-demo.orangehrmlive.com/");
		

	 }
	 
	 
	 
	 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
	 {
		 

		 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
		 findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
		 findElement(By.xpath(OR.login_click)).click();
			
	 }
	 
	 

	 
	

	
	
	 public   void CloseBrowser() throws Exception 
	 {
		
			 TestBrowser.CloseBrowser(driver);

	 }
	
	
	

	
	
	
	
	
	
	public   void PhotoUpload(String PhotoPath)throws Exception
	{
		
		
	   findElement(By.xpath("//*[@id='photofile']")).click();

	
		Thread.sleep(1000);
		 
		// Specify the file location with extension
		// StringSelection sel = new StringSelection("C:\\Users\\Sudhakar\\Desktop\\download1.jpg");
		 
		StringSelection sel = new StringSelection(PhotoPath);
		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(2000);

		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		        
		       //  Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(8000);
	
		findElement(By.xpath(OR.Emp_save_click)).click();
		
		
		Thread.sleep(8000);
		 

		 
		
		
	}
	
	
	


	public   void addEmpdetails(String FirstName,String MiddleName,String LastName,String Id )throws Exception
	{  
				
		 Actions actions = new Actions(driver);   
		 WebElement ele=findElement(By.xpath(OR.Emp_Pim_focus1));
		 actions.moveToElement(ele).click().perform();

		 findElement(By.xpath(OR.Emp_list_focus)).click();
         findElement(By.xpath(OR.Emp_pimadd_click)).click();
		 findElement(By.xpath(OR.Emp_firstname_sendkey)).sendKeys(FirstName);
		 findElement(By.xpath(OR.Emp_middlename_sendkey)).sendKeys(MiddleName);
	     findElement(By.xpath(OR.Emp_lastname_sendkey)).sendKeys(LastName);
		 findElement(By.xpath(OR.Emp_id_sendkey)).sendKeys(Id);
	
		 
	}
	
	
	public   void Existing_Employee( )throws Exception
	{  
		findElement(By.linkText("PIM")).click();	
		 findElement(By.linkText("Employee List")).click();
		 findElement(By.id("empsearch_id")).sendKeys("0002");
		 findElement(By.id("searchBtn")).click();
		 
		 findElement(By.linkText("0002")).click();
		 findElement(By.id("empPic")).click();
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



