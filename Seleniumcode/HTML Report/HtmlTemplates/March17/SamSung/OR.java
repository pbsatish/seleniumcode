package SamSung;


import org.openqa.selenium.WebDriver;

public class OR {
	
public static String sTargetTestCaseExcelPath="";	
public static String sTargetFolderPath="";	
public static String sTestCaseName="";	

//public static WebDriver driver ; 

//Pages
//1.MercuryFlightFinderPage  = MFFPage
//2.MercuryLoginPage  = MLPage
//3.SelectFlightPage = SFPage


// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018
public static String MLPage_UserNameTextbox="//input[@type='text'and @name='userName']";
public static String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
public static String MLPage_SignInButton="//*[@name='login']";
//end MercuryLoginPage 


//Starts MercuryFlightFinderPage by Sudhakar Date:12-Jan-2018
public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";



public static String MFFPage_PassengersCountListbox="//select[@name='passCount']";
public static String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
public static String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
public static String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
public static String MFFPage_ArrivingIn="//select[@name='toPort']";
public static String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
public static String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
public static String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
public static String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
public static String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
public static String MFFPage_AirLineListbox ="//select[@name='airline']";
public static String MFFPage_ContinueButton ="//*[@name='findFlights']";
public static String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
//End MercuryFlightFinderPage


//starts Mercury Select Flight Page by Sudhakar Date:12-Jan-2018
public static String SFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_selectflight.gif' and @width='492' and @height='30']";
public static String SFPage_Continue_Click ="//input[@name='reserveFlights']";
//End Mercury Select Flight Page 

public static String BookFlightPage_FirstName ="//*[@name='passFirst0']";


public static String BookFlightPage_lastName ="//input[@name='passLast0']";
public static String BookFlightPage_meal1 ="//select[@name='pass.0.meal']";
public static String BookFlightPage_CardName ="//select[@name='creditCard']";
public static String BookFlightPage_CardNumber ="//input[@name='creditnumber']";
public static String BookFlightPage_expirymonth="//select [@name='cc_exp_dt_mn']";
public static String BookFlightPage_expiryyear="//select [@name='cc_exp_dt_yr']";
public static String BookFlightPage_SecurePurchase_Click="//input [@name='buyFlights']";



public static String Output_FlightConfirmation_Number = "(.//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::font[6]";
public static String Output_FlightBookingDate_Time="(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/preceding::b[1]";
public static String Output_DepartingDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Departing'])[1]/following::td[1]";
public static String Output_ReturningDetails= "(.//*[normalize-space(text()) and normalize-space(.)='Returning'])[1]/following::td[1]";
public static String Output_PassengersDetails="(.//*[normalize-space(text()) and normalize-space(.)='Passengers'])[1]/following::td[1]";
public static String Output_BilledToDetails="(.//*[normalize-space(text()) and normalize-space(.)='Billed To'])[1]/following::p[1]";
public static String Output_DeliveryAddressDetails="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::p[1]";
public static String Output_TotalTaxes="(.//*[normalize-space(text()) and normalize-space(.)='Delivery Address (N/A for Ticketless Travel)'])[1]/following::font[9]";
//public static String Output_TotalPrice="(.//*[normalize-space(text()) and normalize-space(.)='$89 USD'])[1]/following::font[7]";
public static String Logout="//img[@src='/images/forms/Logout.gif']";
























//public static String sTargetTestCaseExcelPath="";	
///public static String sTargetFolderPath="";	
//public static String sTestCaseName="";	

public static String username_sendkey="//input[@id='txtUsername']";
public static String password_sendkey="//input[@id='txtPassword']";
public static String login_click="//input[@id='btnLogin']";

//EMP EXPORT


public static String pim_focus="//a[@id='menu_pim_viewPimModule']";
public static String EMPlist_click="//a[@id='menu_pim_viewEmployeeList']";
public static String EMPcolumn="//*[@id='resultTable']/thead/tr/th";
public static String EMProws="//*[@id='resultTable']/tbody/tr/td[2]";

//ADMIN EXPORT

public static String ADMIN_focus="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_USERMANAGEMENT_focus="//a[@id='menu_admin_UserManagement']";


public static String ADMIN_USERS_click="//a[@id='menu_admin_viewSystemUsers']";

public static String ADMIN_COLUMNS_click="//*[@id='resultTable']/thead/tr/th";

public static String ADMIN_ROWS_click="//*[@id='resultTable']/tbody/tr/td[2]";

//admin qualifications export
public static String ADMIN_FOCUS="//a[@id='menu_admin_viewAdminModule']";


public static String ADMIN_QUALIFICATIONS_FOCUS="//a[@id='menu_admin_Qualifications']";


public static String ADMIN_SKILLS_CLICK="//a[@id='menu_admin_viewSkills']";

public static String ADMIN_NUMOFCOLUMNS="//*[@id='recordsListTable']/thead/tr/th";

public static String ADMIN_NUMOFROWS="//*[@id='recordsListTable']/tbody/tr/td[2]";
//BooLEAN USERROLE
public static String Admin_focus="//a[@ id='menu_admin_viewAdminModule' ]";

public static String UserManagement_focus="//a[@id='menu_admin_UserManagement']";
public static String UserRole_Listbox="//select[@id='searchSystemUser_userType']";
public static String NoColumns="//*[@id='resultTable']/thead/tr/th";
public static String NoRows="//*[@id='resultTable']/tbody/tr/td[2]/a";
public static String search_click="//input[@id='searchBtn']";
//Pim Jobtitle Search
public static String Pim_focus="//a[@id='menu_pim_viewPimModule']";


public static String Employee_focus="//a[@id='menu_pim_viewEmployeeList']";

public static String Jobtitle_listbox="//select[@id='empsearch_job_title']";
public static String Jobtitle_search_click="//input[@id='searchBtn']";

public static String PimColumns="//*[@id='resultTable']/thead/tr/th";
public static String PimRows="//*[@id='resultTable']/tbody/tr/td[2]";

//pimempidsearch
public static String Pim_focus1="//*[@id='menu_pim_viewPimModule']";
public static String emp_listclick="//*[@id='menu_pim_viewEmployeeList']";
public static String empid_sendkey="//*[@id='empsearch_id']";

public static String emp_searchclick="//*[@id='searchBtn']";

public static String empcoloumns="//*[@id='resultTable']/thead/tr/th";
public static String emprows="//*[@id='resultTable']/tbody/tr/td[2]";
public static String emp_name="//*[@id='empsearch_employee_name_empName']";


//boolean various search
public static String BSpimfocus="//a[@id='menu_pim_viewPimModule']";

public static String BSEMPCLICK="//a[@id='menu_pim_viewEmployeeList']";

public static String BSEMPNAMESENDKEY="//input[@id='empsearch_employee_name_empName' ] ";

public static String BSIDSENDKEY="//input [@id='empsearch_id']";

public static String BSJOBTITLELISTBOX="//select[@id='empsearch_job_title' ]";

public static String BSSEARCHCLICK="//input[@id='searchBtn' ]";

public static String BSCOLOUMNS="//*[@id='resultTable']/thead/tr/th";

public static String BSROWS="//*[@id='resultTable']/tbody/tr/td[1]";

//addemp
public static String Emp_Pim_focus1="//*[@id='menu_pim_viewPimModule']";
public static String Emp_list_focus="//*[@id='menu_pim_viewEmployeeList']";

public static String Emp_firstname_sendkey="//*[@id='firstName']";

public static String Emp_middlename_sendkey="//*[@id='middleName']";

public static String Emp_lastname_sendkey="//*[@id='lastName']";

public static String Emp_id_sendkey="//*[@id='employeeId']";

public static String Emp_save_click="//*[@id='btnSave']";

public static String Emp_pimadd_click="//input[@id='btnAdd']";



}


