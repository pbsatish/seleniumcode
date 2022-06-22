package Day_40_Key_Word_Driven;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;


public class DriverScript
{
	
	


 //This is a class object, declared as 'public static'
 //So that it can be used outside the scope of main[] method
 public static Actions actionKeywords;
  
 public static String sActions;
 
 //This is reflection class object, declared as 'public static' 
 //So that it can be used outside the scope of main[] method
 public static Method method[];
 

 public  void  mainTest(String 	xlsxFilepath,String SheetName) throws Exception 
 {
	 
	 
		ExcelApiTest4 eat=new ExcelApiTest4();
	    int	RowCount=eat.getRowCount(xlsxFilepath,SheetName);
	    RowCount=RowCount-1;
	 
 //Declaring the path of the Excel file with the name of the Excel file
// String sPath = "C:UsersVardhanworkspaceSelenium Frameworks DemodataEngine.xlsx";
 
 //Here we are passing the Excel path and SheetName to connect with the Excel file     
 //This method was created previously
 
 

 //Hard coded values are used for Excel row & columns for now     
 //Later on, we will use these hard coded value much more efficiently    
 //This is the loop for reading the values of the column (Action Keyword) row by row 
 //It means this loop will execute all the steps mentioned for the test case in Test Steps sheet
 for (int iRow=1;iRow<=RowCount;iRow++)
 {
 sActions = DriverScript.getCellData(xlsxFilepath,SheetName,iRow, 1);
 
 System.out.println("Key Word is : "+sActions);

 execute_Actions(); 
 }
 }
 
//This method contains the code to perform some action 
//As it is completely different set of logic, which revolves around the action only, it makes sense to keep it separate from the main driver script 
//This is to execute test step (Action)
private static void execute_Actions() throws Exception 
 {
 //Here we are instantiating a new object of class 'Actions'
 actionKeywords = new Actions();
 
 //This will load all the methods of the class 'Actions' in it. 
 //It will be like array of method, use the break point here and do the watch 
 method = actionKeywords.getClass().getMethods();
 
 //This is a loop which will run for the number of actions in the Action Keyword class 
 //method variable contain all the method and method.length returns the total number of methods
 for(int i = 0;i<method.length;i++)
 {
  //This is now comparing the method name with the ActionKeyword value received from the excel
  if(method[i].getName().equals(sActions))
 { //In case of match found, it will execute the matched method 
  method[i].invoke(actionKeywords);
   //Once any method is executed, this break statement will take the flow outside of for loop
  break;
 }
 }
 }
public static String getCellData(String xlsxFilepath,String SheetName,int RowNum, int ColNum) throws Exception
{
	String Keyword;

	
	ExcelApiTest4 eat = new ExcelApiTest4();
	//Keyword=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality10.xlsx","Sheet1",RowNum,ColNum);
	Keyword=eat.getCellData(xlsxFilepath,SheetName,RowNum,ColNum);
	return Keyword;
	
	
}

}