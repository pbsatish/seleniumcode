package SamSung;

import org.testng.annotations.Test;




import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
public class Folders123 {
	
    public static String baseUrl = "https://www.amazon.in/";
    public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static WebDriver driver ; 
    public static String TestName="";
    public  String sTargetTestCasePath="",FolderPath="";
  
    /*
 public synchronized  static void CreateFolder(String TestName,String BrowserType)
 
 {
		try {
	
			List<String> Myarray1 = Folders123.Hello(TestName,BrowserType); // KeyImp
			sTargetTestCasePath=Myarray1.get(0);
			FolderPath=Myarray1.get(1);
			
			System.out.println("Dynamic Test Case Sheet Path .xls ***  :"+sTargetTestCasePath);
			System.out.println("Folder Path *** :"+FolderPath);
			  	 	 		
		 	//takeSnapShot(driver,sTargetTestCasePath,TestName,Row,Column,FolderPath);
		 	}catch (Exception e) {
			e.printStackTrace();
			}
	
 }
  */
  

 


  //Hello starts
  public  ArrayList<String>   CreateFolder(String TestName,String  BrowserType)
  {

	      ArrayList<String> myArray = new ArrayList<String>();
	     
	      String sheetpath1="";
	  	  SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
		  Date now1 = new Date();
		  String strDate1 = sdfDate1.format(now1);
		  String folderPath="";
		  String TestCase1;
		 
		 //starts create directory if not exists
		
		  //TestCase1="TC147_Amazon";
		  TestCase1=TestName;
		  System.out.println ("Class Name :"+TestCase1);
			  
		 String folderPath1=TestCase1;
		 String Path5=BrowserType+"_"+TestCase1+"_" +strDate1;
		 folderPath="E:\\Batch2\\"+TestCase1+"\\"+Path5;
		// System.out.println ("folderPath is :"+folderPath);
	
		 
		//Path path = Paths.get("E:\\TC04");
		 Path path = Paths.get(folderPath);
	  
		 if (!Files.exists(path)) {
		  
			      try {
			          Files.createDirectories(path);     
			      } catch (IOException e) {
			         
			          e.printStackTrace();
			      }
	  }// if condition closed
		
	 // --------Folder creation completed---------
		 
		 	  
	  // start Store Test Results in below excel
	  try {
		  
		  System.out.println ("Block started Name :"+TestCase1);
	      ExcelApiTest3 eat = new ExcelApiTest3();
	      //  TestCase1=this.getClass().getSimpleName();
	      // TestCase1="TC147_Amazon";
	      
	  String sheetpath="E://Batch2Source//TestCases From Manual Testing Team//"+TestCase1+".xls";
	  sheetpath1=folderPath+"\\"+Path5+".xls";
	  System.out.println ("sheetpath1 Name 12345666 :"+sheetpath1);
	  
	  //eat.CopyWorkBook(sheetpath,"E://TC11.xls");
	  eat.CopyWorkBook(sheetpath,sheetpath1);
	  
	  System.out.println ("Block ended Name :"+TestCase1);

	  
	  TestCase1=sheetpath1;
	  folderPath1=folderPath+"\\"+Path5;
	 System.out.println("folder path : "+folderPath1);
	  }catch (Exception e){}
	  
	  // end Store Test Results in below excel
	  
	  	myArray.add(sheetpath1);
	  	myArray.add(folderPath);
		
	  	return myArray;
	
  }
  
  //Hello Ends	  
  
  
  

//Folders123.takeSnapShot(driver,sTargetTestCaseExcelPath,"TC147_Amazon",1,7,sTargetFolderPath);
	
  
//Method starts takeSnapShot
public   void takeSnapShot(WebDriver webdriver,String SheetPath1,String TestClassName,int rownum,int column,String FolderPath)

//public synchronized static  void takeSnapShot(WebDriver webdriver,String TestClassName,int rownum,int column)

{
	
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//dd/MM/yyyy
	     Date now = new Date();
	     String strDate = sdfDate.format(now);
		 
	     //System.out.println("Test Case Name:"+TestCaseName);
	     System.out.println("__Folder Path__:"+FolderPath);
	     System.out.println("___TestClassName__ :"+TestClassName);
	     
	     //String str="E:\\"+TestClassName+sampletext+"_" +strDate +".png";
	     String str= FolderPath+"\\" +TestClassName+"_"+strDate +".png";
	     String fileWithPath=str;
	   
	   	   
	      //Convert web driver object to TakeScreenshot
		  System.out.println("Function Invoked !");
	      TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	      //Call getScreenshotAs method to create image file
	      File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	      //Move image file to new destination
	      File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
           //put cell formula starts
	        try {
	          	 	ExcelApiTest3 eat = new ExcelApiTest3();
	          	 	// String sheetpath="E://"+TestCaseName+".xls";
	          	 	//String sheetpath=SheetPath1;
	          		String sheetname="Sheet1";
	          		
	          		 System.out.println("sTargetTestCasePath :"+sTargetTestCasePath);
	          		 System.out.println("Function Invoked ! :"+fileWithPath);
	          	    eat.PutCellFormula(sTargetTestCasePath,sheetname,rownum,column,fileWithPath);
	          	  
	          	 //   eat=null;
	        
	        
	        } catch (Exception e) {
	          				e.printStackTrace();
	          	}
	         //put cell formula ends
	            

	 }//Method ends takeSnapShot
	 
  




// starts TC148_Amazon folder creation  
	public static void FolderCreation(String sTestCaseName1)
	{
		
		OR.sTestCaseName=sTestCaseName1;
		System.out.println("Test Script Execution started for :" + OR.sTestCaseName);	
		
	    // TC147_Amazon folder creation starts
	//	Folders123.CreateFolder(OR.sTestCaseName);
		//System.out.println("AT 95 Line");
		try {
				//List<String> Myarray1 = Folders123.Hello(OR.sTestCaseName,"Dummy"); // KeyImp
			//	OR.sTargetTestCaseExcelPath=Myarray1.get(0);
			//	OR.sTargetFolderPath=Myarray1.get(1);
				System.out.println("AT 100 Line");
				}catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	 // TC148_Amazon folder creation ends






}
