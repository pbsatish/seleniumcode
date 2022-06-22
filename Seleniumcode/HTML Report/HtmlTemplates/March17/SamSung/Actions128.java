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
import org.junit.runner.RunWith;

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


//@RunWith(JUnitParamsRunner.class)
public class Actions128 {
	
	 WebDriver driver;

	@BeforeTest
	public  void BeforeTest_AnyTest() throws Exception 
	{
		
	
			  driver=TestBrowser.OpenChromeBrowser();
			  driver=TestBrowser.OpenIEBrowser();
			  driver=TestBrowser.OpenFirefoxBrowser();
		
			
	}
	
	
	
	
//@Parameters({"Browser"})

 //@Parameters(source = MyContainsTestProvider.class))
@Test
	public  void Test_TC01() throws Exception 
	
	{
		
		
		  TestHTMLReporter5 TH3 = new TestHTMLReporter5();	  
		  String HtmlOutputFileName= TH3.CretaeHTMLFile("TC01_Add Employee","Chrome");
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);

		
				try 
				{
				
			  driver.get("http://www.newtours.demoaut.com/");
			  TH3.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver);
			  
			  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
			  TH3.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
					  
			  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
			  TH3.HTMLScreenShot("Enter Password","	Succefully passed ","Fail", HtmlOutputFileName,driver);
	          
		}
		catch (AssertionError e)
		{ 
			String errormessage=e.getMessage();
			TH3.HTMLScreenShot(errormessage,errormessage,"Fail", HtmlOutputFileName,driver);
		}
		
		
		catch(Exception e) { 
			
			String errormessage=e.getMessage();
			TH3.HTMLScreenShot(errormessage,errormessage,"Fail", HtmlOutputFileName,driver);
		}
		
		finally{
			
			 TH3.HTMLCloser(HtmlOutputFileName);
			 driver.quit();
		}
		
	
	}
	
	  }

		

	/*
	@Test(enabled=true)
	public  void TC02() throws Exception {
		

		
		  TestHTMLReporter5 TH = new TestHTMLReporter5();
		  String HtmlOutputFileName= TH.CretaeHTMLFile("TC02_Add Employee","Chrome");
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
	  
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
	public  void TC03() throws Exception {
		

		
		  TestHTMLReporter5 TH = new TestHTMLReporter5();
		  String HtmlOutputFileName= TH.CretaeHTMLFile("TC08_Add Employee","Chrome");
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
	  
		// WebDriver driver=TestBrowser.OpenChromeBrowser();
		
		  driver.get("http://www.newtours.demoaut.com/");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
	
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver);
	
		 
		  TH.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
		  
		  
		
	}	*/
	

	

	
	

	
	
	
	
	/*
	 * 
	 * 
	 * String sTestCaseName,String sUserName,String sPassword
	 Boolean b = Boolean.valueOf("true");
	
	boolean b = string.equalsIgnoreCase("true") || string.equalsIgnoreCase("yes") || string.equalsIgnoreCase("y")
			 // Assert.fail("No exception was thrown");
		  
		 // Assert.assertEquals("Hai","Hai1");
		  * 
		  *  
	

	 /*
	String sname;
	 List<String> TestNamesList = new ArrayList<>();
	 
public List<String>	 ActionsInputData()
	 {
		
		  TestNamesList.add("TC01");
		  TestNamesList.add("chrome");
		  TestNamesList.add("Y");
		
		  
		return TestNamesList;
	 }


	 public  void Actions124(String browser )throws Exception
		{  
			
		 
			if(browser.equalsIgnoreCase("firefox"))
				  driver=TestBrowser.OpenFirefoxBrowser();
			else if(browser.equalsIgnoreCase("chrome"))
				  driver=TestBrowser.OpenChromeBrowser();
			else if(browser.equalsIgnoreCase("ie"))
				  driver=TestBrowser.OpenIEBrowser();
			else
				throw new Exception("Browser is not correct");
		
		  
		}  
*/
	


/*
@BeforeTest
	public void Actions124() throws Exception{
		
	
	
		
				List<String> TestNamesList=ActionsInputData();
				TestNamesList.get(1);
				
				for (Method method : Actions124.class.getDeclaredMethods()) 
				{
									
									if ( method.getName().equals("TC01"))
									{
										 sname = method.getName();
										 break;
			
									}
				}
				
				
						
						
			  
		
				
				
	}
	
	*/
	


	

