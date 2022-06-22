package SamSung;

import SamSung.*;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
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
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.lang.reflect.Constructor;
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MercuryDataDriverExecute3
{
	
	public void awaitTerminationAfterShutdown(ExecutorService threadPool) {
	    threadPool.shutdown();
	    try {
	        if (!threadPool.awaitTermination(60, TimeUnit.SECONDS)) {
	            threadPool.shutdownNow();
	        }
	    } catch (InterruptedException ex) {
	        threadPool.shutdownNow();
	        Thread.currentThread().interrupt();
	    }
	}	
	
	/*
	
@BeforeSuite
    public void BeforesuiteSetup1() throws Exception {
	
		
		  String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
		  String xlsFileSheet="Sheet1";
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 eat.clearsheetdata(xlsFile,xlsFileSheet);

    }  
	
	@AfterSuite
    public void AftersuiteSetup2() throws Exception {
		 
		 TestHTMLReporter5 TH5 = new TestHTMLReporter5();	
		 TH5.Regression_CretaeHTMLFile();
		
	}
	
	*/
	
	
	 @Test  
	 public  static void Execute_Sessions() throws Exception
	 {

		 
		 
		   int MYTHREADS = 3;   
		   ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		   
		    int NumberofTestScripts = 0;
			ExcelApiTest3 eat = new ExcelApiTest3();
			NumberofTestScripts=eat.getRowCount("E://Batch2Source//Regression1.xls","Sheet1");
			System.out.println("Numberof TestScripts Count Regression1.xls :"+NumberofTestScripts);
							
				for (int iRow1=1;iRow1<NumberofTestScripts;iRow1++)  // Number of Test Cases in Regression Sheet
				{
					Runnable worker = new DriverTest127(iRow1);
					Thread.sleep(3000);
		    		executor.execute(worker);
		    		
				}
				
			System.out.println("Finish tasks");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.HOURS);
			System.out.println("\nFinished all threads");
			
			
		}  //@Test Close
	 
	 
	 
	 
	}	

