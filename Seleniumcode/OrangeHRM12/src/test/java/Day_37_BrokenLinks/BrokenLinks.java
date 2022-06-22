package  Day_37_BrokenLinks;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;

/*Let’s see some of the HTTP status codes.

200 – Valid Link
404 – Link not found
400 – Bad request
401 – Unauthorized
500 – Internal Error*/


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks
{
	WebDriver driver;
	
	@Test
	public void Open_OrangeHRM() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
		
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		System.out.println("Total links are "+links.size());	
			
			//used for loop to 
		for(int i=0; i<links.size(); i++) {
				WebElement element = links.get(i);
				//By using "href" attribute, we could get the url of the requried link
				String url=element.getAttribute("href");
				verifyLink(url);			
		}	
			
	}
	
	
	
	    //Verify Link method starts 
		public static void verifyLink(String urlLink) {
	        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
	        try {
				//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
				URL link = new URL(urlLink);
				// Create a connection using URL object (i.e., link)
				HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
				//Set the timeout for 2 seconds
				httpConn.setConnectTimeout(2000);
				//connect using connect method
				httpConn.connect();
				//use getResponseCode() to get the response code. 
					if(httpConn.getResponseCode()== 200) {	
						System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					}
					if(httpConn.getResponseCode()== 404) {
						System.out.println(urlLink+" - "+httpConn.getResponseMessage());
					}
				}
				//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			catch (Exception e) {
				//e.printStackTrace();
			}
	        //Verify Link method   ends

		
 }
}	
		
		
		
		
		
		
		
	
                                                  












