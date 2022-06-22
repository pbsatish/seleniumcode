package SamSung;
//import MercuryDemoTours;


import org.testng.annotations.Test;

import MercuryDemoTours.OR;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

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

import SamSung.*;

public class TestHTMLReporter4 {
	

	
	//public  WebDriver driver;
	/*
	public  void TestHTMLReporter3(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
			  
	}*/
	
	
	
	//Html Report Prerequisite settings starts
	public  String HtmlSourceTemplate ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\HtmlReport3.html";
	public  String Regression_HtmlSourceTemplate ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\HtmlReport5.html";
	public  String Regression_PieGraph126 ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\Graph1261.html";
	public  String Regression_columnGraph126 ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\Graph1281.html";
	
	public  String ClientLogo ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\Logo.JPEG";
	public  String PassIcon  ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\passed.ico";
	public  String FailIcon  ="C:\\Users\\sudhakar\\Desktop\\HTML Report\\HtmlTemplates\\failed.ico";
	
	public  String  canvasjsmin="C:/Users/sudhakar/Desktop/HTML Report/HtmlTemplates/canvasjs.min.js";
	
	public static String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	public static String xlsFileSheet="Sheet1";
	
	//Html Report Prerequisite settings Ends
	
	//Program Starts from Below
	public static String HtmlOutputFolder1 ="C:\\Users\\sudhakar\\Desktop\\HTML Report";
	public static SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	public static Date now5 = new Date();
	public static  String strDate6 = sdfDate5.format(now5);
    public static String HtmlOutputFolder = HtmlOutputFolder1 	+ "\\" + "New_Folder_" +  strDate6;
    
    
	public  String DynamicHtmlOutputFileFolderPath13="";
	public  String TestName1=""; 
	public  String TestName_Execution_Status="Pass";
	public  String CellData1,CellData2,CellData3,CellData4,CellData5,CellData6;
	public    ArrayList<String> myArray = new ArrayList<String>();
	
	public  List<String> cityList = new ArrayList<>();
	
	//public static int SNo1;
	public  int SNo;
	
		
	

		  public   ArrayList<Integer>   TestSuitePAssFailCount()  throws Exception
		  {

		      ArrayList<Integer> myArray = new ArrayList<Integer>();
		      

				ExcelApiTest3 eat1 = new ExcelApiTest3();
				  int numberowsInputdata=eat1.getRowCount(xlsFile,xlsFileSheet);
				 
				 System.out.println("Number of rows Inputdata...." +numberowsInputdata);
			

				 Integer PassCount=0;
				 Integer FailCount=0;
				 Integer TotalExecuted=0;
				  
				 for (int i=1;i<numberowsInputdata; i++  )
				 {	


					 CellData5=eat1.getCellData(xlsFile,xlsFileSheet,i,5);
					 System.out.println("CellData5-"+CellData5);
					 
							 if (CellData5.equals("Pass"))
							 {
								 PassCount++;
							 }
							 else
							 {
								 FailCount++;
							 }

				}
				 
				 System.out.println("Pass Count-"+PassCount);
				 
				 System.out.println("Fail Count-"+FailCount);
				
				 TotalExecuted= PassCount + FailCount;
				 
				 System.out.println("Fail Count-"+FailCount);

				myArray.add(PassCount);
			  	myArray.add(FailCount);
			  	myArray.add(TotalExecuted);
				
			  	return myArray;

		  }
	
		
		
		
		public void HtmlTableHeader(String HtmlOutputFileName,String TestName , String BrowserType) throws Exception
		{
			
			FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
			
			
			 SimpleDateFormat sdfDate1 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
			 Date now1 = new Date();
			 String strDate1 = sdfDate1.format(now1);
			 
			 
				fw.write("\n <table id=customers2>");
			
				fw.write("\n <th >"
						+ "<img src=\""
						+ ClientLogo
						+ "\" alt=\"Logo\"  align= \"center\"> </th> ");
				
				fw.write("\n </table>");
		
			 

			fw.write("\n <table id=customers1>");	
			
			fw.write("\n <th height=\"30px\"> Test Name : "
					+ TestName
					+ "</th> ");	
			fw.write("\n  <th >Browser : "
					+ BrowserType
					+ "</th> ");
			fw.write("\n <th >Executed on : "
					+ strDate1
					+ "</th> ");
			
			fw.write("\n </table>");
			
			

		
			
			  CellData4=strDate1;  
			  myArray.add(CellData4);
			
			fw.write("\n <table id=customers>");
			fw.write("\n <tr>");
			fw.write("\n  <th height=\"40px\"><center>S.No</center></th>  ");
			fw.write("\n  <th ><center>Steps</center> </th>   ");
			fw.write("\n   <th ><center>Details </center></th>  ");
			fw.write("\n  <th  ><center>Status</center></th> ");
			fw.write("\n  <th ><center>Screen Shots</center></th>  ");
			fw.write("\n  <th ><center>Date & Time</center></th>  ");
			fw.write("\n </tr>");
		   
		  
			 System.out.println("Check 123");
			
			    System.out.println("Check 124");
			
		    fw.close();
		   
 
		}
		
		
		
		
	public String  CretaeHTMLFile(String TestName,String BrowserType) throws Exception
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		

		  
		 DynamicHtmlOutputFileFolderPath13=HtmlOutputFolder
			 		+ "\\" +  BrowserType + "_" +TestName + "_" + strDate1 + "\\"
			 		+ TestName + "_" +  "HTMLReport" +"_"+strDate1;
		 
	 		   
		 String HtmlOutputFileName= DynamicHtmlOutputFileFolderPath13 +".html";
		 
			
			
