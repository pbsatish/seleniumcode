package  Day_026_TakeScreenShot;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.*;

public class mercurytest3
{
	
	//Test1 will be executed driver
	static WebDriver driver;
	
	

	@Test
	public void Test1() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
	
		String TestURL = "http://newtours.demoaut.com/";
		driver.get(TestURL);
		
		driver.findElement(By.xpath(OR.pavan_mercuryusername)).sendKeys("mercury");
		driver.findElement(By.xpath(OR.pavan_mercyrypwd)).sendKeys("mercury");
		driver.findElement(By.xpath(OR.pavan_mercurylogin)).click();
		
		Select dropdown = new Select(driver.findElement(By.name("passCount")));
		dropdown.selectByIndex(0);
		
	
		Select dropdown1 = new Select(driver.findElement(By.name("fromMonth")));
		//dropdown1.selectByVisibleText("March");
		dropdown1.selectByValue("4");
		
		
		
		

		
		
	
		//driver.close();
	}
	

	
	
	
	
	
	
	
}












