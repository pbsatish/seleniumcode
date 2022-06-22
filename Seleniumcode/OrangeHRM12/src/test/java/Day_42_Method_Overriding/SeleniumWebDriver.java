package Day_42_Method_Overriding;

import org.openqa.selenium.WebDriver;

public interface SeleniumWebDriver {
	
	public WebDriver getDirver() throws Exception;

	public void closeDriver() throws Exception;

}
