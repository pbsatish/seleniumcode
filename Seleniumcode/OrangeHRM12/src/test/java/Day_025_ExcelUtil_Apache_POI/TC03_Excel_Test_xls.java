package Day_025_ExcelUtil_Apache_POI;

import ExcelUtil.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.testng.annotations.Test;


public  class TC03_Excel_Test_xls
{
	public FileInputStream fis = null;
    public HSSFWorkbook workbook = null;
    public HSSFSheet sheet = null;
    public HSSFRow row = null;
    public HSSFCell cell = null;
    public FileOutputStream fout=null;
	
    @Test
    public void hello()throws Exception
    {
    	
    	TC03_Excel_Test_xls eat=new TC03_Excel_Test_xls();
    	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport2.xls","Sheet1",0,0,"Admin");
    	eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_EMPExport2.xls","Sheet1",0,1,"admin123");
    }
    
    
    public  void PutCellData(String xlFilePath,String sheetName,int rowNum,int column,String Text)
    		throws Exception
    {
    	
   	 
   	 	fis = new FileInputStream(xlFilePath);
        workbook = new HSSFWorkbook(fis);
    	sheet = workbook.getSheet(sheetName);
    	
    	if(sheet.getRow(rowNum)==null)
    	{
    		row=sheet.createRow(rowNum);
    	}
    	else
    	{
    		row=sheet.getRow(rowNum);
    	}
    	
    	
    	if(row.getCell(column)==null)
    	{
    		cell=row.createCell(column);
    	}
    	else
    	{
    		cell=row.getCell(column);
    	}
 
    	
    	
    	cell = sheet.getRow(rowNum).getCell(column);  
    	cell.setCellValue(Text);
    	
    	
         
         CellStyle cs1 = workbook.createCellStyle(); 
         cs1.setFillForegroundColor(IndexedColors.WHITE.getIndex()); 
         cs1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
     
         Font font = workbook.createFont();
         font.setColor(IndexedColors.BLUE.getIndex());
         font.setBold(false);
         cs1.setFont(font);
   
    	
    	//System.out.println("Text:"+Text);
    	cell.setCellStyle(cs1);
    	
    	cell.setCellValue(Text);
    	
    	

    	//fout= new FileOutputStream(xlFilePath); 
    	
    	fout= new FileOutputStream(xlFilePath);
    	workbook.write(fout);
     
        fout.flush();
        fout.close();
        workbook.close();
        fis.close();
        
    
      
        
    }
    
    
 } 
    
