package Day_027_Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;


public class AlertDemo {
	
	static WebDriver driver;
            

                @Test
                public void testWebAlert() throws InterruptedException { 
                	
                	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
            		driver =new ChromeDriver();
            		driver.manage().window().maximize() ;	
                    // Alert Message handling
                	  driver.get("https://javascript.info/alert-prompt-confirm");
                	  
                                // clicking on try it button
                                driver.findElement(By.linkText("Run the demo")).click();
                                Thread.sleep(5000);

                                Alert alert = driver.switchTo().alert();
                                alert.sendKeys("Sudhakar");

                                Thread.sleep(5000);
                              //  System.out.println(driver.switchTo().alert().getText());
                                alert.dismiss();
                                
                                Thread.sleep(5000);
                                
                                alert.accept();
                                
                               // driver.quit();
                }


               
} 