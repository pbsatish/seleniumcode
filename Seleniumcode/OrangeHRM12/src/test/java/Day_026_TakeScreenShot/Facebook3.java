package Day_026_TakeScreenShot;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import CommonUtil.*;

public class Facebook3 {
	
    public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 

  @Test
  public void b_verifyHomepageTitle() throws Exception{
	  
	  
	  driver = TestBrowser.OpenChromeBrowser();
	  
	  ChromeOptions ops = new ChromeOptions();
      ops.addArguments("--disable-notifications");
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver(ops);
	  
	  String TestURL = "https://www.facebook.com/";
	  driver.get(TestURL);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath(" //*[@id='email'] ")).clear();
	  driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys("sudhakarth2009@gmail.com");
      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("babli12345");
      driver.findElement(By.xpath("//input[@value='Log In'  and @aria-label='Log In']")).click();
	  
     driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
     driver.findElement
     (By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
     
     driver.quit();
    
	}   
}                                   
