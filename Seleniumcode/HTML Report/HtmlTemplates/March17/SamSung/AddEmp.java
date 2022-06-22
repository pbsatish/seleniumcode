//import MercuryDemoTours;

package  SamSung;
import org.testng.annotations.Test;

import SamSung.*;

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
import java.text.SimpleDateFormat;

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
/*
 Openbrowser
 openurL
 login
 Addemp
 logout
 */

 
public class AddEmp
{
	public String UserName,Password;
	public String FirstName,MiddleName,LastName,Id;
	
	public  int iRow;
	
	
	WebDriver driver;
	
	String HtmlOutputFileName="";
	String error;
	
	TestHTMLReporter6 TH3;
	
	//TestHTMLReporter6 TH3[]= new TestHTMLReporter6[8];

	//int iRow=10;
	//ArrayList <TestHTMLReporter6> arr = new ArrayList <TestHTMLReporter6> (4);
	
	
	public void  Fiveobjects() throws Exception
	{
		
		//arr.add(TH3);
		//arr.add(TH4);
		//arr.add(TH5);
	}
	
	
	//List <Object> objects= new ArrayList<Object>();
	
	//List <AddEmp> employees =new ArrayList<>();

	
	public  void AddEmp(WebDriver driver,String HtmlOutputFileName,TestHTMLReporter6 TH3 )throws Exception
	{  
			  this.driver=driver;
			  this.HtmlOutputFileName=HtmlOutputFileName;
			  this.TH3=TH3;
	}
	
	@Test
	public  void AddEmp_datadriventest( )throws Exception
	{  
		
		
		
		
		  ExcelApiTest3 eat = new ExcelApiTest3();
		  int numberowsInputdata=eat.getRowCount("D://TC01_AddEmp.xls","Sheet1");

				 for(int i=1;i<numberowsInputdata;i++)
				 {		 
					 UserName="Admin";
					 
					 Password="admin123";
					 
					
					 FirstName=eat.getCellData("D://TC01_AddEmp.xls","Sheet1",i,0);
					 MiddleName=eat.getCellData("D://TC01_AddEmp.xls","Sheet1",i,1);
					 LastName=eat.getCellData("D://TC01_AddEmp.xls","Sheet1",i,2);
					 Id=eat.getCellData("D://TC01_AddEmp.xls","Sheet1",i,3);
					 
					 
					 System.out.println("FirstName is"+FirstName);
					 System.out.println(" MiddleName is "+MiddleName);
					 System.out.println(" LastName is "+LastName);
					 System.out.println(" Id is "+Id);
					  iRow=i;
					  
						call_allmethods(iRow);
						
						
						
					 
				 }
			
				 
				 driver.quit();
				 
	}
	
	
	
	
	public   void call_allmethods(int iRow )throws Exception
	{  
		
		String str=String.valueOf(iRow);
			TH3= new TestHTMLReporter6();
		
		
		HtmlOutputFileName=TH3.CretaeHTMLFile("TC01_Add_Employee_Iteration_" + str,"Chrome");
		
		
		if (iRow==1)
		{
			
		driver=TestBrowser.OpenChromeBrowser();	
		
		Login l1=new Login();
		l1.Login(driver ,HtmlOutputFileName,TH3);
	
		l1.openOrangeHRM();
		l1.OrangeHRMlogin(UserName,Password);
		
		TH3.HTMLScreenShot("Enter user Name and Password","User Name and password Succefully Entered","Pass", HtmlOutputFileName,driver);
		l1.OrangeHRMSigninClick();

		
		}
		
		
		
		AddEmp AE =new AddEmp();
		AE.AddEmp(driver,HtmlOutputFileName,TH3 );
		AE.addEmp1(iRow, FirstName, MiddleName, LastName, Id);
		TH3.HTMLCloser(HtmlOutputFileName);
		TH3=null;
		System.gc();

		
	}	
	
	


	public   void addEmp1(int iRow,String FirstName,String MiddleName,String LastName,String Id )throws Exception
	{  
		
		System.out.println("reached here");
		try 
		{
		
		
		Actions actions = new Actions(driver);   
		System.out.println("reached here1");
		 WebElement ele=driver.findElement(By.xpath(OR.Emp_Pim_focus1));
		 actions.moveToElement(ele).click().perform();
		 TH3.HTMLScreenShot("Pim focus highlight","Pim  clicked Succefully ","Pass", HtmlOutputFileName,driver);
		 System.out.println("reached here2");
		 driver.findElement(By.xpath(OR.Emp_list_focus)).click();
		 TH3.HTMLScreenShot("Emp focus highlight","Emp focus highlighted Succefully ","Pass", HtmlOutputFileName,driver);
		 
		 driver.findElement(By.xpath(OR.Emp_pimadd_click)).click();
		 TH3.HTMLScreenShot("Click Emp pim Add  ","Emp PIM Add clicked","Pass", HtmlOutputFileName,driver);
		 
		 
		 driver.findElement(By.xpath(OR.Emp_firstname_sendkey)).sendKeys(FirstName);
		 TH3.HTMLScreenShot("Enter FirstName","FirstName Succefully Entered","Pass", HtmlOutputFileName,driver);
		
		 driver.findElement(By.xpath(OR.Emp_middlename_sendkey)).sendKeys(MiddleName);
		 TH3.HTMLScreenShot("Enter MiddleName","MiddleName Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		 
		 driver.findElement(By.xpath(OR.Emp_lastname_sendkey)).sendKeys(LastName);
		 TH3.HTMLScreenShot("Enter LastName","LastName Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		 
		 driver.findElement(By.xpath(OR.Emp_id_sendkey)).sendKeys(Id);
		 TH3.HTMLScreenShot("Enter Id","Id Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		 
		 driver.findElement(By.xpath(OR.Emp_save_click)).click();
		 
		
	
		} 
		catch(Exception e)
		{
			
		}
		 
		 
	}
	

/*

	@BeforeTest
    public void suiteSetup1() throws Exception {
		
		 String xlsFile="C://HTML Report//HtmlTemplates//TC05.xls";
		 String xlsFileSheet="Sheet1";
		 
		 ExcelApiTest3 eat = new ExcelApiTest3();
		 eat.clearsheetdata(xlsFile,xlsFileSheet);
    }  	
	
	@AfterTest
  
    public void AftersuiteSetup2() throws Exception {
		 
		 TestHTMLReporter6 TH4 = new TestHTMLReporter6();	
		 TH4.Regression_CretaeHTMLFile();
		 
		 
		
		
    }    
			
	*/
	
	
	
	
	
	
}