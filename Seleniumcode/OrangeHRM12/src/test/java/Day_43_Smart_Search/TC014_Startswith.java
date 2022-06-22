package Day_43_Smart_Search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC014_Startswith {
	
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
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	
		
		findElement(By.xpath(Google_Input_text)).sendKeys("Selenium") ; 
		
	    List<WebElement>   rows = driver.findElements(By.xpath(KeyWordText));
	    
	    
	    for ( int i=1 ; i<=rows.size() ;i++)  // i=1;  i<=10 ; i=i+1
	    {
	   
	      		  
	      		  String str1="//*[starts-with(text(),'selenium')]//following::span["  + i +  "]";
	      	
	    		    WebElement Ele=findElement(By.xpath(str1));
	    		    Thread.sleep(500);
	    		   
	    	       String WebElementText = Ele.getText();
	    	       
	    	       System.out.println("Get Text Value is from the WebElement: " + WebElementText);
	    	       
	    	    if(WebElementText.equals("seleniumhq"))
	    	       { 
	    	    	   Ele.click();
	    	    	   break;
	    	        
	    	        //Once any method is executed, this break statement will take the flow outside of for loop
	    	       }
	    	       
	    	       
	    }     
	    	       

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
