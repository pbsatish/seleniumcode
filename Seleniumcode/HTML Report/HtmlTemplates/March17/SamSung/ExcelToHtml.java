package SamSung;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class ExcelToHtml {
 
@Test
public void Fileupload() throws Exception{
 
File f1=new File("E:\\TC288888.htm");
File f2=new File("E:\\TC299999.html");


FileUtils.copyFile(f1, f2);

}
 
}
 