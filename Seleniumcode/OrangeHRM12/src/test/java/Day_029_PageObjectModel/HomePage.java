package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage
{
	
	WebDriver driver;
	
	public void HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	
	public   void Logout() throws Exception
	 {
				findElement(By.id("welcome")).click();
				findElement(By.linkText("Logout")).click();
	 }
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}















