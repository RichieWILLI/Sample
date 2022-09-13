package org.hms.patient;

import org.hms.objectRepo.AppointmentHistoryPage;
import org.hms.objectRepo.BookAppointmentPage;
import org.hms.objectRepo.DashboardPage;
import org.hms.objectRepo.HomePage;
import org.hms.objectRepo.LoginPage;
import org.hms.objectRepo.PatientLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tyss.genric.BaseClass;
import org.tyss.genric.ExcelFileUtility;
import org.tyss.genric.FileUtility;
import org.tyss.genric.IConstantUtility;
import org.tyss.genric.JavaScriptUtility;
import org.tyss.genric.JavaUtility;
import org.tyss.genric.WebUtility;

public class CheckingTheCancelledAppointmentTest extends BaseClass {

	@Test
	public void checkingTheCancelledAppointmentTest()
	
	{
		//creating generic object
//		FileUtility flUtil=new FileUtility();
//		WebUtility webUtil=new WebUtility();
//		JavaUtility javaUtil=new JavaUtility();
//		ExcelFileUtility excelUtil=new ExcelFileUtility();
//		JavaScriptUtility javascriptUtil=new JavaScriptUtility();
		
		
//		flUtil.propertyfileInitilize(IConstantUtility.HMSCOMMONDATAFILELOCATION);
		String url = flUtil.getDataFromCommonData("url");
		String patUsn = flUtil.getDataFromCommonData("patientUsername");
		String patPsd= flUtil.getDataFromCommonData("patientPassword");
//		String browser= flUtil.getDataFromCommonData("browser");
//		String timeouts= flUtil.getDataFromCommonData("timeout");
		
//			long longTimeOut = javaUtil.parseStringToLong(timeouts);
//		
//		WebDriver driver = webUtil.selectBrowser(browser);
//		
//		webUtil.maximizeBrowser();
//		webUtil.implicitlyWaitMethod(longTimeOut);
		
		
		
		//creating pom object
//		LoginPage lgPg=new LoginPage(driver);
//		HomePage homePg=new HomePage(driver);
		PatientLoginPage patLg=new PatientLoginPage(driver);
		DashboardPage dashPg=new DashboardPage(driver);
		BookAppointmentPage bookAppPg=new BookAppointmentPage(driver);
		AppointmentHistoryPage appPg=new AppointmentHistoryPage(driver);
		
		
		
		webUtil.getUrl(url);
		
		webUtil.implicitlyWaitMethod(longTimeOut);
		lgPg.clickOnHmsLink();
		homePg.clickPatientModule();
		javascriptUtil.typeCastToJavaScript(driver);
		javascriptUtil.scrolltilldown();
		
		patLg.enterUsnPsdPatient(patUsn,patPsd);
		dashPg.clickBookAppointmentLink();
		
//		excelUtil.loadExcelFile(IConstantUtility.HMSTESTDATFILELOCATION);
		String specialist = excelUtil.getExcelData("Patient",6,1);
		String doctorName = excelUtil.getExcelData("Patient",6,2);
		String timeAppt = excelUtil.getExcelData("Patient",6,3);
		
		bookAppPg.fillDetailsToBookAppointment(webUtil, specialist, doctorName, timeAppt);
		webUtil.alertPopAccept();
		bookAppPg.clickappointmentHistoryBTnInBookAppointPg();
		
		String dateTime="2022-07-06 14:22:48";
		
		//appPg.clickOnCancelLink();
		appPg.clickcancelAppoint(dateTime);
	
		webUtil.alertPopAccept();
		appPg.cancelledCheck();
		
//		excelUtil.closeWorkBook();
		
		
		
		
		
		
	}

}
