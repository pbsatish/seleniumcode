package Day_020_Multiple_Windows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_Three_Tabs {
	
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/");

	//below line opens new tab
	((JavascriptExecutor)driver).executeScript("window.open()");
	((JavascriptExecutor)driver).executeScript("window.open()");

	
	//strore all the open windows in ArrayList string
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
	//Switch to New tab
	driver.switchTo().window(tabs.get(1));
	driver.get("http://google.com");	
	

	 
	driver.switchTo().window(tabs.get(0));
	//back to MainWindow
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	
	driver.switchTo().window(tabs.get(2));
	driver.get("https://facebook.com");
	
	//driver.quit();
	driver.close();
	
		
	}
	

}
