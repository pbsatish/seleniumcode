package SamSung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class sampleTest2 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WiniumDriver driver = null;
        String appPath = "E:\\Batch2\\TC01\\TC01_Chrome_Iteration_1_TC01_2019_02_17_07_43_50\\TC01_Chrome_Iteration_1_TC01_2019_02_17_07_43_50.xls";
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath(appPath);
        option.setDebugConnectToRunningApp(false);
        option.setLaunchDelay(2);
        driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        Thread.sleep(1000);

        
        
        //WebElement window =  driver.findElementByClassName("XLMAIN");
        //WebElement menuItem = window.findElement(By.id("Insert"));
       // menuItem.click();
       // driver.findElementByName("Scientific").click();
        
        /*
        WebElement window =  driver.findElementByClassName("CalcFrame");
        WebElement menuItem = window.findElement(By.id("MenuBar")).findElement(By.name("View"));
        menuItem.click();
        driver.findElementByName("Scientific").click();

        window.findElement(By.id("MenuBar")).findElement(By.name("View")).click();
        driver.findElementByName("History").click();

        window.findElement(By.id("MenuBar")).findElement(By.name("View")).click();
        driver.findElementByName("History").click();

        window.findElement(By.id("MenuBar")).findElement(By.name("View")).click();
        driver.findElementByName("Standard").click();

        driver.findElementByName("4").click();
        driver.findElementByName("Add").click();
        driver.findElementByName("5").click();
        driver.findElementByName("Equals").click();*/
       // driver.close();
        
        System.out.println("Program exit");
    }
}