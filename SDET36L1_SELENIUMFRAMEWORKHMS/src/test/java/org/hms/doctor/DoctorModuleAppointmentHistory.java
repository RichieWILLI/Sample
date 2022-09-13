package org.hms.doctor;

import org.hms.objectRepo.AddPatientPageInDoctorModule;
import org.hms.objectRepo.DoctorAppointmentHistoryPage;
import org.hms.objectRepo.DoctorDashboardPage;
import org.hms.objectRepo.DoctorLoginPage;
import org.hms.objectRepo.DoctorPatientManagePage;
import org.hms.objectRepo.HomePage;
import org.hms.objectRepo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.tyss.genric.ExcelFileUtility;
import org.tyss.genric.FileUtility;
import org.tyss.genric.IConstantUtility;
import org.tyss.genric.JavaUtility;
import org.tyss.genric.WebUtility;

public class DoctorModuleAppointmentHistory {

	public static void main(String[] args) {

		//creating generic object
		FileUtility flUtil=new FileUtility();
		WebUtility webUtil=new WebUtility();
		JavaUtility javaUtil=new JavaUtility();
		ExcelFileUtility excelUtil=new ExcelFileUtility();

		flUtil.propertyfileInitilize(IConstantUtility.HMSCOMMONDATAFILELOCATION);
		excelUtil.loadExcelFile(IConstantUtility.HMSTESTDATFILELOCATION);

		
		String url = flUtil.getDataFromCommonData("url");
		String docUsn = flUtil.getDataFromCommonData("doctorUsername");
		String docPsd= flUtil.getDataFromCommonData("doctorPassword");
		String browser= flUtil.getDataFromCommonData("browser");
		String timeouts= flUtil.getDataFromCommonData("timeout");
		
		
		
		long longTimeOut = javaUtil.parseStringToLong(timeouts);
		WebDriver driver = webUtil.selectBrowser(browser);
		
		int ran = javaUtil.randomNumber();

		webUtil.maximizeBrowser();
		webUtil.implicitlyWaitMethod(longTimeOut);
		
		

		//pom object creation
		LoginPage lgPg=new LoginPage(driver);
		HomePage homePg=new HomePage(driver);
		DoctorLoginPage docLgPg =new DoctorLoginPage(driver);
		DoctorDashboardPage docDasPg=new DoctorDashboardPage(driver);
		DoctorAppointmentHistoryPage docAppHisPg=new DoctorAppointmentHistoryPage(driver);
		AddPatientPageInDoctorModule addPatPg=new AddPatientPageInDoctorModule(driver);
		DoctorPatientManagePage docManPg=new DoctorPatientManagePage(driver);
	

		webUtil.getUrl(url);

		lgPg.clickOnHmsLink();
		
		homePg.clickDoctorModule();
		docLgPg.enterAllLoginDetails(docUsn, docPsd);
		docDasPg.clickonDoctorAppointmentHistory();
		docAppHisPg.clickonPatientBtn();
		docAppHisPg.clickonCreatePatientBtn();
		
		
		
		String sheetName = "Patient";
		String patientName = excelUtil.getExcelData(sheetName, 8, 1)+ran;
		String patientContactNo = excelUtil.getExcelData(sheetName, 8, 2);
		String email = excelUtil.getExcelData(sheetName, 8, 3)+ran+"@gmail.com";
		
		String value = excelUtil.getExcelData(sheetName, 8, 4);
		String address = excelUtil.getExcelData(sheetName, 8, 5);
		String age = excelUtil.getExcelData(sheetName, 8, 6);
		String mediHis = excelUtil.getExcelData(sheetName, 8, 7);
		
		
		
		addPatPg.enterallDetailsInAddPatient(patientName, patientContactNo, email, address, age, mediHis, value);
		
		docAppHisPg.clickonPatientBtn();
		docAppHisPg.clickmedicalHis();
		docManPg.validateAddedPatient(value);
		
		
		
	}

}
