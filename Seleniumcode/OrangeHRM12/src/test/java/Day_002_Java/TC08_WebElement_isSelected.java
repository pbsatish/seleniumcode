package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonUtil.OR;


public class TC08_WebElement_isSelected {
	
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
				driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
				
				
				Boolean str = driver.findElement(By.xpath("//*[@id='Content']/div[1]/blockquote[1]/form/input[1]")).isSelected();
				
					if(str==true)
					System.out.println("Sunday check box already selected");
					else
					System.out.println("Sunday check box already selected");
					
				
				
			Assert.assertSame(str, true);
				
			
			}
			
			catch(NoSuchElementException nsee){
	            System.out.println(nsee.toString());
			}
			
			catch(TimeoutException e)
			{
				 System.out.println(e.toString());

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
