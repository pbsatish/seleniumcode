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
import SamSung.*;
 
public class CommonUtility

{
	WebDriver driver;


	  public  void CommonUtility(WebDriver driver)throws Exception
		 {
		  
		  this.driver=driver;
			
		}
	  
	  public  void wait5seconds() throws Exception
		 {
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
							e.printStackTrace();
				}
		 }
	

		
	
		  public  void CloseBrowser( )throws Exception
			 {
	
			  driver.close();
				
			}
		  
		  public  void takeFullPageScreenShot() throws IOException {

			    JavascriptExecutor jsExec = (JavascriptExecutor) driver;

			    jsExec.executeScript("window.scrollTo(0, 0);"); //Scroll To Top

			    Long innerHeight = (Long) jsExec.executeScript("return window.innerHeight;");
			    Long scroll = innerHeight;

			    Long scrollHeight = (Long) jsExec.executeScript("return document.body.scrollHeight;"); 

			    scrollHeight = scrollHeight + scroll;

			    do{

			        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			        //Unique File Name For Each Screenshot
			        File destination = new File("E://screenshots//"+String.join("_", 
			        LocalDateTime.now().toString().split("[^A-Za-z0-9]"))+".jpg");

			        FileUtils.copyFile(screenshot, destination);

			        jsExec.executeScript("window.scrollTo(0, "+innerHeight+");");

			        innerHeight = innerHeight + scroll;

			    }while(scrollHeight >= innerHeight);
			}

		  
		  
			
	  
}