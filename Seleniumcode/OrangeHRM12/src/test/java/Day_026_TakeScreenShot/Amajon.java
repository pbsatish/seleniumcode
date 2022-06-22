package Day_026_TakeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Amajon {

	  String baseUrl = "https://www.amazon.in/";
	  String driverPath = "C:\\chromedriver_win32\\Chrome1\\chromedriver.exe";
	  static WebDriver driver ; 

    
  @Test
  public void setBaseURL() throws Exception {
  	
	 driver = TestBrowser.OpenChromeBrowser();
		
	 driver.get(baseUrl);
	 
     Actions actions = new Actions(driver);   
     //WebElement ele=driver.findElement(By.xpath("//*[text()='Hello. Sign in']"));
     WebElement ele=driver.findElement(By.id("nav-link-accountList"));
     WebDriverWait wait=  new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.visibilityOf(ele));
	 
	 actions.moveToElement(ele).click().build().perform();
	 

	 Thread.sleep(5000);
	 
	   driver.findElement
	 (By.xpath(" //input[@type='email' and @maxlength='128' and  @id='ap_email' and  @name='email']"))
	   .sendKeys("sudhakarth2008@gmail.com"); 
	   //driver.findElement(By.xpath("span[text("Signin")]")).sendKeys("sudhakarth2008@gmail.com");
	   driver.findElement(By.id("continue")).click();
	   driver.findElement(By.id("ap_password")).sendKeys("babli1234");
	   driver.findElement(By.id("signInSubmit")).click();

			  
			  
	   
	  /* driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
	   driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("babli1234");
	   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();*/
      
 
    
    WebElement ele1=driver.findElement(By.id("nav-link-accountList"));
	WebDriverWait wait1=  new WebDriverWait(driver,30);
	wait1.until(ExpectedConditions.visibilityOf(ele1));
	actions.moveToElement(ele1).perform();
	
    
	WebElement ele2=driver.findElement(By.id("nav-item-signout"));
    //WebElement ele2=driver.findElement(By.xpath("//*[text()='Sign Out']"));
	WebDriverWait wait2=  new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.visibilityOf(ele2));
	actions.moveToElement(ele2).click().build().perform();
 	 
  	}

	  @AfterTest
	  public void afterTest() {
		  	driver.quit();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}
