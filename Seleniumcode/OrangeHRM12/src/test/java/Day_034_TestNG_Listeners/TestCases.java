package Day_034_TestNG_Listeners;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;

import Day_034_TestNG_Listeners.TestBrowser;		


//@Listeners(Day_034_TestNG_Listeners.ListenerTest.class)	

public class TestCases {	
	

WebDriver driver;					

// Test to pass as to verify listeners .


@Test()
public void Test1() throws Exception				
{		
	
	driver = TestBrowser.OpenChromeBrowser();
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
    driver.findElement(By.name("password")).sendKeys("amUpenu");	
    driver.quit();
    				
}		

// Forcefully failed this test as to verify listener.		
@Test()		
public void Test2()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		


}