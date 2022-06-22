package  SamSung;
//import MercuryDemoTours;


import org.testng.annotations.Test;

import SamSung.TestHTMLReporter6;

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


public class Login

{
	
	
	
	WebDriver driver;
	TestHTMLReporter6 TH3;	
	String HtmlOutputFileName;
	String error;
	
	public  void Login(WebDriver driver,String HtmlOutputFileName,TestHTMLReporter6 TH3  )throws Exception
	{  
			  this.driver=driver;
			  this.HtmlOutputFileName=HtmlOutputFileName;
			  this.TH3=TH3;
	}
	
	
		 
		 public  void openOrangeHRM()throws Exception
		 {

			 driver.get("https://opensource-demo.orangehrmlive.com/");

		 }
		 
		 public  void OrangeHRMlogin(String Username,String Password)throws Exception
		 {
			 
		 //driver.findElement(By.xpath(OR.username)).sendKeys("Admin");
		// driver.findElement(By.xpath(OR.password)).sendKeys("admin123");
		
			 driver.findElement(By.xpath(OR.username_sendkey)).sendKeys(Username);
			 
			 TH3.HTMLScreenShot("Enter user Name ","User Name Succefully Entered","Pass", HtmlOutputFileName,driver);
			 
			 
			 driver.findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
			 TH3.HTMLScreenShot("Enter Password","password Succefully Entered","Pass", HtmlOutputFileName,driver);
				
		 }
		 
		 
		 
		 public  void OrangeHRMSigninClick()throws Exception
		 {
			 
			 	driver.findElement(By.xpath(OR.login_click)).click();
			 	
		 }
		 
	


		 
}
	


	
	