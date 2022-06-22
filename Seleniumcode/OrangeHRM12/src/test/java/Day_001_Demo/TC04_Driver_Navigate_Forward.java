package Day_001_Demo;

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




public class TC04_Driver_Navigate_Forward {
	
WebDriver driver;	
		
		@Test
		public void login_test() throws Exception
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://google.co.in");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	
		}
	

}
