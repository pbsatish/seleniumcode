 package Day_38_Selenium_Grid;
 
 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
 import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
 import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
//http://learn-automation.com/selenium-grid-for-remote-execution/
//https://www.youtube.com/watch?v=kAvzKA9wsbo
//https://selenium.dev/documentation/en/grid/setting_up_your_own_grid/

 public class SeleniumGrid {
	 
	 
     WebDriver driver;


   
     
     @Test
     public void Test2() throws MalformedURLException,Exception
     {
      
    	
    	  
    	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    	  
    	    ChromeOptions options = new ChromeOptions();
    		DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			
    	  driver = new RemoteWebDriver(new URL("http://localhost:4444/"), capabilities);
    	  
    		driver.manage().window().maximize() ;	
    		driver.get("https://opensource-demo.orangehrmlive.com/");
    		
    		findElement(By.name("txtUsername")).sendKeys("Admin");
    		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    		findElement(By.id("txtPassword")).sendKeys("admin123");
    		findElement(By.id("btnLogin")).click();	
    		
    		 findElement(By.linkText("Admin")).click();
    		 findElement(By.linkText("Nationalities")).click();
    		 findElement(By.name("btnAdd")).click();
    		 findElement(By.id("nationality_name")).sendKeys("Indian125");
    		 findElement(By.id("btnSave")).click();	
    		 
    		
    		 WebElement Element1 = findElement(By.linkText("Indian125"));
    		 JavascriptExecutor js = (JavascriptExecutor) driver;
    		 js.executeScript("arguments[0].scrollIntoView();", Element1);
    			
    		 	  
    		 driver.quit();	 
          
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
  		
  	
     
     
     
     


 }