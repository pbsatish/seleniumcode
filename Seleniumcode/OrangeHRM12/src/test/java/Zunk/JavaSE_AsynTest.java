package  Zunk;

import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSE_AsynTest 
{				
    @Test		
    public void Login() 					
    {		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("https://opensource-demo.orangehrmlive.com/");			
        		
      //Set the Script Timeout to 20 seconds		
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);			
           
        //Declare and set the start time		
        long start_time = System.currentTimeMillis();        
        System.out.println("Start time: " + start_time);
                 
        //Call executeAsyncScript() method to wait for 5 seconds		
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");		
        System.out.println("Current time: " + (System.currentTimeMillis()) );
       
        //Get the difference (currentTime - startTime)  of times.		
       System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));					
       driver.quit();    		
    }		
    
    
    
    
    
    /*
     * 
     * How To Handle AJAX Calls Using Selenium WebDriver

 
Last Updated on April 7, 2017 by Rajkumar 8 Comments
https://www.softwaretestingmaterial.com/handle-ajax-calls-using-selenium/

Handle Ajax Calls using Selenium:
Handling AJAX calls is one of the common issues when using Selenium WebDriver. We wouldn’t know when the AJAX call would get completed and the page has been updated. In this post, we see how to handle AJAX calls using Selenium.


AJAX stands for Asynchronous JavaScript and XML. AJAX allows the web page to retrieve small amounts of data from the server without reloading the entire page. AJAX sends HTTP requests from the client to server and then process the server’s response without reloading the entire page. To handle AJAX controls, wait commands may not work. It’s just because the actual page is not going to refresh.

When you click on a submit button, required information may appear on the web page without refreshing the browser. Sometimes it may load in a second and sometimes it may take longer. We have no control on loading time. The best approach to handle this kind of situations in selenium is to use dynamic waits (i.e. WebDriverWait in combination with ExpectedCondition)
     * 
     * 
     */
    
    
    
    
    
    
    
    
}