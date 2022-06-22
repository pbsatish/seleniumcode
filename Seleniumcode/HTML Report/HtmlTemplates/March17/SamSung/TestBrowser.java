package SamSung;

import org.testng.annotations.Test;




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
 
public class TestBrowser

{
	 public static String ChromedriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	 public static String IEdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
	 public static String FirefoxdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\geckodriver-v0.24.0-win64\\geckodriver.exe";
		
		  @Test  
		  public  static   WebDriver OpenChromeBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
				 System.setProperty("webdriver.chrome.driver",ChromedriverPath);
				 driver = new ChromeDriver(options); 
				 driver.manage().window().maximize() ;	
				 return driver;
			}
		  
		  
		  @Test  
		  public  static WebDriver OpenIEBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 System.setProperty("webdriver.ie.driver",IEdriverPath);
				 driver = new InternetExplorerDriver();
				 driver.manage().window().maximize() ;
				 return driver;
			}
		  
		  
		  @Test  
		  public  static   WebDriver OpenFirefoxBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 driver = new FirefoxDriver();
				 driver.manage().window().maximize() ;	;
				 return driver;
			 }
			
	  
}


/*  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
 public String baseUrl2 = "https://www.facebook.com/";
 public String baseUrl3 = "https://www.amazon.in/";*/





