package SamSung;

import org.openqa.selenium.JavascriptExecutor;

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

public class Actions125 {
	
	

	private static final String TimeUnits = null;
	public  String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	public  String xlsFileSheet="Sheet1";
	
	
	

	@Test
	public  void TC03() throws Exception {
		
		  TestHTMLReporter5 TH3 = new TestHTMLReporter5();	  
		  String HtmlOutputFileName= TH3.CretaeHTMLFile("TC03_Add Employee","Chrome");
		  
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
		  WebDriver driver4=TestBrowser.OpenChromeBrowser();
		
		  
		  driver4.get("http://www.newtours.demoaut.com/");
		  TH3.HTMLScreenShot("Open Browser","	Succefully Entered","Pass", HtmlOutputFileName,driver4);

		  
		  driver4.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver4);
		  
	
		  
		  driver4.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH3.HTMLScreenShot("Enter Password","	Succefully passed ","Fail", HtmlOutputFileName,driver4);

		 
		  TH3.HTMLCloser(HtmlOutputFileName);
		  driver4.quit();
		  
		  
		
	}
	
	

	@Test
	public  void TC04() throws Exception {
		

		
		  TestHTMLReporter5 TH = new TestHTMLReporter5();
		  String HtmlOutputFileName= TH.CretaeHTMLFile("TC04_Add Employee","Chrome");
		  System.out.println("HtmlOutputFileName path is : "+HtmlOutputFileName);
	
	  
		 WebDriver driver=TestBrowser.OpenChromeBrowser();
		
		  driver.get("http://www.newtours.demoaut.com/");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
		 
		  
		  driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter  user Name","	Succefully Entered","Pass", HtmlOutputFileName,driver);
	
		  
		  driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		  TH.HTMLScreenShot("Enter Password","	Succefully passed ","Pass", HtmlOutputFileName,driver);
	
		 
		  TH.HTMLCloser(HtmlOutputFileName);
		  driver.quit();
		  
		  
		
	}
	




}