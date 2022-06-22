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


public class Test5 {
	
	private static final String TimeUnits = null;
	public  String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	public  String xlsFileSheet="Sheet1";
	
	/*public WebDriver driver;
	public  void Test5(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
			  
	}*/
	
	

	@Test
	public  void MyHtm1() throws Exception {
		

		
		  TestHTMLReporter3 TH = new TestHTMLReporter3();
		  String HtmlOutputFileName= TH.CretaeHTMLFile("TC01_Add Employee","Chrome");
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
	  
		 WebDriver driver=TestBrowser.OpenChromeBrowser();
		  
		  //TH.driver=driver;
		 // TH.TestHTMLReporter3(driver);
		 	
		  driver.get("http://www.newtours.demoaut.com/");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
	
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver);
	
		 
		  TH.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
		  
		  
		
	}
	

	

	@Test
	public  void MyHtm2() throws Exception {
		
	

		  TestHTMLReporter3 TH1 = new TestHTMLReporter3();	  
		  String HtmlOutputFileName= TH1.CretaeHTMLFile("TC02_Add Employee","Chrome");
		  
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	

		  
		  WebDriver driver2=TestBrowser.OpenChromeBrowser();
		  
		 // driver2.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 // TH1.TestHTMLReporter3(driver);
		 // TH1.driver=driver;
		 	
		  driver2.get("http://www.newtours.demoaut.com/");
		  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver2);
		  
		  
	
		  
		  driver2.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH1.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver2);
	
	
		  
		  driver2.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH1.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver2);
		
		 
		  TH1.HTMLCloser(HtmlOutputFileName);
		  driver2.quit();
		  
		  
		
	}
	
	

	@Test
	public  void MyHtm3() throws Exception {
		


		 TestHTMLReporter3 TH2 = new TestHTMLReporter3();	  
		  String HtmlOutputFileName= TH2.CretaeHTMLFile("TC03_Add Employee","Chrome");
		  
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
		  WebDriver driver3=TestBrowser.OpenChromeBrowser();
		
		//  driver3.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
		  driver3.get("http://www.newtours.demoaut.com/");
		  TH2.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver3);

		  
		  driver3.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH2.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver3);
		  
	
		  
		  driver3.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH2.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver3);

		 
		  TH2.HTMLCloser(HtmlOutputFileName);
		  driver3.quit();
		  
		  
		
	}
	
	
	
		@BeforeSuite
	    public void suiteSetup1() throws Exception {
			 
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 eat.clearsheetdata(xlsFile,xlsFileSheet);
	    }  
		
		@AfterSuite
	    public void AftersuiteSetup2() throws Exception {
			 
			 TestHTMLReporter3 TH5 = new TestHTMLReporter3();	
			 TH5.Regression_CretaeHTMLFile();
			
			
	    }    
		
			
	
}

	
	