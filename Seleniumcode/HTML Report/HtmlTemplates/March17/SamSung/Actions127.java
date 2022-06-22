package SamSung;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.TestNG;
import org.apache.commons.io.FileUtils;

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

import SamSung.ExcelDataProvider;

import MercuryDemoTours.OR;

import java.util.concurrent.TimeUnit;

import java.io.File;
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
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;


import java.lang.reflect.Method; 
public class Actions127 {
	

	 WebDriver driver;
	 
	 public  String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	 public  String xlsFileSheet="Sheet1";
	 
		String	 TestCase,ExecuteFlag,Browser;
		
	 

		@Test(enabled=false)
		public  void TC01() throws Exception {
			
			String nameofCurrMethod = new Object() {} 
            .getClass() 
            .getEnclosingMethod() 
            .getName(); 

            System.out.println("Name of current method: " + nameofCurrMethod); 
			
         ExcelApiTest3 eat = new ExcelApiTest3();
   		 int numberowsInputdata=eat.getRowCount("E://TC25.xls","Sheet1");
   		  
   		 
   		 for(int i=1;i<numberowsInputdata;i++)
   		 {	
					 TestCase=eat.getCellData("E://Batch2Source//Regression2.xls","Sheet1",i,1);
					 ExecuteFlag=eat.getCellData("E://Batch2Source//Regression2.xls","Sheet1",i,2);		 		
					 Browser=eat.getCellData("E://Batch2Source//Regression2.xls","Sheet1",i,3);	
					
						 if(Browser.equalsIgnoreCase("FireFox"))
							  driver=TestBrowser.OpenFirefoxBrowser();
						else if(Browser.equalsIgnoreCase("Chrome"))
							  driver=TestBrowser.OpenChromeBrowser();
						else if(Browser.equalsIgnoreCase("IE"))
							  driver=TestBrowser.OpenIEBrowser();

		
   		 }
						
   		 
   		 				
	
		
   		 
   		 
   		 	System.out.println("TestCase Name is : "+nameofCurrMethod);
   		 
	
	

			 TestHTMLReporter5 TH3 = new TestHTMLReporter5();	  
			  String HtmlOutputFileName= TH3.CretaeHTMLFile("TC01_Add Employee","Chrome");
			  
			  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		
			  WebDriver driver4=TestBrowser.OpenChromeBrowser();
			
			//  driver3.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  
			  driver4.get("http://www.newtours.demoaut.com/");
			  TH3.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver4);

			  
			  driver4.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH3.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver4);
			  
		
			  
			  driver4.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH3.HTMLScreenShot("Enter Password","	Succefully passed ","Fail", HtmlOutputFileName,driver4);

			 
			  TH3.HTMLCloser(HtmlOutputFileName);
			  driver4.quit();
			  
		
		}
		
		/*@Test
		public  void TC02() throws Exception {
	


			  TestHTMLReporter5 TH1 = new TestHTMLReporter5();	  
			  String HtmlOutputFileName= TH1.CretaeHTMLFile("TC02_Add Employee","Chrome");
			  
			  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		

			  
			  WebDriver driver2=TestBrowser.OpenChromeBrowser();
			  
			 // driver2.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 // TH1.TestHTMLReporter3(driver);
			 // TH1.driver=driver;
			 	
			  driver2.get("http://www.newtours.demoaut.com/");
			  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Fail", HtmlOutputFileName,driver2);
			  
			  
		
			  
			  driver2.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver2);
		
		
			  
			  driver2.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH1.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver2);
			
			 
			  TH1.HTMLCloser(HtmlOutputFileName);
			  driver2.quit();
			  
		
		}
		
		@Test
		public  void TC03() throws Exception {
	


			  TestHTMLReporter5 TH1 = new TestHTMLReporter5();	  
			  String HtmlOutputFileName= TH1.CretaeHTMLFile("TC03_Add Employee","Chrome");
			  
			  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		

			  
			  WebDriver driver3=TestBrowser.OpenChromeBrowser();
			  
			 // driver2.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 // TH1.TestHTMLReporter3(driver);
			 // TH1.driver=driver;
			 	
			  driver3.get("http://www.newtours.demoaut.com/");
			  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver3);
			  
			  
		
			  
			  driver3.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver3);
		
		
			  
			  driver3.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH1.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver3);
			
			 
			  TH1.HTMLCloser(HtmlOutputFileName);
			  driver3.quit();
			  
		
		}
	 */
		
		
		
	 
}