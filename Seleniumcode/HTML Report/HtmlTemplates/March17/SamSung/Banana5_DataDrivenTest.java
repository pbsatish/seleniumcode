//import MercuryDemoTours;

package  SamSung;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.apache.http.util.ExceptionUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import SamSung.*;


public class Banana5_DataDrivenTest
{
		
		 WebDriver driver,driver1;
		 public  void Banana5_DataDrivenTest(WebDriver driver )throws Exception
		 {  
			 this.driver=driver;

		 }
		 
		 String s,s1;
		
		public    String  UserName,  Password,   PassengersCount,
		 DepartingFrom,   DepartingStartMonth,  DepartingStartDate,
		    ArrivingIn,  ReturningEndMonth,   ReturningEndDate,
		    Airline,  ServiceClass,  Radiobutton,
		    FirstName,  lastName,  meal1,  CardName,
		    CardNumber,  expirymonth,  expiryyear; 
		    
		public  int iRow;
		
	    String HtmlOutputFileName="";
	    
	    String SBrowserType="Chrome";
	    
	    String SBrowserType1="IE";
	    TestHTMLReporter5 TH= new TestHTMLReporter5();
		
//	public final boolean str=true;
	//	enabled=str	 
		
@Test
public void AllBrowsers() throws Exception
{
	
	
	Banana5_DataDrivenTest B1= new Banana5_DataDrivenTest();
	B1.DataDrivenTest(SBrowserType);

}


@Test
public void AllBrowsers3() throws Exception
{


Banana5_DataDrivenTest B1= new Banana5_DataDrivenTest();
B1.DataDrivenTest(SBrowserType1);

}







//@Test
public void AllBrowsers1() throws Exception
{
	Banana5_DataDrivenTest B2= new Banana5_DataDrivenTest();
	B2.DataDrivenTest(SBrowserType);

}

//@Test
public void AllBrowsers2() throws Exception
{
	Banana5_DataDrivenTest B3= new Banana5_DataDrivenTest();
	B3.DataDrivenTest(SBrowserType);

}
		

@BeforeSuite
public void BeforesuiteSetup1( ) throws Exception {
	 
	
	  String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	  String xlsFileSheet="Sheet1";
	  ExcelApiTest3 eat = new ExcelApiTest3();
	  eat.clearsheetdata(xlsFile,xlsFileSheet);
}  

@AfterSuite
public void AftersuiteSetup2() throws Exception {
	 
	 TestHTMLReporter5 TH = new TestHTMLReporter5();	
	 TH.Regression_CretaeHTMLFile();
	
}    		
		
		
		
		
//@Test
public void DataDrivenTest(String SBrowserType) throws Exception
{
	//String SBrowserType
	
//SBrowserType="Chrome";
	
     ExcelApiTest3 eat = new ExcelApiTest3();
	 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");

		 for(int i=1;i<2;i++)
		 {		 
					 UserName=eat.getCellData("E://TC25.xls","Sheet1",i,0);
					 Password=eat.getCellData("E://TC25.xls","Sheet1",i,1);		 		
					 PassengersCount=eat.getCellData("E://TC25.xls","Sheet1",i,2);		
					 DepartingFrom=eat.getCellData("E://TC25.xls","Sheet1",i,3);		
					 DepartingStartMonth=eat.getCellData("E://TC25.xls","Sheet1",i,4);		
					 DepartingStartDate=eat.getCellData("E://TC25.xls","Sheet1",i,5);		
					 ArrivingIn=eat.getCellData("E://TC25.xls","Sheet1",i,6);		
					 ReturningEndMonth=eat.getCellData("E://TC25.xls","Sheet1",i,7);		
					 ReturningEndDate=eat.getCellData("E://TC25.xls","Sheet1",i,8);		
					 Airline=eat.getCellData("E://TC25.xls","Sheet1",i,9);
					 ServiceClass=eat.getCellData("E://TC25.xls","Sheet1",i,10);		
					 Radiobutton=eat.getCellData("E://TC25.xls","Sheet1",i,11); 			 
					 FirstName=eat.getCellData("E://TC25.xls","Sheet1",i,12);
					 lastName=eat.getCellData("E://TC25.xls","Sheet1",i,13);
					 CardName=eat.getCellData("E://TC25.xls","Sheet1",i,14);
					 CardNumber=eat.getCellData("E://TC25.xls","Sheet1",i,15);
					 meal1=eat.getCellData("E://TC25.xls","Sheet1",i,16);
					 expirymonth=eat.getCellData("E://TC25.xls","Sheet1",i,17);		
					 expiryyear=eat.getCellData("E://TC25.xls","Sheet1",i,18);	
					 iRow=i;
					 
					 
					 if(SBrowserType.equals("IE") )
					 call_allmethods(iRow,SBrowserType);
					 else
					call_allmethods1(iRow,SBrowserType); 
					 
					
					 
					 
					 
					 
					 
					 
					 
					 
		 }	
}






public void call_allmethods(int iRow,String BrowserType) throws Exception
{
	

	
	try {
	
			String str1="";

    

				System.out.print("Browsertype in Data Driven is :"+BrowserType);
				  
			 	
			    if(BrowserType.equals("IE"))
			    {
			  
			    	driver=TestBrowser.OpenIEBrowser();
			    	str1="TC01"+"_IE" + "_Iteration_" + String.valueOf(iRow);
			    	
				  
			  	   HtmlOutputFileName= TH.CretaeHTMLFile(str1,BrowserType);
			  
			  	  
			    	
			    }
    
   		/*  Folders123 F1= new Folders123();
   		  List<String> Myarray1 = F1.CreateFolder("TC01",str1); 
		  F1.sTargetTestCasePath=Myarray1.get(0);
		  F1.FolderPath=Myarray1.get(1);
		  System.out.println(" Myarray1.get(0) "+Myarray1.get(0));
		  System.out.println(" Myarray1.get(1) "+Myarray1.get(1)); 
		  		//  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,1,6,F1.FolderPath);
		  */
		
		
		
		  Banana1 Bn1 =new Banana1();	
		  Bn1.Banana1(driver);
		  
	
		  
		  Bn1.openMercuryTours();
		  Bn1.mercurylogin(UserName,Password); 


		  TH.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver);
		  Bn1.mercurySigninClick();
		
		 
		  
 		  Banana2 Bn2 =new Banana2();
		  Bn2.Banana2(driver);
		  
		  Bn2.MerucryFlightFinderBusiness(PassengersCount,DepartingFrom,
		  DepartingStartMonth,DepartingStartDate,ArrivingIn,
		  ReturningEndMonth,ReturningEndDate,Airline,Radiobutton,
		  ServiceClass);

		  

		  TH.HTMLScreenShot("Open Browser1","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		 
		  
		 Bn2.Page2_Continue_Click();

		 
		
		  Banana3 Bn3 =new Banana3();
		  Bn3.Banana3(driver);
		  

		  TH.HTMLScreenShot("Open Browser2","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		  Bn3.Page3_Continue_Click();
		
		 
		 
		  Banana4 Bn4 =new Banana4();		
		  Bn4.Banana4(driver);
		  
		  Bn4.EnterCardDetails(FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear);
	
		  TH.HTMLScreenShot("Open Browser3","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		  Bn4.Page4_Continue_Click();
		  
		  Bn4.GetOutputData(iRow);
		  
		 
		  TH.HTMLScreenShot("Open Browser3","	Succefully Entered1","Pass", HtmlOutputFileName,driver);


}catch(Exception e) { 

e.printStackTrace();

String s =e.toString();
String s1 =e.getMessage();



TH.HTMLScreenShot(s,s1,"Fail", HtmlOutputFileName,driver);
}
	
	
	
	finally{
		
		System.out.println("finally block is always executed"); 
	  	System.out.println("rest of the code...");  
	  	 TH.HTMLCloser(HtmlOutputFileName);

		  driver.quit();
			} 
	
	
	  }  






// New methods starts



public void call_allmethods1(int iRow,String BrowserType) throws Exception
{
	
	//BrowserType="Chrome";
	
	try {
	
			String str1="";

    

				System.out.print("Browsertype in Data Driven is :"+BrowserType);
				  
			 	
			    if(BrowserType.equals("Chrome"))
			    {
			  
			    	driver=TestBrowser.OpenChromeBrowser();
			    	str1="TC01"+"_Chrome" + "_Iteration_" + String.valueOf(iRow);
			    	
				  
			  	   HtmlOutputFileName= TH.CretaeHTMLFile(str1,BrowserType);
			  	 // TH.TestHTMLReporter3(driver);
			  	  
			    	
			    }
    
   		/*  Folders123 F1= new Folders123();
   		  List<String> Myarray1 = F1.CreateFolder("TC01",str1); 
		  F1.sTargetTestCasePath=Myarray1.get(0);
		  F1.FolderPath=Myarray1.get(1);
		  System.out.println(" Myarray1.get(0) "+Myarray1.get(0));
		  System.out.println(" Myarray1.get(1) "+Myarray1.get(1)); */
		
		
		
		  Banana1 Bn1 =new Banana1();	
		  Bn1.Banana1(driver);
		  
	
		  
		  Bn1.openMercuryTours();
		  Bn1.mercurylogin(UserName,Password); 
		//  F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,1,6,F1.FolderPath);

		  TH.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver);
		  Bn1.mercurySigninClick();
		
		  
		  
 		  Banana2 Bn2 =new Banana2();
		  Bn2.Banana2(driver);
		  
		  Bn2.MerucryFlightFinderBusiness(PassengersCount,DepartingFrom,
		  DepartingStartMonth,DepartingStartDate,ArrivingIn,
		  ReturningEndMonth,ReturningEndDate,Airline,Radiobutton,
		  ServiceClass);
		 // F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,2,6,F1.FolderPath);
		  

		  TH.HTMLScreenShot("Open Browser1","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		 
		  
		 Bn2.Page2_Continue_Click();

		 
		
		  Banana3 Bn3 =new Banana3();
		  Bn3.Banana3(driver);
		  
		 // F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,3,6,F1.FolderPath);
		  TH.HTMLScreenShot("Open Browser2","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		  Bn3.Page3_Continue_Click();
		
		 
		 
		  Banana4 Bn4 =new Banana4();		
		  Bn4.Banana4(driver);
		  
		  Bn4.EnterCardDetails(FirstName,lastName,meal1,CardName,CardNumber,expirymonth,expiryyear);
		  //F1.takeSnapShot(driver,F1.sTargetTestCasePath,str1,4,6,F1.FolderPath);
		  TH.HTMLScreenShot("Open Browser3","	Succefully Entered1","Pass", HtmlOutputFileName,driver);
		  Bn4.Page4_Continue_Click();
		  
		  Bn4.GetOutputData(iRow);
		  
		 
		  TH.HTMLScreenShot("Open Browser3","	Succefully Entered1","Pass", HtmlOutputFileName,driver);


}catch(Exception e) { e.printStackTrace();

e.printStackTrace();

 s =e.toString();
 s1 =e.getMessage();



TH.HTMLScreenShot(s,s1,"Fai;", HtmlOutputFileName,driver);
}
	
	
	
	finally{
		
		TH.HTMLScreenShot(s,s1,"Fai;", HtmlOutputFileName,driver);

		System.out.println("finally block is always executed"); 
	  	System.out.println("rest of the code...");  
	  	 TH.HTMLCloser(HtmlOutputFileName);

		  driver.quit();
			} 
	
	
	  }  



//New methods ends






	
	
}



