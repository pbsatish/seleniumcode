package  Day_028_WebTable_Examples;
//import MercuryDemoTours;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Nationality
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	
	

	
	public void  Nationality(WebDriver driver)throws Exception
	{  
		this.driver=driver;

	}
	
	
	
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
	
	
	
	
	
	



public   void NationalityDetails(String Nationality )throws Exception
{  
	

	try 
	{
	
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		
	
			findElement(By.id("btnSave")).click();
	
	 
	 

	 
	 	
	
	} 
	catch(Exception e)
	{
		
	}
	 
	
 
}
	
	
		 


		 
}
	


	
	