			   CellData1=TestName;
			   CellData2=HtmlOutputFileName;
			   CellData3=BrowserType;
			   
				myArray.add(CellData1);
				myArray.add(CellData2);
				myArray.add(CellData3);
			   
			   System.out.println("CellData1 is - "+CellData1);
			   System.out.println("CellData2 is - "+CellData2);
			   System.out.println("CellData3 is - "+CellData3);
			  
		
		 
		 System.out.println("HtmlOutputFileName"+HtmlOutputFileName);
		   
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
			

			
		}catch (IOException ex) {} 
		
		File f1=new File(HtmlSourceTemplate);
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);  
		
		 HtmlTableHeader(HtmlOutputFileName,TestName,BrowserType);
		 
		 TestName1=TestName;
		 
		 System.out.println("Test Name is :"+TestName1);
		 
	
		return HtmlOutputFileName;

	
	}
		
		
		
		
		
	public void HTMLScreenShot(String Steps,String Details,String Status,String HtmlOutputFileName,WebDriver driver) throws Exception
	{
		
		
		//Thread.sleep(20);
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
		
				
	    fw.write("\n   <td height=\"40px\"><center>"
	    		+ SNo
	    		+ "</center></td> ");
	    
	    
	    fw.write("\n  <td ><center>"
	    		+ Steps
	    		+ "</center></td> ");
	       
	    fw.write("\n  <td ><center>"
	    		+ Details
	    		+ "</center></td>  ");
	    
	    
	    if (Status.equals("Pass"))
	    {

	    	
	    fw.write("\n  <td ><center>  ");
	    fw.write("\n  <font size=\"3\" color=\"green\"> <b>Pass</b></font>&nbsp    ");
	    
	         
	    
	    fw.write("\n    <img src=\""
	    		+ PassIcon
	    		+ "\" alt=\"PASS\" width=\"30\" height=\"30\"></center></td> ");
	   
	    fw.write("\n   <td ><center> <a href=" + ScreenShotPath + " target=\"popup\" "
	    		+ "onclick=\"window.open('"
	    		+ ScreenShotPath
	    		+ "','popup','width=600,height=600'); return false;\"><font size=\"3\" color=\"green\"><b>Pass ScreenShot</b></a></font></center></td> ");
	   
					    if (isNullOrEmpty(CellData6))
					    {
					    	CellData6="Pass";	
					    	myArray.add(CellData6);
					    }
					    
					    if (CellData6.equals("Fail"))
					    {
					    	CellData6="Fail";
					    	myArray.add(CellData6);
					    }
	    		
	    }
	  
	    
	    if (Status.equals("Fail"))
	    {
	    
	    	
	    	CellData6="Fail";
	    	myArray.add(CellData6);
	    	
	    	System.out.println("TestName_Execution_Status is "+CellData6);
	
	 
	    	
	    	fw.write("\n  <td ><center>  ");
		    fw.write("\n  <font size=\"3\" color=\"red\"> <b>Fail</b></font>&nbsp    ");
		    
		    fw.write("\n    <img src=\""
		    		+ FailIcon
		    		+ "\" alt=\"FAIL\" width=\"30\" height=\"30\"></center></td> ");
		   
		    fw.write("\n   <td ><center> <a href=" + ScreenShotPath + " target=\"popup\" "
		    		+ "onclick=\"window.open('"
		    		+ ScreenShotPath
		    		+ "','popup','width=600,height=600'); return false;\">  <font size=\"3\" color=\"red\"><b>Fail ScreenShot</b></a></font></a></center></td> ");
	    
	    }
	    
	    //Don't Delete this comment
	  //  fw.write("\n   <td width=\"10%\"> <a href=\"http://www.google.com\" target=\"popup\" onclick=\"window.open('http://www.google.com','popup','width=600,height=600'); return false;\">Click Here</a></td> ");
	    fw.write("\n  <td ><center>"
	    		+ ""
	    		+ strDate1
	    		+ "</center></td>"
	    		+ " ");
	    
	    fw.write("\n </tr> ");
	    
	    fw.write("\n  ");
	    fw.write("\n  ");
	    
	    
	    
	    fw.close();
	}
	
	

