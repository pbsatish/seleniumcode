package Day_42_Method_Overriding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC01_Test {
	
	
	

	//String Nationality_xpath1 ="//*[starts-with(text(),'Nationalities')]";
	
	//String Nationality_xpath ="//*[starts-with(@id,'menu_admin_nationality')]";
	String Google_Input_text="//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input";


	@Test
	public void Test1()throws Exception
	{
		WebDriver driver;
		
		
		SeleniumWebDriver Chrome=new ChromeDriver1();
		driver=Chrome.getDirver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Google_Input_text)).sendKeys("Selenium") ; 
		
		Chrome.closeDriver();

	}
	
	
	
	@Test
	public void Test2()throws Exception
	{
		
		WebDriver driver;
		
		SeleniumWebDriver FireFOX=new FirefoxDriver1();
		driver=FireFOX.getDirver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Google_Input_text)).sendKeys("Selenium") ; 
		
		FireFOX.closeDriver();
	}
	
	

	
	
	
	
	
	
	
}
