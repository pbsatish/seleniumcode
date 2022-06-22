package FAQS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class TC001_NoSuchElementException {
	
	
	WebDriver driver;
	
	//https://www.seleniumhq.org/exceptions/stale_element_reference.jsp

	@Test
	public void Open_Mercury() throws Exception {
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://www.encodedna.com/2013/07/dynamically-add-remove-form-elements-using-jquery-demo.htm");
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










/*
 * 
 * NoSuchElementException
NoSuchWindowException
NoSuchFrameException
NoAlertPresentException
InvalidSelectorException
ElementNotVisibleException
ElementNotSelectableException
TimeoutException
NoSuchSessionException
StaleElementReferenceException
 */






