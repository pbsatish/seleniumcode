//import MercuryDemoTours;

package  SamSung;
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


public class Banana4
{
	
			 WebDriver driver;
			 public  void Banana4(WebDriver driver )throws Exception
				{  
						  this.driver=driver;
				
				}
	

	
				
				public  void EnterCardDetails(String FirstName,String lastName,String meal1,
						String CardName,String CardNumber,String expirymonth,
						String expiryyear)throws Exception
				{
					
					
					driver.findElement(By.xpath(OR.BookFlightPage_FirstName)).sendKeys(FirstName);
					
					driver.findElement(By.xpath(OR.BookFlightPage_lastName)).sendKeys(lastName);
					Select listbox9 =new Select(driver.
					findElement(By.xpath(OR.BookFlightPage_meal1)));
					
					listbox9.selectByVisibleText(meal1);
							
					Select listbox8 =new Select(driver.
							findElement(By.xpath(OR.BookFlightPage_CardName)));
					
							listbox8.selectByVisibleText(CardName);
							
							driver.findElement(By.xpath(OR.BookFlightPage_CardNumber)).sendKeys(CardNumber);
					
					Select listbox10 =new Select(driver.
							findElement(By.xpath(OR.BookFlightPage_expirymonth)));
					
							listbox10.selectByVisibleText(expirymonth);
							
							Select listbox11 =new Select(driver.
							findElement(By.xpath(OR.BookFlightPage_expiryyear)));
							listbox11.selectByVisibleText(expiryyear);
					
									
					
				}
				
		
		public  void Page4_Continue_Click()throws Exception
		{
			driver.findElement(By.xpath(OR.BookFlightPage_SecurePurchase_Click)).click();
			
		}
			
				


		public  void GetOutputData(int i)throws Exception
		{
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 
				 
				String Output_FlightConfirmation_Number= driver.findElement(By.xpath(OR.Output_FlightConfirmation_Number)).getText();
				String Output_FlightBookingDate_Time= driver.findElement(By.xpath(OR.Output_FlightBookingDate_Time)).getText();
				String Output_DepartingDetails= driver.findElement(By.xpath(OR.Output_DepartingDetails)).getText();
				String Output_ReturningDetails= driver.findElement(By.xpath(OR.Output_ReturningDetails)).getText();
				String Output_PassengersDetails= driver.findElement(By.xpath(OR.Output_PassengersDetails)).getText();
				String Output_BilledToDetails= driver.findElement(By.xpath(OR.Output_BilledToDetails)).getText();
				String Output_DeliveryAddressDetails= driver.findElement(By.xpath(OR.Output_DeliveryAddressDetails)).getText();
				//String Output_TotalPrice= driver.findElement(By.xpath(OR.Output_TotalPrice)).getText();
				String Output_TotalTaxes= driver.findElement(By.xpath(OR.Output_TotalTaxes)).getText();
		
		
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,0,Output_FlightConfirmation_Number);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,1,Output_FlightBookingDate_Time);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,2,Output_DepartingDetails);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,3,Output_ReturningDetails);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,4,Output_PassengersDetails);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,5,Output_BilledToDetails);
				 eat.PutCellData( "E://TC25.xls","Sheet2",i,6,Output_DeliveryAddressDetails);
				 //eat.PutCellData( "E://TC25.xls","Sheet2",i,7,Output_TotalPrice);
				eat.PutCellData( "E://TC25.xls","Sheet2",i,8,Output_TotalTaxes);
				
		}


}
