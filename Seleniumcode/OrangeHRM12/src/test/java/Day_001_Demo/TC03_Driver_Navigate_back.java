package Day_001_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC03_Driver_Navigate_back {
	
WebDriver driver;	
		
		@Test
		public void login_test() throws Exception
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://google.co.in");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		

		
	
		}
	

}
