package  Day_023_File_Upload_Download;
import org.openqa.selenium.By;	

import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
public class TC05_DeleteFile
{
	static WebDriver driver;
	 
		public String DestinationFile;
		
		//public  int iRow;
		
		// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		    
		    
		    
		}
	 	
	    
	   

	    @Test
		public void File_Download()throws Exception
		  {
			
			//SendKeys
	    	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				 driver =new ChromeDriver();
				 driver.manage().window().maximize() ;	
				 driver.get("https://opensource-demo.orangehrmlive.com/");
	    	
				findElement(By.id("txtUsername")).sendKeys("Admin");
				findElement(By.id("txtPassword")).sendKeys("admin123");
				findElement(By.id("btnLogin")).click();
				
			 	 findElement(By.linkText("PIM")).click();
			 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
			 	 findElement(By.linkText("John")).click();
			 	 
			 	  findElement(By.name("chkattdel[]")).click();
			 	  Thread.sleep(500);
				  findElement(By.id("btnDeleteAttachment")).click();
				   

				
					Thread.sleep(3000);
					
					
					 
			 	 
		  }	 	 
			 	 
	
	

	
	}