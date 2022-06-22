package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonUtil.OR;


public class TC06_WebElement_isDisplayed {
	
WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				
				//OpenUrl
				driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
	
				Boolean str = driver.findElement(By.name("catName")).isDisplayed();
				
				if(str==true)
				System.out.println("Button displayed on WebPage");
				else
				System.out.println("Button is not displayed on WebPage");
				
				
				Assert.assertSame(str, true);
				

			
			}
			catch(Exception e)
			{
				System.out.println("Java Error Message :" +e.getMessage());
			}
			
			catch (AssertionError e) {
				
				System.out.println(" Assert Error Message :" +e.getMessage());
			}
			
			finally
			{
				driver.quit();
			}
			
			

		}
	

}
