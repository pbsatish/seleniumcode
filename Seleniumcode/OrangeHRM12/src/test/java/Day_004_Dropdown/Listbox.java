package  Day_004_Dropdown;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.*;
//import org.openqa.selenium.support.ui.*;

public class Listbox
{
	
	//Test1 will be executed driver
	static WebDriver driver;
	
	

	@Test
	public void Test1() throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		String TestURL = "http://newtours.demoaut.com/";
		driver.get(TestURL);
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		Select dropdown2 = new Select(driver.findElement(By.name("passCount")));
		dropdown2.selectByIndex(1);
		
		
		
		
		/*
		0,1,2
		<select name="passCount">
        <option value="1">1 </option>
        <option value="2">2 </option>
        <option value="3">3 </option>
        <option value="4">4 </option>
      </select>
      
      
      <select name="passCount">
                <option value="1">1 </option>
                <option value="2">2 </option>
                <option value="3">3 </option>
                <option value="4">4 </option>

              </select>
      
      */
		Select dropdown3 = new Select(driver.findElement(By.name("fromMonth")));
		
		//dropdown3.selectByVisibleText("June");
		
		//dropdown3.selectByIndex(0);
		dropdown3.selectByValue("11");
		
		/*<select name="fromMonth">
		<option value="1">January
		</option><option value="2">February
		</option><option value="3">March
		</option><option value="4">April
		</option><option value="5">May
		</option><option value="6">June
		</option><option value="7">July
		</option><option value="8">August
		</option><option value="9">September
		</option><option selected="" value="10">October
		</option><option value="11">November
		</option><option value="12">December
		</option></select> */
		
		

		
	
		//driver.close();
	}
	

	
	
	
	
	
	
	
}





/*
<select name="passCount">
<option value="1">1 </option>
<option value="2">2 </option>
<option value="3">3 </option>
<option value="4">4 </option>

</select>

*/


/*
<select name="fromMonth">
<option value="1">January
</option><option value="2">February
</option><option value="3">March
</option><option value="4">April
</option><option value="5">May
</option><option value="6">June
</option><option value="7">July
</option><option value="8">August
</option><option value="9">September
</option><option selected="" value="10">October
</option><option value="11">November
</option><option value="12">December
</option></select>

*/


