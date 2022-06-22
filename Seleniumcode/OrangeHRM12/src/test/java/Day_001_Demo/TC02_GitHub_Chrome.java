package Day_001_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
<dependency>
  <groupId>io.github.bonigarcia</groupId>
  <artifactId>webdrivermanager</artifactId>
  <version>3.7.1</version>
   <scope>test</scope>
</dependency>

 <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.3</version>
</dependency>
*/

public class TC02_GitHub_Chrome {
	

WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();		
		
		
		
		
		}
	

}
