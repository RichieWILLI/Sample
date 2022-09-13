package org.hms.patient;

import org.hms.objectRepo.DashboardPage;
import org.hms.objectRepo.EditPatientProfilePage;
import org.hms.objectRepo.HomePage;
import org.hms.objectRepo.LoginPage;
import org.hms.objectRepo.PatientLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tyss.genric.BaseClass;
import org.tyss.genric.ExcelFileUtility;
import org.tyss.genric.FileUtility;
import org.tyss.genric.IConstantUtility;
import org.tyss.genric.JavaUtility;
import org.tyss.genric.WebUtility;

public class CreatePatientTest extends BaseClass {

	
	@Test
	public void createPatientTest() {

		
		
		String url = flUtil.getDataFromCommonData("url");
		String patUsn = flUtil.getDataFromCommonData("patientUsername");
		String patPsd= flUtil.getDataFromCommonData("patientPassword");
		
		
			
		
		//creating pom object
		
		PatientLoginPage patLg=new PatientLoginPage(driver);
		DashboardPage dashPg=new DashboardPage(driver);
		EditPatientProfilePage editPatPg=new EditPatientProfilePage(driver);
		
		
		
		webUtil.getUrl(url);
		
		lgPg.clickOnHmsLink();
		homePg.clickPatientModule();
		patLg.enterUsnPsdPatient(patUsn,patPsd);
		dashPg.clickUpdatePatientProfile();
		
		
		String name = excelUtil.getExcelData("Patient",2,1);
		String address = excelUtil.getExcelData("Patient",2,2);
		String city = excelUtil.getExcelData("Patient",2,3);
		String gender = excelUtil.getExcelData("Patient",2,4);
		
		
		editPatPg.editProfilePatients(name, address, city,gender,webUtil);
		
		
		String expectTextDisplay = "Your Profile updated Successy";
		String textDisplayed = editPatPg.validateUsingAssert();
		System.out.println(textDisplayed);
		
		//Assert.assertEquals(textDisplayed, expectTextDisplay);
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(textDisplayed, expectTextDisplay);
		soft.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		


		
	}

}