public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
		
	public    void HTMLCloser(String HtmlOutputFileName) throws Exception
	{
		
		
		//Thread.sleep(3000);
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); //the true will append the new data
		//Thread.sleep(3000);
	    fw.write("\n  ");
	    fw.write("\n  ");
	    
	    fw.write("\n </table> ");//appends the string to the file
	    
	
	    
	    fw.write("\n </body> ");
	    fw.write("\n </html> ");
	    
	    
	    fw.close();
	    
	    
	    PrintmyArray();

	   // AppendCellData();
	    
	    
	}	
	
	
	
	
	public  synchronized  void PrintmyArray() throws Exception
	{
		
		
		
		//SNo1=SNo1+1;
		//myArray.add(String.valueOf(SNo1));
		//System.out.println("Test Numbering purpose in Regression "+SNo1);
		
		System.out.println("**********My Array starts ************");
		for (String object: myArray) {
		    System.out.println(object);
		}	
		System.out.println("**********My Array ends ************");
		
		
		
		System.out.println("__________Remove Dupliactates starts________");
		cityList = myArray.stream().distinct().collect(Collectors.toList());
		for (String object: cityList) {
		    System.out.println(object);
		}	
		System.out.println("_________After Removing duplicates Dupliactates _________");
		
		
		
		
		if(cityList.size()==6)
		{
			
			if(cityList.contains("Fail")  && cityList.contains("Pass") )
			{
				
				
				cityList.remove(cityList.indexOf("Pass"));
				
				
				System.out.println("Now cityList Size**"+cityList.size());
				System.out.println("Test Name***__"+cityList.get(0));
				System.out.print(cityList);
				System.out.println("***");
			}
			
		}
		
		
		
		
		ExcelAppendData1(cityList);
		
	
		
	}
	
	
	
	
	
	public  void  Regression_CretaeHTMLFile() throws Exception
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		

		  
		 DynamicHtmlOutputFileFolderPath13=HtmlOutputFolder + "\\" + "Regression_HTMLReport" +"_"+strDate1;
		 
	 		   
		 String HtmlOutputFileName= DynamicHtmlOutputFileFolderPath13  +".html";
		 
		 System.out.println("HtmlOutputFileName"+HtmlOutputFileName);
		 
		   
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
			
			//HtmlTableHeader(HtmlOutputFileName,TestName);
			
		}catch (IOException ex) {} 
		
		File f1=new File(Regression_HtmlSourceTemplate);
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);  
		
		
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
		
		
		
		// SimpleDateFormat sdfDate1 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
		// Date now1 = new Date();
		// String strDate1 = sdfDate1.format(now1);
		 
	//	 System.out.println("Test Name is :"+TestName);
		

		fw.write("\n <table id=customers2>");
	
		fw.write("\n <th >"
				+ "<img src=\""
				+ ClientLogo
				+ "\" alt=\"Logo\"  align= \"center\"> </th> ");
		
		fw.write("\n </table>");
		
		

		fw.write("\n <table id=customers1>");
		
		fw.write("\n <th width=\"25%\"> Test Suite  : Mar-19 Release "
				+ "</th> ");	
	
		ArrayList<Integer> myArray =TestSuitePAssFailCount();
		System.out.println(" After Suite Pass Count-"+myArray.get(0));
		System.out.println("After Suite Fail Count--"+myArray.get(1));
		   
		 fw.write("\n <th width=\"10%\"> <center> " 
		    		+ " <font size=\"3\" color=\"white\"> <b>Pass #  "
		    		+ myArray.get(0)
		    		+ "</b></font>&nbsp      </th>  ");
		    
		   
		fw.write("\n <th width=\"10%\"> <center> " 
				    + " <font size=\"3\" color=\"white\"> <b>Fail #  "
				    + myArray.get(1)
				    + "</b></font>&nbsp      </th>  ");
		
		fw.write("\n <th width=\"10%\"> <center> " 
			    + " <font size=\"3\" color=\"white\"> <b>Total #  "
			    + myArray.get(2)
			    + "</b></font>&nbsp      </th>  ");
	    
	    
	  /*  fw.write("\n <th width=\"10%\">Fail #  &nbsp; " + myArray.get(1) +
	    		"</th> ");
	    
	    fw.write("\n <th width=\"10%\">Total #  &nbsp; " + myArray.get(2) +
	    		"</th> ");
	    		
	    		*/
	    

		 SimpleDateFormat sdfDate8 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss a"); 
		 Date now8 = new Date();
		 String strDate8 = sdfDate8.format(now8);
	
		
		fw.write("\n <th width=\"25%\">Executed on : "
				+ strDate8
				+ "</th> ");
		
	//	fw.write("<th   width=\"10%\"  >");
		
		
		
		fw.write("\n </table>");

	
		
		fw.write("\n <table id=customers>");
		fw.write("\n <tr>");
		//fw.write("\n  <th width=\"5%\"><center>Execution - S.No<center></th>  ");
		fw.write("\n  <th width=\"10%\"><center>Test Name<center> </th>   ");
		
		fw.write("\n   <th width=\"5%\"><center>Execution Status<center></th>  ");
		fw.write("\n  <th width=\"5%\"><center>Browser Type<center> </th>   ");
		fw.write("\n   <th width=\"10%\"><center>Click for Detailed Steps</center></th>");
		fw.write("\n  <th width=\"10%\"><center>Date & Time</center></th>  ");
		fw.write("\n </tr>");
		
		
		
		    //  String CellData1="",CellData2="",CellData3="",CellData4="",CellData5="",CellData6="";
		      
			  ExcelApiTest3 eat1 = new ExcelApiTest3();
			  int numberowsInputdata=eat1.getRowCount(xlsFile,xlsFileSheet);
			 
			 System.out.println("Number of rows Inputdata...." +numberowsInputdata);
		

			
			 for (int i=1;i<numberowsInputdata; i++  )
			 {	
				 	
				 
				 // String s1 = String.valueOf(i); 
				  CellData1=eat1.getCellData(xlsFile,xlsFileSheet,i,1);   //Test Name
				  System.out.println("CellData1-"+CellData1);            
				 
				 CellData2=eat1.getCellData(xlsFile,xlsFileSheet,i,2);   //Click Detailed steps
				 System.out.println("CellData2-"+CellData2);
				 
				 CellData3=eat1.getCellData(xlsFile,xlsFileSheet,i,3);   //Browser Type
				 String  HtmlPath = CellData3.replace("\\", "/");               
				 System.out.println("CellData3-"+CellData3);
				 
				 CellData4=eat1.getCellData(xlsFile,xlsFileSheet,i,4);
				 System.out.println("CellData4-"+CellData4);               //Date & Time
				 
				// CellData5=eat1.getCellData(xlsFile,xlsFileSheet,i,5);   // SNO
				// System.out.println("CellData5-"+CellData5);
				 
				 CellData5=eat1.getCellData(xlsFile,xlsFileSheet,i,5);
				 System.out.println("CellData6-"+CellData5);                // Pass or Fail
				 
				 System.out.println("____________");
				 
				
				 
				fw.write("\n <tr> ");	
				
				/*  fw.write("\n   <td width=\"5%\"> <center>"
				    		+ CellData5);
				  
				fw.write("\n  </center></td> ");	
				
				*/
				  
			    fw.write("\n   <td width=\"10%\"> <center>"
			    		+ CellData1);
			    
			    fw.write("\n  </center></td> ");	
			   
			    
			    if (CellData5.equals("Pass"))
			    {
			    
			    fw.write("\n <td width=\"5%\"> <center> " 
			    		+ " <font size=\"3\" color=\"green\"> <b>Pass</b></font>&nbsp     ");
			    
			    fw.write("\n    <img src=\""
			    		+ PassIcon
			    		+ "\" alt=\"PASS\" width=\"30\" height=\"30\"></center></td> ");
			    
			    }
			    
			    if (CellData5.equals("Fail"))
			    {
			    
			    fw.write("\n <td width=\"5%\"><center> " 
			    		+ " <font size=\"3\" color=\"red\"> <b>Fail</b></font>&nbsp    ");
			    
			    fw.write("\n    <img src=\""
			    		+ FailIcon
			    		+ "\" alt=\"Fail\" width=\"30\" height=\"30\"></center></td> ");
			    
			    }
			    
			   
			    fw.write("\n   <td width=\"10%\"><center>"
			    		+ CellData3);
			    
			   fw.write("\n </center></td> ");	
			    
			    
			    
			    			 
			    fw.write("\n    <td width=\"10%\"> <center>"
			    		+ "<a href=\""
			    		+ CellData2
			    		+ "\" + target=\"_blank\">"
			    		+ "Click Detailed Steps"
			    		+ "</a></center></td> ");
			    
			
			    
			    
			    fw.write("\n   <td width=\"10%\"><center>"
			    		+ CellData4);

			    fw.write("\n </center></td> ");	
			    

			    fw.write("\n </tr> ");	
			    
			 }
	
			   
			    
			   // fw.write("\n </table> ");
			    
				  
		
						 
			   
			 
			    ArrayList<Integer> myArray1 =TestSuitePAssFailCount();
				System.out.println(" After Suite Pass Count-"+myArray1.get(0));
				System.out.println("After Suite Fail Count--"+myArray1.get(1));
				
				String str=Graph126Pie();
				String str3 = str.replace("\\", "/");
				System.out.println("Pie Graph Html Path is "+str3);
				
				
				String str1=Graph126Column();
				String str4 = str1.replace("\\", "/");
				System.out.println("Bar Graph Html Path is "+str4);
				
				
			    //fw.write("\n </br> ");
			    
		
			    
			    fw.write("\n  <table style=\"margin-left: 150px; \">  ");
			    
			    fw.write("\n  <td style=\"border: 2px solid #ddd; \"  >   ");
			    
			    fw.write("\n   <iframe src=\""
			    		
			    		+ str3
			    		
			    		+ "\" ");
			    fw.write("\n   frameborder=\"0\" scrolling=\"no\" width=\"500\" height=\"500\" align=\"left\"> ");
			    fw.write("\n 	</iframe> ");
			 
			    fw.write("\n </td> ");
			    
			    fw.write("\n  <td style=\"border: 2px solid #ddd; \"  >   ");

			
				fw.write("\n   <iframe src=\""
						+ str4
						+ "\" ");
				
			    fw.write("\n   frameborder=\"0\" scrolling=\"no\" width=\"500\" height=\"500\" align=\"left\"> ");
				fw.write("\n    </iframe> ");
				  fw.write("\n </td> ");
				  
				  
				  
				  fw.write("\n </table> ");
						 
			    fw.write("\n </body> ");
			    fw.write("\n </html> ");
			    
			    
			    fw.close();
	
		
		
	}
	

	
	public synchronized static Boolean ExcelAppendData(String CellData) throws Exception
	{
	         
		      Boolean Insert_Status=false;
		
		
		//synchronized(this){//synchronized block  
		
					try
					   {
						
					       System.out.println("Hai");
					       FileInputStream myxls = new FileInputStream(xlsFile);
					       HSSFWorkbook studentsSheet = new HSSFWorkbook(myxls);
					       HSSFSheet worksheet = studentsSheet.getSheet(xlsFileSheet);
					       int lastRow=worksheet.getLastRowNum();
					       System.out.println("lastRow"+lastRow);
					      
					       Row row = worksheet.createRow(++lastRow);
					       
					       
					       //row.createCell(1).setCellValue("Dr.Hola");
					       
					       row.createCell(1).setCellValue(CellData);
					      
					       
					      
					       myxls.close();
					       
						   FileOutputStream output_file =new FileOutputStream(new File(xlsFile));  
					       //write changes
					       studentsSheet.write(output_file);
					       output_file.close();
					       System.out.println(" is successfully written");
					       
					       Thread.sleep(500);  
					       
					       Insert_Status=true;
					       
					       return Insert_Status;
					       
					    }
					    catch(Exception e)
					    {
					    	
					    	e.printStackTrace();
					    }	
		//}
					return Insert_Status;
	
	}
	
	
	public   String  Graph126Pie() throws Exception
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		
		 DynamicHtmlOutputFileFolderPath13=HtmlOutputFolder + "\\" + "PieGraph_HTMLReport" +"_"+strDate1; 
	 		   
		 String HtmlOutputFileName= DynamicHtmlOutputFileFolderPath13  +".html";
		 System.out.println("HtmlOutputFileName"+HtmlOutputFileName);
		 
		   
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
			
		
			
		}catch (IOException ex) {} 
		
		File f1=new File(Regression_PieGraph126);
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);  
		
		
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
		
		fw.write("\n <!DOCTYPE HTML>");
		fw.write("\n <html>");
		fw.write("\n <head>");
		fw.write("\n <script>");
		
		
		fw.write("\n window.onload = function() { ");
		fw.write("\n var chart = new CanvasJS.Chart (\"chartContainer\", {       ");
		
		fw.write("\n  theme: \"light2\",   ");
		fw.write("\n  exportEnabled: true,   ");
		
		fw.write("\n animationEnabled: true,  ");
		
		fw.write("\n  title: {  ");
		
		
		fw.write("\n text: \"Test Exeuction Summary\"  ");
		
		fw.write("\n },  ");
		fw.write("\n  	data: [{    ");
		fw.write("\n   type: \"pie\",  ");
		fw.write("\n startAngle: 25,   ");
		fw.write("\n toolTipContent: \"<b>{label}</b>: {y}\",  ");
		fw.write("\n  	showInLegend: \"true\", ");
		fw.write("\n   	legendText: \"{label}- {y} \",  ");
		fw.write("\n  indexLabelFontSize: 16,  ");
		fw.write("\n  indexLabel: \"{label} - {y} (#percent%)  \",  ");
		fw.write("\n   dataPoints: [ ");
		
		ArrayList<Integer> myArray =TestSuitePAssFailCount();
		System.out.println(" After Suite Pass Count-"+myArray.get(0));
		System.out.println("After Suite Fail Count--"+myArray.get(1));
		
		fw.write("\n  { y: "
				+ myArray.get(0)
				+ ", color: \"green\", label: \"Pass\" },  ");
		
		
		fw.write("\n  { y: "
				+ myArray.get(1)
				+ ", color: \"red\", label: \"Fail\" }  ");
		
		fw.write("\n ]  ");
		fw.write("\n  }]  ");
		fw.write("\n });  ");
		fw.write("\n  chart.render();  ");
		fw.write("\n  }    ");
		fw.write("\n  </script>       ");
		fw.write("\n  </head>  ");
		fw.write("\n  <body>  ");
		fw.write("\n  <div id=\"chartContainer\" style=\"height: 100%; width: 100%;\"></div>   ");
		fw.write("\n  <script src=\""
				+ canvasjsmin
				+ "\"></script> ");
		fw.write("\n </body> ");
		fw.write("\n </html> ");
	    fw.close();
	    
	    return HtmlOutputFileName;

		
	}
	
	

	public  String  Graph126Column() throws Exception
	{
		

		 SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
		 Date now1 = new Date();
		 String strDate1 = sdfDate1.format(now1);
		
		 DynamicHtmlOutputFileFolderPath13=HtmlOutputFolder + "\\" + "BarGraph_HTMLReport" +"_"+strDate1; 
	 		   
		 String HtmlOutputFileName= DynamicHtmlOutputFileFolderPath13  +".html";
		 System.out.println("HtmlOutputFileName"+HtmlOutputFileName);
		 
		   
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(HtmlOutputFileName), "utf-8"))) {
			writer.close();
			
		
			
		}catch (IOException ex) {} 
		
		File f1=new File(Regression_columnGraph126);
		File f2=new File(HtmlOutputFileName);
		FileUtils.copyFile(f1, f2);  
		
		
		FileWriter fw = new FileWriter(HtmlOutputFileName,true); 
		
		fw.write("\n <!DOCTYPE HTML>");
		fw.write("\n <html>");
		fw.write("\n <head>");
		fw.write("\n <script>");
		
		
		fw.write("\n window.onload = function() { ");
		fw.write("\n var chart = new CanvasJS.Chart (\"chartContainer\", {       ");
		
		fw.write("\n  theme: \"light2\",   ");
		fw.write("\n  exportEnabled: true,   ");
		
		fw.write("\n animationEnabled: true,  ");
		
		fw.write("\n  title: {  ");
		
		
		fw.write("\n text: \"Test Exeuction Summary\"  ");
		
		fw.write("\n },  ");
		fw.write("\n  	data: [{    ");
		fw.write("\n   type: \"column\",  ");
		fw.write("\n startAngle: 25,   ");
		fw.write("\n toolTipContent: \"<b>{label}</b>: {y}\",  ");
		//fw.write("\n  	showInLegend: \"true\", ");
		//fw.write("\n   	legendText: \"{label}- {y} \",  ");
		fw.write("\n  indexLabelFontSize: 16,  ");
		fw.write("\n  indexLabel: \"{label} - {y} \",  ");
		fw.write("\n   dataPoints: [ ");
		
		ArrayList<Integer> myArray =TestSuitePAssFailCount();
		System.out.println(" After Suite Pass Count-"+myArray.get(0));
		System.out.println("After Suite Fail Count--"+myArray.get(1));
		
		fw.write("\n  { y: "
				+ myArray.get(0)
				+ ", color: \"green\", label: \"Pass\" },  ");
		
		
		fw.write("\n  { y: "
				+ myArray.get(1)
				+ ", color: \"red\", label: \"Fail\" }  ");
		
		fw.write("\n ]  ");
		fw.write("\n  }]  ");
		fw.write("\n });  ");
		fw.write("\n  chart.render();  ");
		fw.write("\n  }    ");
		fw.write("\n  </script>       ");
		fw.write("\n  </head>  ");
		fw.write("\n  <body>  ");
		fw.write("\n  <div id=\"chartContainer\" style=\"height: 100%; width: 100%;\"></div>   ");
		fw.write("\n  <script src=\""
				+ canvasjsmin
				+ "\"></script> ");
		fw.write("\n </body> ");
		fw.write("\n </html> ");
	    fw.close();
	    
	    return HtmlOutputFileName;

		
	}
	

	
	
	

	public synchronized static Boolean ExcelAppendData1(List cityList) throws Exception
	{
	         
		      Boolean Insert_Status=false;
		
		
		//synchronized(this){//synchronized block  
		
					try
					   {
						
					       System.out.println("Hai");
					       FileInputStream myxls = new FileInputStream(xlsFile);
					       HSSFWorkbook studentsSheet = new HSSFWorkbook(myxls);
					       HSSFSheet worksheet = studentsSheet.getSheet(xlsFileSheet);
					       int lastRow=worksheet.getLastRowNum();
					       System.out.println("lastRow"+lastRow);
					      
					       Row row = worksheet.createRow(++lastRow);
					       
					       
					       //row.createCell(1).setCellValue("Dr.Hola");
					       
					       row.createCell(1).setCellValue((String) cityList.get(0));
					       row.createCell(2).setCellValue((String) cityList.get(1));
					       row.createCell(3).setCellValue((String) cityList.get(2));
					       row.createCell(4).setCellValue((String) cityList.get(3));
					       row.createCell(5).setCellValue((String) cityList.get(4));
					       //row.createCell(6).setCellValue((String) cityList.get(5));
					       
					      
					       myxls.close();
					       
						   FileOutputStream output_file =new FileOutputStream(new File(xlsFile));  
					       //write changes
					       studentsSheet.write(output_file);
					       output_file.close();
					       System.out.println(" is successfully written");
					       
					       Thread.sleep(500);  
					       
					       Insert_Status=true;
					       
					       return Insert_Status;
					       
					    }
					    catch(Exception e)
					    {
					    	
					    	e.printStackTrace();
					    }	
		//}
					return Insert_Status;
	
	}	
	
	
}

	
	