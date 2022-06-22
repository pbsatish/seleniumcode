package SamSung;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;



import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import java.util.Random;
//import org.apache.poi.ss.usermodel.CellType;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.util.*;

import java.io.*;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Hyperlink;

 
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.common.usermodel.*; 
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.io.FileUtils;
public class ExcelDataProvider
{
   public static FileInputStream fis = null;
    public static HSSFWorkbook workbook = null;
    public static HSSFSheet sheet = null;
    public static HSSFRow row = null;
    public static HSSFCell cell = null;
    public static FileOutputStream fout=null;

    
    
    
    //getRow count starts
   
      public static int getColumnCount(String xlFilePath, String sheetName) throws Exception
      {
      	

          row = sheet.getRow(0);
          int colNum = row.getLastCellNum();
          System.out.println("Total Number of Columns in the excel is : "+colNum);
          return colNum;
          
      
      }
      
      //getColumn count ends
    
    
    
    
    ////////////////////// Data Provider starts///////////////////////////////////////
    
    
    public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   
    	 

    	String[][] tabArray = null;
        
    
     
        try { 
     
        FileInputStream fis = new FileInputStream(FilePath);

        //ExcelWBook = new HSSFWorkbook(ExcelFile);
        workbook = new HSSFWorkbook(fis);
     
       // ExcelWSheet = ExcelWBook.getSheet(SheetName);
        sheet = workbook.getSheet(SheetName);
        

        int startRow = 1;
        int startCol = 0;
        int ci,cj;
        int totalRows = sheet.getLastRowNum();
             
        int totalCols = getColumnCount(FilePath,SheetName);
        tabArray=new String[totalRows][totalCols];
     
        ci=0;
        for (int i=startRow;i<=totalRows;i++, ci++) 
        {              
     
        	cj=0;
     
		        for (int j=startCol;j<totalCols;j++, cj++)
		        {
		            tabArray[ci][cj]=getCellData(i,j);
		        }
     
        }
     
        
        
     }catch (FileNotFoundException e){
     
	     System.out.println("Could not read the Excel sheet");
	     e.printStackTrace();
     
     }
     
     catch (IOException e){
	     System.out.println("Could not read the Excel sheet");
	     e.printStackTrace();
     }
     
     return(tabArray);
     
     }
     
public static String getCellData(int RowNum, int ColNum) throws Exception {
     
     try{
     
	    cell = sheet.getRow(RowNum).getCell(ColNum);

		 int dataType = cell.getCellType();
		     
		     if  (dataType == 3) {
		     
		     return "";
		     
		     }else{
		     
		     String CellData = cell.getStringCellValue();
		     
		     return CellData;
		     
		     }
	
		     
		    
		     
     }catch (Exception e){
     
  System.out.println(e.getMessage());
     
 throw (e);
     
     }
  }
 

 
     //////////////////////////////////////Data Provider ends//////////////////////
     
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


