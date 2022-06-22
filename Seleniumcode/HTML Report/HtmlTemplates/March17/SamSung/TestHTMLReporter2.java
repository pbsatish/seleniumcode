package SamSung;
//import MercuryDemoTours;


import org.testng.annotations.Test;

import MercuryDemoTours.OR;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
import SamSung.*;

import java.awt.Desktop;
import java.io.*;



public class TestHTMLReporter2 {
	
	
	WebDriver driver;
	public  void TestHTMLReporter2(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	
	
	//Html Report Prerequisite settings starts
	public String HtmlSourceTemplate ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlReport3.html";
	public String ClientLogo ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\PASS_FAIL\\Logo.JPEG";
	public String PassIcon  ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\PASS_FAIL\\passed.ico";
	public String FailIcon  ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\PASS_FAIL\\failed.ico";
	public String HtmlOutputFolder ="C:\\Users\\sudhakar\\Desktop\\HTML Report";
	//Html Report Prerequisite settings ends
	
	
	
	
	public String DynamicHtmlOutputFileFolderPath13="";
	public String TestName1=""; 
	public int SNo;
	
		@Test
		public  void MyHtml() throws Exception {

		     String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
			 
			  TestHTMLReporter2 TH= new TestHTMLReporter2();	  
			  String HtmlOutputFileName= TH.CretaeHTMLFile("TC01_Add Employee","Chrome");
			  
			  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		
	
			  
			     ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
			 	 System.setProperty("webdriver.chrome.driver",driverPath);
			 	 driver = new ChromeDriver(options); 
			 	 driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
			 	
			 	
			 	 TH.TestHTMLReporter2(driver);
			 	 
			 	driver.manage().window().maximize() ;	
			 	TH.HTMLScreenShot("Open Browser","	Succefully Opened","Pass", HtmlOutputFileName);
			  
			  driver.get("http://www.newtours.demoaut.com/");
			  TH.TestHTMLReporter2(driver);
			  
			  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName);
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Fail", HtmlOutputFileName);
			
			 
			  HTMLCloser(HtmlOutputFileName);
			  driver.quit();
			
		}
		
		
		@Test
		public  void MyHtm2() throws Exception {

		     String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
			 
			  TestHTMLReporter2 TH= new TestHTMLReporter2();	  
			  String HtmlOutputFileName= TH.CretaeHTMLFile("TC02_Add Employee","Chrome");
			  
			  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		
	
			  
			     ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
			 	 System.setProperty("webdriver.chrome.driver",driverPath);
			 	 driver = new ChromeDriver(options); 
			 	 driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
			 	
			 	
			 	 TH.TestHTMLReporter2(driver);
			 	 
			 	 driver.manage().window().maximize() ;	
			 	 TH.HTMLScreenShot("Open Browser","	Succefully Opened","Pass", HtmlOutputFileName);
			  
			  driver.get("http://www.newtours.demoaut.com/");
			  TH.TestHTMLReporter2(driver);
			  
			  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName);
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Fail", HtmlOutputFileName);
			
			 
			  HTMLCloser(HtmlOutputFileName);
			  driver.quit();
			
		}
		
		
		
		
		public void HtmlTableHeader(String HtmlOutputFileName,String TestName , String BrowserType) throws Exception
		{
			
			FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
			
			
			 SimpleDateFormat sdfDate1 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
			 Date now1 = new Date();
			 String strDate1 = sdfDate1.format(now1);
			
/*
			fw.write("\n <table id=customers1>");	
			fw.write("\n <th   width=\"90%\"  >");
			fw.write("\n <th width=\"10%\">"
					+ "<img src=\""
					+ ClientLogo
					+ "\" alt=\"FAIL\"></th> ");
			fw.write("\n </table>");
			*/
		
			fw.write("\n <table id=customers1>");		
			fw.write("\n <th width=\"25%\"> Test Name : "
					+ TestName
					+ "</th> ");	
			fw.write("\n  <th width=\"20%\">Browser : "
					+ BrowserType
					+ "</th> ");
			fw.write("\n <th width=\"25%\">Executed on : "
					+ strDate1
					+ "</th> ");
			
			fw.write("\n <th   width=\"10%\"  >");
			fw.write("\n <th width=\"20%\">"
					+ "<img src=\""
					+ ClientLogo
					+ "\" alt=\"FAIL\"></th> ");
			
			fw.write("\n </table>");
	
		
			
			fw.write("\n <table id=customers>");
			fw.write("\n <tr>");
			fw.write("\n  <th width=\"5%\">S.No</th>  ");
			fw.write("\n  <th width=\"15%\">Steps </th>   ");
			fw.write("\n   <th width=\"15%\">Details </th>  ");
			fw.write("\n  <th width=\"5%\" height=\"50\" >Status</th> ");
			fw.write("\n  <th width=\"10%\">Screen Shots</th>  ");
			fw.write("\n  <th width=\"10%\">Date & Time</th>  ");
			fw.write("\n </tr>");
		   
		  
		    fw.close();
		   
 
		}
		
		
		
		
	public String  CretaeHTMLFile(String TestName,String BrowserType) throws Exception
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		
		 
		/* String HtmlOutputFileName=HtmlOutputFolder
		 		+ "\\" 
		 		+ TestName + "_" 
		 		+  "HTMLReport" +"_"+strDate1 +".html";*/
		  
		 DynamicHtmlOutputFileFolderPath13=HtmlOutputFolder
			 		+ "\\" + TestName+ "_" + strDate1 + "\\"
			 		+ TestName + "_" 
			 		+  "HTMLReport" +"_"+strDate1;
		 
	 		   
		 String HtmlOutputFileName= DynamicHtmlOutputFileFolderPath13 +".html";
		 
		   
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
			
			//HtmlTableHeader(HtmlOutputFileName,TestName);
			
		}catch (IOException ex) {} 
		
		File f1=new File(HtmlSourceTemplate);
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);  
		
		 HtmlTableHeader(HtmlOutputFileName,TestName,BrowserType);
		 
		 TestName1=TestName;
		 
		 
		 // folder creation starts
		 //DynamicHtmlOutputFileFolderPath13 =HtmlOutputFileFolderPath12;
	/*	  //DynamicHtmlOutputFileFolderPath13 =HtmlOutputFileFolderPath12;
		 Path path = Paths.get(DynamicHtmlOutputFileFolderPath13);
	  
		 if (!Files.exists(path)) {
		  
			      try {
			          Files.createDirectories(path);     
			      } catch (IOException e) {
			         
			          e.printStackTrace();
			      }
		 }
		 // folder creation ends
		 */
		 // folder creation ends
		 
	
		return HtmlOutputFileName;
		//	 return folderPath;
	
	}
		
		
		
		
		
	public void HTMLScreenShot(String Steps,String Details,String Status,String HtmlOutputFileName) throws IOException
	{
		
		SNo=SNo+1;

		FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
		
	
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		
		  
	     Date now = new Date();
	     String strDate = sdfDate.format(now);
	    // String fileWithPath=HtmlOutputFolder+"\\"+TestName1+"\\"+TestName1+"_"+strDate +".png";
	     
	     String fileWithPath=DynamicHtmlOutputFileFolderPath13+TestName1+"_"+strDate +".png";
	     
	    
	     
	     TakesScreenshot scrShot =((TakesScreenshot)driver);
	     File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	     //Move image file to new destination
	      File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);
		 
		 
	
		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		 
		
		
		fw.write("\n <tr> ");
		
				
	    fw.write("\n   <td width=\"5%\">"
	    		+ SNo
	    		+ "</td> ");
	    
	    
	    fw.write("\n  <td width=\"15%\">"
	    		+ Steps
	    		+ "</td> ");
	       
	    fw.write("\n  <td width=\"15%\">"
	    		+ Details
	    		+ "</td>  ");
	    
	    
	    if (Status.equals("Pass"))
	    {
	    
	    fw.write("\n  <td width=\"5%\">  ");
	    fw.write("\n  <font size=\"3\" color=\"green\"> <b>Pass</b></font>&nbsp    ");
	    
	         
	    
	    fw.write("\n    <img src=\""
	    		+ PassIcon
	    		+ "\" alt=\"PASS\" width=\"30\" height=\"30\"></td> ");
	   
	    fw.write("\n   <td width=\"10%\"> <a href=" + ScreenShotPath + " target=\"popup\" "
	    		+ "onclick=\"window.open('"
	    		+ ScreenShotPath
	    		+ "','popup','width=600,height=600'); return false;\"><font size=\"3\" color=\"green\"><b>Pass ScreenShot</b></a></font></td> ");
	    
	    }
	  
	    
	    if (Status.equals("Fail"))
	    {
	    
	    	fw.write("\n  <td width=\"5%\">  ");
		    fw.write("\n  <font size=\"3\" color=\"red\"> <b>Fail</b></font>&nbsp    ");
		    
		    fw.write("\n    <img src=\""
		    		+ FailIcon
		    		+ "\" alt=\"FAIL\" width=\"30\" height=\"30\"></td> ");
		   
		    fw.write("\n   <td width=\"10%\"> <a href=" + ScreenShotPath + " target=\"popup\" "
		    		+ "onclick=\"window.open('"
		    		+ ScreenShotPath
		    		+ "','popup','width=600,height=600'); return false;\">  <font size=\"3\" color=\"red\"><b>Fail ScreenShot</b></a></font></a></td> ");
	    
	    }
	    
	    //Don't Delete this comment
	  //  fw.write("\n   <td width=\"10%\"> <a href=\"http://www.google.com\" target=\"popup\" onclick=\"window.open('http://www.google.com','popup','width=600,height=600'); return false;\">Click Here</a></td> ");
	    fw.write("\n  <td width=\"10%\">"
	    		+ ""
	    		+ strDate1
	    		+ "</td>"
	    		+ " ");
	    
	    fw.write("\n </tr> ");
	    
	    fw.write("\n  ");
	    fw.write("\n  ");
	    
	    fw.close();
	}
	
	
	
		
	public void HTMLCloser(String HtmlOutputFileName) throws IOException
	{
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); //the true will append the new data
	    fw.write("\n  ");
	    fw.write("\n  ");
	    
	    fw.write("\n </table> ");//appends the string to the file
	    

	    
	    
	    
	    fw.write("\n </body> ");
	    fw.write("\n </html> ");
	    fw.close();
	}	
	
	
	

		
	
}

	
	