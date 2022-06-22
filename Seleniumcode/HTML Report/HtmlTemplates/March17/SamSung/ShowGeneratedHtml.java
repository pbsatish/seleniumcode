package SamSung;
//import MercuryDemoTours;


import org.testng.annotations.Test;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import SamSung.*;

import java.awt.Desktop;
import java.io.*;


public class ShowGeneratedHtml {

    public static void main(String[] args)
    {
        try {
            //define a HTML String Builder
            StringBuilder htmlStringBuilder=new StringBuilder();
            //append html header and title
            htmlStringBuilder.append("<html><head><title>Selenium Test </title></head>");
            //append body
            htmlStringBuilder.append("<body>");
            //append table
            htmlStringBuilder.append("<table border=\"1\" bordercolor=\"#000000\">");
            //append row
            htmlStringBuilder.append("<tr><td><b>TestId</b></td><td><b>TestName</b></td><td><b>TestResult</b></td></tr>");
            //append row
            htmlStringBuilder.append("<tr><td>001</td><td>Login</td><td>Passed</td></tr>");
            //append row
            htmlStringBuilder.append("<tr><td>002</td><td>Logout</td><td>Passed</td></tr>");
            //close html file
            htmlStringBuilder.append("</table></body></html>");
            //write html string content to a file
            WriteToFile(htmlStringBuilder.toString(),"testfile.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteToFile(String fileContent, String fileName) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String tempFile = projectPath + File.separator+fileName;
        File file = new File(tempFile);
        // if file does exists, then delete and create a new file
        if (file.exists()) {
            try {
                File newFileName = new File(projectPath + File.separator+ "backup_"+fileName);
                file.renameTo(newFileName);
                
        System.out.println("newFileName"+newFileName);
        
        
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //write to file with OutputStreamWriter
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();

    }
}

	
	