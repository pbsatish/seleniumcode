package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage
{
	
	WebDriver driver=null;
	
	//Delcaration /initializing of page specific webelements is known page object reposotory
	
	static String  UserName="//*[@id='txtUsername']";
	static String  Password="//*[@id='txtPassword']";
	static String  Loginbutton="//*[@id='btnLogin']";
	
	public void LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	

	
	public void Login() throws Exception {
		
		findElement(By.xpath(UserName)).sendKeys("Admin");
		findElement(By.xpath(Password)).sendKeys("admin123");
		findElement(By.xpath(Loginbutton)).click();
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















