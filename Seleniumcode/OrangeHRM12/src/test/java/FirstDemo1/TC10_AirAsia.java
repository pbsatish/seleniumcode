package FirstDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC10_AirAsia {
	
WebDriver driver;	

		public void login_test() throws Exception
		
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.airasia.com/");
		
		driver.findElement(By.id("home-origin-autocomplete-heatmap")).sendKeys("Hyderabad");
		driver.findElement(By.id("txtPasswordhome-destination-autocomplete-heatmap")).sendKeys("Bengaluru");
		driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();	
		driver.findElement(By.className("row flight-schedule"));	
		System.out.println("charges of flight");
		
		
		//driver.quit();
	
		}
	

}
