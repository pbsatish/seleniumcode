package Day_027_Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class DemoWebAlert {
	
	
	static WebDriver driver;
	
	@Test
	public static void Test6() throws NoAlertPresentException,InterruptedException  {									
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println("ALERT DISPLAYED as : "+alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	

}