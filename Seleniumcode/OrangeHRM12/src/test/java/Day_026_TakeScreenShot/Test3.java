package Day_026_TakeScreenShot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Test3 {
	
	static WebDriver driver;


	
	
	@Test
	public void AddNationalitiess() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Test3.TakeScreenShotAuto(driver);
	
	findElement(By.id("txtUsername")).sendKeys("Admin");
	Test3.TakeScreenShotAuto(driver);
	
	findElement(By.name("txtPassword")).sendKeys("admin123");
	Test3.TakeScreenShotAuto(driver);
	
	findElement(By.name("Submit"));
	Test3.TakeScreenShotAuto(driver);
	findElement(By.name("Submit")).click();
	
	driver.quit();
		
	}
	
	
	
	public static void TakeScreenShotAuto(WebDriver driver) throws Exception
	{
		
		
	String TestName="Test12";	
		
	 //Takes screenshot
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	 
	 
	 //Timestamp  append for .png file
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a"); 
	 Date now = new Date();
	 String strDate = sdfDate.format(now);
	 
	

	     
	 //Destination path 
	 String ImagedestPath= "C:\\HTML Report\\test-output\\TempScreenShots\\"+TestName+"\\"+TestName+"_"+strDate +".png";
	 File DestFile=new File(ImagedestPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("Screen Shot Path : "+ScreenShotPath);
	
	}
	
	
	
	
	
	
	
	
	
	 public  static WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	
	
	
	
	
	
	
	
	
	

}
