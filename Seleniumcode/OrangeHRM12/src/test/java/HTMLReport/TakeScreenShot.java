package  HTMLReport;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import java.text.SimpleDateFormat;

import org.testng.annotations.*;
import java.io.File;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import java.util.*;

public class TakeScreenShot
{
	
	WebDriver driver;
	
	String OutputFolder,TestName="Test11";
	
	
	@BeforeTest
	public void Create_Output_Folder()throws Exception {
		

	SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	Date now5 = new Date();
	String strDate6 = sdfDate5.format(now5);
	
	String OutputFolder1 ="D:\\HTML Report";
	OutputFolder = OutputFolder1 	+ "\\" + "New_Folder_" +  strDate6;
	
	}
	
	@Test
	public void Test11() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = " https://opensource-demo.orangehrmlive.com/";
		TakeScreenShotAuto(driver);
		
		driver.get(TestURL);
		TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		TakeScreenShotAuto(driver);
		
		driver.quit();

	}
	
	
	
	public void TakeScreenShotAuto(WebDriver driver) throws Exception
	{
		
	
	 //Timestamp  append for .png file
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
	 Date now = new Date();
	 String strDate = sdfDate.format(now);
	 
	 //Takes screenshot
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	 //Move image file to new destination
	 String fileWithPath= OutputFolder +"\\"+TestName+"_"+strDate +".png";
	 File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);

	}
	
	
	
	

}












