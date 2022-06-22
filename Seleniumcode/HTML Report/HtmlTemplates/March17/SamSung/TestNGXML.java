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

public class TestNGXML {

	public  String XMLSourceTemplate ="C:\\HTML Report\\TestNGXML_Template\\TestNG1.xml";

	
	public static String XMLOutputFolder1 ="C:\\HTML Report\\TestNGXML_Template";
	public static SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	public static Date now5 = new Date();
	public static  String strDate6 = sdfDate5.format(now5);
    public static String XMLOutputFolder = XMLOutputFolder1  +"\\"	+ "TestNGXML_" +  strDate6;
     
	public static String xlsFile="C://HTML Report//TestNGXML_Template//TC06.xls";
	public static String xlsFileSheet1="Sheet1";
	public static String xlsFileSheet2="Sheet2";
    
	
	public String TestCase,ExeuctionFlag,Browser;
	
	public String  TestSuite,PathClass;
	
	
	
    
    
	@Test
public void TestNG_Generate() throws Exception 
{
		
			   
		 String XMLOutputFileName= XMLOutputFolder  +".xml";
		 System.out.println("XMLOutputFileName"+XMLOutputFileName);
	 
	   
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		             new FileOutputStream(XMLOutputFileName), "utf-8"))) {
				writer.close();
						
			}catch (IOException ex) {} 
	
		File f1=new File(XMLSourceTemplate);
		File f2=new File(XMLOutputFileName);
		FileUtils.copyFile(f1, f2);  
		FileWriter fw = new FileWriter(XMLOutputFileName,true); 
		
	     ExcelApiTest3 eat = new ExcelApiTest3();
		 int numberowsInputdata=eat.getRowCount(xlsFile,xlsFileSheet1);
		
		 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,1,0)  + " ");
		 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,2,0)  + " ");
		 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,3,0)  + " ");
		
		 /*
		  * <?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd"> 
			<suite name="Suite" verbose="1" thread-count="3" parallel="methods">  */
	
		
		 for(int i=1;i<numberowsInputdata;i++)
		 {		 
			 
			 TestCase=eat.getCellData(xlsFile,xlsFileSheet1,i,0) ;
			 ExeuctionFlag=eat .getCellData(xlsFile,xlsFileSheet1,i,1) ;
			 Browser= eat.getCellData(xlsFile,xlsFileSheet1,i,2) ;
					
			 
				/*	 <Test name="All Tests">
				<classes>
				<class name="com.easy.entry.AddTestCase"> 
				 <methods> 
			  */
			 
			 fw.write("\n");		 
			 fw.write("\n  <test name=\"" + "Test_"  
			 		+ TestCase
			 		+ "\">    ");
			 
			 fw.write("\n <parameter name=\"Browser\" value=\""
				 		+ Browser
				 		+ "\" /> ");
			 
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,5,0)  + " ");
			
		
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,6,0)  + " ");
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,7,0)  + " ");
			 
	 
			 
			 if (ExeuctionFlag.equals("Yes"))
			 {
					
				 fw.write("\n <include name=\""
							+ TestCase
							+ "\"/>"  );

			 }
			 
			 if (ExeuctionFlag.equals("No"))
			 {
				 
				 fw.write("\n <exclude name=\""
							+ TestCase
							+ "\">"  );
			 }
			 
			 

			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,8,0)  + " ");
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,9,0)  + " ");
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,10,0)  + " ");
			 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,11,0)  + " ");
			
			 fw.write("\n");
			 /*	 
			  </methods> 
			  </class> 
			  </Test> 
				</classes>
	 	  */
			 
			 
		 }

	
		 

		//  </suite>
		 fw.write("\n "+ eat.getCellData(xlsFile,xlsFileSheet2,12,0)  + " ");
		 
		 fw.close();
	
	
}
}