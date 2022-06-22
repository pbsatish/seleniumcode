//import MercuryDemoTours;

package  SamSung;
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
 
public class Banana2
{
	WebDriver driver;
	public  void Banana2(WebDriver driver )throws Exception
	{  
			  this.driver=driver;
	}
	
	 	 
	 public  void MerucryFlightFinderBusiness(String PassengersCount,String DepartingFrom,
	 		String DepartingStartMonth,String DepartingStartDate,String ArrivingIn,
	 		String ReturningEndMonth,String ReturningEndDate,String Airline,String Radiobutton1,String ServiceClass ) throws Exception
	 {
		 

		 if(Radiobutton1.equals("OneWay"))
		 {	 
		   
		 //  apple1.driver.findElement(By.xpath(OR.MFFPage_RoundTripRadiobutton)).click();
		  driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();
		   
		 }
		 
		 if(Radiobutton1.equals("RoundTrip"))
		    	
		    {
		 
	    // apple1.driver.findElement(By.xpath(OR.MFFPage_OneWayRadiobutton)).click();
		 driver.findElement(By.xpath(OR.MFFPage_RoundTripRadiobutton)).click();
		 }
		 
		 

	 	Select listbox =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_PassengersCountListbox)));
	 	
	 	listbox.selectByVisibleText(PassengersCount);
	 	
	 	
	 	Select listbox1 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingFromListbox)));
	    
	     listbox1.selectByVisibleText(DepartingFrom);
	     
	 		
	 	Select listbox2 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingStartMonthListbox)));
	 	
	 	listbox2.selectByVisibleText(DepartingStartMonth);
	 		
	 	Select listbox3 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_DepartingStartDateListbox)));
	 	listbox3.selectByVisibleText(DepartingStartDate);
	 				
	 	Select listbox4 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_ArrivingIn)));
	 	listbox4.selectByVisibleText(ArrivingIn);	
	 	
	 	Select listbox5 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
	 	listbox5.selectByVisibleText( ReturningEndMonth);
	 				
	 	Select listbox6 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_ReturningEndDateListbox)));
	 	listbox6.selectByVisibleText(ReturningEndDate);
	 	
	 	driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();
	 	
	 	Select listbox7 =new Select(driver.
	 	findElement(By.xpath(OR.MFFPage_AirLineListbox)));
	 	listbox7.selectByVisibleText(Airline);
	 	
	 	if(ServiceClass.equals("Firstclass"))
	 	{
	 		driver.findElement(By.xpath(OR.MFFPage_FirstClassRadioButton)).click();

	 	}
	 	if(ServiceClass.equals("Economyclass"))
	 	{
	 		driver.findElement(By.xpath(OR.MFFPage_EconomyclassRadioButton)).click();

	 	}
	 	if(ServiceClass.equals("Businessclass"))
	 	{
	 		driver.findElement(By.xpath(OR.MFFPage_BusinessclassRadioButton)).click();

	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 }

	 
	 public  void Page2_Continue_Click()throws Exception
	 {
		 
		 driver.findElement(By.xpath(OR.MFFPage_ContinueButton)).click();
		
	 }
	 

}
