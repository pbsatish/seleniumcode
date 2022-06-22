package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JobsPsage
{
	
	WebDriver driver=null;
	
	public void JobsPsage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	

	
	public void AddJobs() throws Exception {
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales12");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales12 descr");
		findElement(By.id("jobTitle_note")).sendKeys("Sales12 Note");
		findElement(By.id("btnSave")).click();
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















