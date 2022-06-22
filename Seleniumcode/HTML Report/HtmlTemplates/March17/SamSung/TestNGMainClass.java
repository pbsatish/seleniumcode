package SamSung;

import org.testng.annotations.Test;
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
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.reflections.Reflections;
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

public class TestNGMainClass {
	
	public static Actions127 actionKeywords;


	@SuppressWarnings("deprecation")
	

	@Test
	public void TCMAIN()  throws Exception {
		
		TestNG testSuite = new TestNG();
		

	
		testSuite.addListener(new Test5SuiteListener());
		testSuite.setDefaultSuiteName("My Test Suite14");
		
	

		 
		testSuite.setThreadCount(5);
	//	testSuite.setParallel("classes");
		testSuite.setParallel("methods");
		
		
		//testSuite.setDefaultTestName("Hyd");
		
		testSuite.setOutputDirectory("Users/sudhakar/eclipse-workspace/DemoMaven5/test-output");
		
		
		testSuite.setTestClasses(new Class[] { 
				
				MercuryDataDriverExecute3.class
			
				
				});
		
		
		testSuite.run();
		
		
		
	}
	
	
	
	@Test
	public void TCMAIN1()  throws Exception {
		
		Reflections reflections = new Reflections("SamSung");
		//Annotation[] annotations = Actions127.class.getAnnotations();
		Annotation[] annotations = Actions127.class.getAnnotations();
        Method[] methods = Actions127.class.getMethods();
        

        for(Method method1:methods) {
            method1.isAnnotationPresent(Test.class);
            System.out.println("Method name is "+method1.getName());
            
          //  method1.invoke(obj, args)
           // method1.invoke(actionKeywords);
            
          //  method1.invoke(actionKeywords);
            
            method1.invoke(actionKeywords);
            
            
        }
	}
        
       

        
        
      /*  for (int i=0;i<methods.length;i++)
		{   
			
			if (methods[i].getName().equals(actionKeywords))
			{
				methods[i].invoke(actionKeywords);
				break;
			} 
			
		} */
		
		


	@BeforeSuite
	public void invokebeforesuite()  throws Exception {
		
		 String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
		 String xlsFileSheet="Sheet1";
		
		ExcelApiTest3 eat = new ExcelApiTest3();
		eat.clearsheetdata(xlsFile,xlsFileSheet);
		

	
	}
	
@AfterSuite
	public void invokeAftersuite()  throws Exception {
		
		TestHTMLReporter5 TH5 = new TestHTMLReporter5();	
		TH5.Regression_CretaeHTMLFile();
		
		 

		
		
	}

	
	

}