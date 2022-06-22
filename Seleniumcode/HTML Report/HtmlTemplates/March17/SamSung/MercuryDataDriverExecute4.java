package SamSung;
import org.testng.annotations.Test;



import java.nio.file.*;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.IMethodInstance;
import org.testng.ITestContext;
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
import java.lang.annotation.Annotation;
import java.lang.reflect.*;



public class MercuryDataDriverExecute4
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
					Runnable worker = new DriverTest130(iRow1);
					Thread.sleep(3000);
		    		executor.execute(worker);
		    		
				}
				
			System.out.println("Finish tasks");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.HOURS);
			System.out.println("\nFinished all threads");
			
			
		}  //@Test Close
	 
	 
	 
	 
	}	

	

 class DriverTest130 implements Runnable {
	
	public static Actions129 actionKeywords;
	//public  String SBrowserType;
	public  Method method[];
	public   int iRow;
	
	public DriverTest130(int iRow1) {
		
		this.iRow=iRow1;
	}

	
	@Override
	public void run()  {
		try {
			
			  String str="Row Iteration " + String.valueOf(iRow);
			  System.out.println("Row Iteration  - :"+str);

			String sActions1,sActions1Flag,sRegressionSheetPath;
		  //sActions1 is for TC01 
		  //sActions1Flag is Yes or No
		  //sRegressionSheetPath Check TC01 in E:\ drive
			boolean result2 = false;
			ExcelApiTest3 eat = new ExcelApiTest3();
	   sActions1 = eat.getCellData("E://Batch2Source//Regression1.xls","Sheet1",iRow,1); 
	   sActions1Flag=eat.getCellData("E://Batch2Source//Regression1.xls","Sheet1",iRow,2); 
	
		  
	   System.out.println("sActions1" +sActions1);
	   System.out.println("sActions1Flag "+sActions1Flag);
	  
	   	     if (sActions1Flag.equals("Yes"))
	   	   	 {
				   		System.out.println("_____________Starts__________________");
				   		System.out.println("Execution Falg is :" +sActions1Flag);
	   		
		    				result2=methodExists(sActions1);
					    		if (result2)
					    		{
					    			execute_Actions(sActions1);
					    			
					    			ExcelApiTest3 eat3 = new ExcelApiTest3();
					    			eat3.PutCellData( "E://Batch2Source//Regression1.xls","Sheet1",iRow,4,"Passed");
					    			
					    		}
					    		else
					    		{
					    			ExcelApiTest3 eat3 = new ExcelApiTest3();
					    			System.out.println("This Method is not implemented in Actions Class :" +sActions1);	
					    			String str1="This Method is not implemented in Actions Class";
					    			eat3.PutCellData( "E://Batch2Source//Regression1.xls","Sheet1",iRow,4,str1);
					    			Thread.sleep(2000);
					    			
					    		} 
		    
				    	System.out.println("______________Ends___________________");
				     	System.out.println("");
				     	System.out.println("");
	    	
	   	   	}//if
	   	   	
	   	   	else
	   	   	{
	   	   		System.out.println("Execution Falg is either No selected :" +sActions1 );
	   	   		
    			ExcelApiTest3 eat3 = new ExcelApiTest3();
    			String str2="Skipped";
    			eat3.PutCellData( "E://Batch2Source//Regression1.xls","Sheet1",iRow,4,str2);
   
    			Thread.sleep(5000);
	   	   	}
	   	   
		}catch (Exception e) {
			
			 ExcelApiTest3 eat3 = new ExcelApiTest3();
			 
			 try {
				eat3.FailPutCellData( "E://Batch2Source//Regression1.xls","Sheet1",iRow,4,"Failed");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			e.printStackTrace();
		}// Try - Catch Block ends
		
	}// run method ends
	
	

	
    
	public void execute_Actions(String sActions) throws Exception
	{	
	    actionKeywords = new Actions129();
		
	    /*
		Reflections reflections = new Reflections("SamSung");
		Annotation[] annotations = Actions129.class.getAnnotations();
        Method[] methods = Actions129.class.getMethods();

        for(Method method1:methods) {
            method1.isAnnotationPresent(Test.class);
            System.out.println("Method name is "+method1.getName());
            
	            if (method1.getName().equals(sActions))
				{
					method1.invoke(actionKeywords);
					break;
				} 
	       
        }
        
        */
	
        
   
		for (int i=0;i<method.length;i++)
		{   
			
			if (method[i].getName().equals(sActions))
			{
				method[i].invoke(actionKeywords);
				break;
			} 
			
		}
		
		
		
		
	}  
	
	
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
        
	
	
	
	
	
	//methodExists  starts 
	
	public boolean methodExists(String sActions) throws Exception
	{
		actionKeywords = new Actions129();
		method= actionKeywords.getClass().getMethods();
		
		boolean result1 = false;
		
		for (int i=0;i<method.length;i++)
		{   
			
			if (method[i].getName().equals(sActions))
				result1 = true;
	
		} // for loop
		
		return result1;	
	}
	
	//methodExists  ends
	
	
	
	
	



		
	
}	
	
	