package Day_034_TestNG_Listeners;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
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
import org.openqa.selenium.firefox.FirefoxOptions;
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
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBrowser

{
	 public static String ChromedriverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	 public static String IEdriverPath = "C:\\IEDriver\\IEDriverServer64.exe";
	 public static String FirefoxdriverPath = "C:\\FireFoxDriver\\geckodriver.exe";
		

	 
	 

			@Test  
		  public  static   WebDriver OpenChromeBrowser()throws Exception
			 {
			
				// System.setProperty("webdriver.chrome.driver", ChromedriverPath);
			//	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				 
			/*	ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-notifications");
				 options.addArguments("--headless");
				 options.addArguments("--disable-extensions");
				 options.addArguments("--disable-gpu");
				 options.addArguments("--no-sandbox");
				options.addArguments("--disable-infobars"); */
	 			 WebDriver driver ; 
	 			//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\Chrome1\\chromedriver.exe");
	 			 
	 		//	WebDriver driver = new RemoteWebDriver("http://127.0.0.1:9515", DesiredCapabilities.chrome());
	 			//System.setProperty("webdriver.chrome.driver", ChromedriverPath);
	 	System.setProperty("webdriver.chrome.driver",ChromedriverPath);
			 driver =new ChromeDriver();
				 
			
				 driver.manage().window().maximize() ;	
				 return driver;
	 			 
				 
	 		 /*   WebDriverManager.chromedriver().setup();
	 		   driver = new ChromeDriver();
	 		  driver.manage().window().maximize() ;*/
			
				 
			     //capabilities.setCapability("network.proxy.http", "73.0.3683.68");
				// capabilities.setCapability("network.proxy.http_port", "9469");
				// ChromeDriverService service =
				  //new ChromeDriverService.Builder().withWhitelistedIps("").withVerbose(true).build();
				 //driver = new ChromeDriver(capabilities);
				 // driver.manage().window().maximize() ;
				 
				 
				 
				 //ChromeOptions options = new ChromeOptions();
				 //options.addArguments("--disable-notifications");
				// System.setProperty("webdriver.chrome.driver", ChromedriverPath);
				 
				// System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");

				    //ChromeOptions chromeOptions = new ChromeOptions();
				   // chromeOptions.addArguments("--verbose");
				    //chromeOptions.addArguments("--whitelisted-ips=''");
				    //chromeOptions.addArguments("--proxy-server=74.0.3729.6:27115");

				   // driver = new ChromeDriver();
				    //driver.get("http://www.whoishostingthis.com/tools/user-agent/");

				  //  ChromeOptions chromeOptions = new ChromeOptions();
				   // chromeOptions.addArguments("--verbose");
				   // chromeOptions.addArguments("--whitelisted-ips=''");
				 
					
			     // DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				//  ChromeDriverService service =new ChromeDriverService.Builder().withWhitelistedIps("").withVerbose(true).build();
				
			//	 System.setProperty("webdriver.chrome.driver",ChromedriverPath);
				 
				 
				 
				//driver = new ChromeDriver(chromeOptions); 
				 
				 //driver = new ChromeDriver(service, capabilities);
			
			}
		  
		  
		//  @Test  
		  public  static WebDriver OpenIEBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 System.setProperty("webdriver.ie.driver",IEdriverPath);
				 driver = new InternetExplorerDriver();
				 driver.manage().window().maximize() ;
				 return driver;
			}
		  
		  
		//  @Test  
		  public  static   WebDriver OpenFirefoxBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 FirefoxOptions options = new FirefoxOptions();
				 options.setCapability("marionette", true);
				// WebDriver WD = new FirefoxDriver(options);
				// WebDriver driver = new FirefoxDriver(options); 
				 
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 driver = new FirefoxDriver(options); 
				 driver.manage().window().maximize() ;	
				 return driver;
			 }
		  
		  
		//  @Test  
		  public  static void   CloseBrowser(WebDriver driver)throws Exception
			 {
			  
				driver.quit();	
			 
			 }
		  
		  
		  
		  
  
		  

}
	  
		  
		  
		  
		  
		  
		  
			
	  



/*  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
 public String baseUrl2 = "https://www.facebook.com/";
 public String baseUrl3 = "https://www.amazon.in/";*/





