package  Day_028_WebTable_Examples;
//import MercuryDemoTours;


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

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;


import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.testng.annotations.*;
import java.io.File;
import java.io.*;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

import CommonUtil.OR;
import CommonUtil.TestBrowser;


public class Login

{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	

	public void Login(WebDriver driver )throws Exception
	{  
		this.driver=driver;
		
	}
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
	
	
	
	
	
	
		 
		 public   void openOrangeHRM()throws Exception
		 {

			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 
		 }
		 
		 
		 
		 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
		 {
			 
	
			 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
			

			findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
			
				
		 }
		 
		 
		 
		 public  void OrangeHRMSigninClick()throws Exception
		 {
			 
			 
			 	
			 	findElement(By.xpath(OR.login_click)).click();
		 }
		 
	


		 
}
	


	
	