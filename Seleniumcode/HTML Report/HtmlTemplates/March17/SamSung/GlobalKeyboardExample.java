package SamSung;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import java.nio.*;
import java.io.*;

public class GlobalKeyboardExample {
	
	
	public static String xlsFile="C://Users//sudhakar//Desktop//HTML Report//HtmlTemplates//TC05.xls";
	public static String xlsFileSheet="Sheet2";

	private static boolean run = true;
	
	public static void main(String[] args) {
		
		
		try
		{
			 ExcelApiTest3 eat = new ExcelApiTest3();
			 eat.clearsheetdata(xlsFile,xlsFileSheet);
			 
		}catch(Exception e) {}
		
		
		// Might throw a UnsatisfiedLinkError if the native library fails to load or a RuntimeException if hooking fails 
		GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(true); // Use false here to switch to hook instead of raw input

		System.out.println("Global keyboard hook successfully started, press [escape] key to shutdown. Connected keyboards:");
		
		for (Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet()) {
			
			//System.out.format("value %d: %s\n", keyboard.getKey(), keyboard.getValue());
			
			//System.out.format("value  %s\n",  keyboard.getValue());
			
		/*	String str1= keyboard.getValue();
			
			if (str1.charAt(0) == ' ') {
			     str1 = str1.substring(1);
			}
	*/
			//System.out.format("After removing space value Is " + str1);
			
			
			
			
			//System.out.format("String value is " +keyboard.toString());
			
			//System.out.format("Hashcode " +keyboard.hashCode());
			
			
			//long value= keyboard.getKey();
			//String str=longtoAscii(value);
			//System.out.println("Char is -"+str);
			
		}
		
		keyboardHook.addKeyListener(new GlobalKeyAdapter() {
		
			@Override 
			public void keyPressed(GlobalKeyEvent event) {
				//System.out.println(event);
				if (event.getVirtualKeyCode() == GlobalKeyEvent.VK_ESCAPE) {
					run = false;
				}
			}
			
			@Override 
			public void keyReleased(GlobalKeyEvent event)  {
			
				
				//System.out.println(event); 
				
			

				char str1= event.getKeyChar();
				if (str1 == ' ')
				{
					System.out.println("");
				}
				else
				{
					System.out.print(str1);
					
					try
					{
					ExcelAppendData(str1);
					}catch(Exception e) {}
					
				}
				
				
					
					
				
			}
		});
		
		try {
			while(run) { 
				Thread.sleep(128); 
			}
		} catch(InterruptedException e) { 
			//Do nothing
		} finally {
			keyboardHook.shutdownHook(); 
		}
	}
	
	
	
	

public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
	






public synchronized static Boolean ExcelAppendData(char CellData) throws Exception
{
         
	      Boolean Insert_Status=false;
	
	
	//synchronized(this){//synchronized block  
	
				try
				   {
					
				       System.out.println("Hai");
				       FileInputStream myxls = new FileInputStream(xlsFile);
				       HSSFWorkbook studentsSheet = new HSSFWorkbook(myxls);
				       HSSFSheet worksheet = studentsSheet.getSheet(xlsFileSheet);
				       int lastRow=worksheet.getLastRowNum();
				       System.out.println("lastRow"+lastRow);
				      
				       Row row = worksheet.createRow(++lastRow);
				       
				       
				       //row.createCell(1).setCellValue("Dr.Hola");
				       
				       String str=String.valueOf(CellData);  
				       
				       row.createCell(1).setCellValue(str);
				      
				       
				      
				       myxls.close();
				       
					   FileOutputStream output_file =new FileOutputStream(new File(xlsFile));  
				       //write changes
				       studentsSheet.write(output_file);
				       output_file.close();
				       System.out.println(" is successfully written");
				       
				       Thread.sleep(500);  
				       
				       Insert_Status=true;
				       
				       return Insert_Status;
				       
				    }
				    catch(Exception e)
				    {
				    	
				    	e.printStackTrace();
				    }	
	//}
				return Insert_Status;

}




	
}