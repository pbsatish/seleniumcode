package Day_43_Smart_Search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC015_ToolTip {
	
	WebDriver driver;
	

	//String Nationality_xpath1 ="//*[starts-with(text(),'Nationalities')]";
	
	//String Nationality_xpath ="//*[starts-with(@id,'menu_admin_nationality')]";
	
	

		String Google_Input_text="//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input";
	
		String KeyWordText ="//*[starts-with(text(),'selenium')]";

	@Test
	public void Test1()throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
		
		driver.get("http://demo.guru99.com/test/social-icon.html");					
        String expectedTooltip = "Github";	
        
        // Find the Github icon at the top right of the header		
        WebElement github = findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));	
        
        Thread.sleep(5000);
        //get the value of the "title" attribute of the github icon		
        String actualTooltip = github.getAttribute("title");	
        
        String Hyperlink_text = github.getAttribute("href");	
        
        //Assert the tooltip's value is as expected 		
        System.out.println("Actual Title of Tool Tip : "+actualTooltip);
        
        System.out.println("Hyperlink_text attribute values : "+Hyperlink_text);
        
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
       // driver.close();			
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
