package Day_001_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
driver.get() : It's used to go to the particular website , 
But it doesn't maintain the browser History and cookies so ,
we can't use forward and backward button , 
if we click on that , page will not get schedule */


/*
driver.navigate() : it's used to go to the particular website ,
but it maintains the browser history and cookies, 
so we can use forward and backward button to navigate between the pages 
during the coding of Testcase */




public class TC06_Driver_get_Commands {
	
WebDriver driver;	
		
		@Test
		public void login_test() throws Exception
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println("Title is "+actualTitle);
		
		 if (actualTitle.contentEquals("OrangeHRM")){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
		
		
		
		System.out.println("**************2nd Starts*********");
		
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Title is "+CurrentUrl);
		
		System.out.println("**************3rd Starts*********");
		
		String logInPanelHeading1=driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println("Panel Heading is "+logInPanelHeading1);
		
		System.out.println("**************4th Starts*********");
		
		System.out.println("Page Source"+driver.getPageSource());
		
		

	
		}
	

}
