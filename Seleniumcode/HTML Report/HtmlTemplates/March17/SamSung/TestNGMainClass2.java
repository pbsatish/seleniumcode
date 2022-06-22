package SamSung;

import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
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


import SamSung.ExcelDataProvider;

import org.testng.TestNG;

public class TestNGMainClass2 {


	@SuppressWarnings("deprecation")
	@Test
	public void TCMAIN()  throws Exception {
		
		TestNG myTestNG = new TestNG();
		
	/*	 List<String> TestNamesList = new ArrayList<>();
		  TestNamesList.add("TC01");
		  TestNamesList.add("TC02");
		  TestNamesList.add("TC03");
		  myTestNG.setTestNames(TestNamesList);*/
		
		Map <String,String> testngParams = new HashMap<String ,String >();
		testngParams.put("TC01", "chrome");
		

		XmlSuite mySuite=new XmlSuite();
		mySuite.setName("MySuite");
		

		
		
		List<String> TestNamesList = new ArrayList<>();
		  TestNamesList.add("TC01");
		  TestNamesList.add("TC02");
		  TestNamesList.add("TC03");
		  myTestNG.setTestNames(TestNamesList);
		  
		  
		XmlTest myTest= new XmlTest(mySuite);
		myTest.setName("TC01");
		myTest.setParameters(testngParams);
			
		myTest.setName("TC02");
		myTest.setParameters(testngParams);
		
		myTest.setName("TC03");
		myTest.setParameters(testngParams);
		
		
		List <XmlTest> myTests = new ArrayList <XmlTest>();
		myTests.add(myTest);
		
		
		mySuite.setTests(myTests);
		
		mySuite.setThreadCount(3);
	//	myTestNG.setParallel("classes");
		mySuite.setParallel("methods");

	
		myTestNG.addListener(new Test5SuiteListener());
		myTestNG.setDefaultSuiteName("My Test Suite13");
		
		

		
		
		myTestNG.setOutputDirectory("Users/sudhakar/eclipse-workspace/DemoMaven5/test-output");
		
		
		myTestNG.setTestClasses(new Class[] { 
				
				Actions127.class
			
				
				});
		
		
		myTestNG.run();
		
		
		
	}
	
	//@BeforeSuite
	public void invokebeforesuite()  throws Exception {
		
		 String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
		 String xlsFileSheet="Sheet1";
		
		ExcelApiTest3 eat = new ExcelApiTest3();
		eat.clearsheetdata(xlsFile,xlsFileSheet);
		

	
	}
	
	//@AfterSuite
	public void invokeAftersuite()  throws Exception {
		
		TestHTMLReporter5 TH5 = new TestHTMLReporter5();	
		TH5.Regression_CretaeHTMLFile();
	}
	
	
	

}