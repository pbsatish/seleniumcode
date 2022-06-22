//import MercuryDemoTours;

package Day_028_WebTable_Examples;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest3;
import ExcelUtil.ExcelApiTest4;

import org.testng.annotations.Test;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

/*
1. Open Chrome browser
2. open Orange Application urL
3. login
4. Navigate to employee screen
5. Export Employees to Excel sheet
5. logout and Quit
*/
 
public class TC01_Add_Nationalities
{
	public String UserName,Password;
	public String Nationality;

	
	
	public  int iRow=0;
	
	WebDriver driver;

	
	
	
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
	public  void TC01_Nationality( )throws Exception
	{  
		

	    driver=TestBrowser.OpenChromeBrowser();
			
		
			 ExcelApiTest4 eat = new ExcelApiTest4();
			 int numberowsInputdata=eat.getRowCount("C://HTML Report//OrangeHRM6//TC01_Nationality9.xlsx","Sheet1");

				 for(int i=1;i<numberowsInputdata;i++)
				 {		 
					 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality9.xlsx","Sheet1",i,0);
					 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality9.xlsx","Sheet1",i,1);
					 Nationality=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality9.xlsx","Sheet1",i,2);
					 iRow=i;
					 call_allmethods(iRow);
				 }
			
				 driver.quit();
				 
	}
	
				 
				 
				 public void call_allmethods(int iRow )throws Exception
					{  
						
					 
							if(iRow==1)
							{
							
								Login l1=new Login();
								l1.Login(driver);
								l1.openOrangeHRM();
								l1.OrangeHRMlogin(UserName,Password);
								l1.OrangeHRMSigninClick();
							
								Nationality N1=new Nationality();
								N1.Nationality(driver);
								N1.NationalityDetails(Nationality);
								
								iRow=iRow+1;
								
							}
							else
							{
								iRow=iRow+1;
								
								Nationality N1=new Nationality();
								N1.Nationality(driver);
								N1.NationalityDetails(Nationality);
								
							}
				
						System.gc();
						
						
					}
					
				 

					
					

}
				        
					
					
				
					
					
					
					
						
		





















						
						


	