package  Day_021_Java_Script_Executer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;			
import org.testng.annotations.Test;			



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TC01_JavaSE_ScrollByVisibleElement 
{		
	
	// To Open a new tab
	// When click or sendkeys is not working
	//To Scroll at particulater web element , where it is located
	
	
	
	
	
	WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
       // WebDriver driver= new FirefoxDriver();	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
         driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
        		
		//*[@id="footer"]
		 
     // Launch the application		
        driver.get("   https://www.amazon.in/");
       
        WebElement Element = findElement(By.linkText("Conditions of Use & Sale"));
        //WebElement Element1 = findElement(By.linkText("Privacy Notice"));
       // WebElement Element2 = findElement(By.linkText("Interest-Based Ads"));
     
        //How to do scrolling	
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        
       // js.executeScript("arguments[0].scrollIntoView();", Element1);
        //js.executeScript("arguments[0].scrollIntoView();", Element2);
        

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