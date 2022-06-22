package  Day_021_Java_Script_Executer;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC02_Send_Keys 
{		
	
	WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
       // WebDriver driver= new FirefoxDriver();	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
         driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
        		
      	
        		
        //Launching the Site.		
        driver.get("https://opensource-demo.orangehrmlive.com/");			
      
           		
        //Login to Guru99 
       // WebElement username=driver.findElement(By.name("txtUsername"));
        
        
        //Creating the JavascriptExecutor interface object by Type casting		
        
        
        WebElement username=findElement(By.id("txtUsername"));
        WebElement password=findElement(By.name("txtPassword"));
        WebElement button =findElement(By.id("btnLogin"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;	
       
       
        js.executeScript("arguments[0].setAttribute('value','Admin')", username);
        js.executeScript("arguments[0].setAttribute('value','admin123')", password);
        js.executeScript("arguments[0].click();", button);
        
        
      //  findElement(By.id("menu_pim_viewPimModule")).click();
        
        WebElement pim1 =findElement(By.id("menu_pim_viewPimModule")); 
        js.executeScript("arguments[0].click();", pim1);
        
        //This  will scroll down the page by  1000 pixel vertical
         // js.executeScript("window.scrollBy(0,200)");
     
    }		
    
    
    
    
    
    public  WebElement findElement(By by) throws Exception 
   	{
   				
   		 WebElement elem = driver.findElement(by);    	    
   		
   		 
   		if (driver instanceof JavascriptExecutor) 
   		{
   		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
   	 
   		}
   		
   		return elem;
   	}
    
       
    
    
    
    
    
    
    
}