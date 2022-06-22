package  Day_023_File_Upload_Download;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

 
public class TC02_AddPhoto_Existing_Employee
{
	 WebDriver driver;
	
	@DataProvider (name = "TC01_Add_Employee_Data")
    public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest4 eat= new ExcelApiTest4();
        Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC02_Photo.xlsx","Sheet1");
         System.out.println(testObjArray.length);
          return (testObjArray); 
	}
	
	@Test(dataProvider="TC01_Add_Employee_Data")
	public   void AddEmployee_call_allmethods(
			String UserName,String Password,String EmployeeId,String PhotoPath  )throws Exception
	{  
			
	     	driver=TestBrowser.OpenChromeBrowser();
	     	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
			OrangeHRMlogin(UserName,Password);
			Existing_Employee(EmployeeId);
			PhotoUpload(PhotoPath);

			driver.quit();
	}	
	
	
	
	 
	 
	 
	 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
	 {
		 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
		 findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
		 findElement(By.xpath(OR.login_click)).click();
			
	 }
	 
	 
		public   void Existing_Employee( String Empid)throws Exception
		{  
			 findElement(By.linkText("PIM")).click();	
			 findElement(By.linkText("Employee List")).click();
			 findElement(By.id("empsearch_id")).sendKeys(Empid);
			 findElement(By.id("searchBtn")).click();
			 findElement(By.linkText(Empid)).click();
			 findElement(By.id("empPic")).click();
			 
				//*[@id="photofile"]
			   findElement(By.xpath("//*[@id='photofile']")).click();
			   Thread.sleep(1000);
				
		}
		
		
		
	
	
	
	
	public   void PhotoUpload(String PhotoPath)throws Exception
	{
		// Specify the file location with extension
		// StringSelection sel = new StringSelection("C:\\Users\\Sudhakar\\Desktop\\download1.jpg");
		 
		 StringSelection sel = new StringSelection(PhotoPath);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 //Thread.sleep(2000);
		 
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
	
		findElement(By.id("btnSave")).click();
		
		
		Thread.sleep(10000);
		 

		 
		
		
	}
	
	
	
	
	

	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



