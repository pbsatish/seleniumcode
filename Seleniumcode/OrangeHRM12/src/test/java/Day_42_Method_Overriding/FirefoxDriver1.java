package Day_42_Method_Overriding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonUtil.TestBrowser;

public class FirefoxDriver1 implements SeleniumWebDriver {
	
	WebDriver driver;
		
		
		@Override
		public WebDriver getDirver() throws Exception {
		 driver= TestBrowser.FirefoxBrowser();
			return driver;
		}
		

		@Override
		public void closeDriver() throws Exception {
			driver.close();
		}

}
