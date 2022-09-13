package org.hms.practise;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.hms.objectRepo.AppointmentHistoryPage;
import org.hms.objectRepo.BookAppointmentPage;
import org.hms.objectRepo.DashboardPage;
import org.hms.objectRepo.HomePage;
import org.hms.objectRepo.LoginPage;
import org.hms.objectRepo.PatientLoginPage;
import org.hms.objectRepo.PractisePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.tyss.genric.ExcelFileUtility;
import org.tyss.genric.FileUtility;
import org.tyss.genric.IConstantUtility;
import org.tyss.genric.JavaScriptUtility;
import org.tyss.genric.JavaUtility;
import org.tyss.genric.WebUtility;

public class calenderPopPractise {

	public static void main(String[] args) {

		//creating generic object
		FileUtility flUtil=new FileUtility();
		WebUtility webUtil=new WebUtility();
		JavaUtility javaUtil=new JavaUtility();
		ExcelFileUtility excelUtil=new ExcelFileUtility();
		JavaScriptUtility javascriptUtil=new JavaScriptUtility();


		flUtil.propertyfileInitilize(IConstantUtility.HMSCOMMONDATAFILELOCATION);
		String url = flUtil.getDataFromCommonData("url");
		String patUsn = flUtil.getDataFromCommonData("patientUsername");
		String patPsd= flUtil.getDataFromCommonData("patientPassword");
		String browser= flUtil.getDataFromCommonData("browser");
		String timeouts= flUtil.getDataFromCommonData("timeout");

		long longTimeOut = javaUtil.parseStringToLong(timeouts);

		WebDriver driver = webUtil.selectBrowser(browser);

		webUtil.maximizeBrowser();
		webUtil.implicitlyWaitMethod(longTimeOut);


		//creating pom object
		LoginPage lgPg=new LoginPage(driver);
		HomePage homePg=new HomePage(driver);
		PatientLoginPage patLg=new PatientLoginPage(driver);
		DashboardPage dashPg=new DashboardPage(driver);
		BookAppointmentPage bookAppPg=new BookAppointmentPage(driver);
		AppointmentHistoryPage appPg=new AppointmentHistoryPage(driver);
		PractisePage pgPrc=new PractisePage(driver);


		webUtil.getUrl(url);



		lgPg.clickOnHmsLink();
		javascriptUtil.typeCastToJavaScript(driver);
		javascriptUtil.scrolltilldown();
		homePg.clickPatientModule();
		patLg.enterUsnPsdPatient(patUsn,patPsd);
		dashPg.clickBookAppointmentLink();

		excelUtil.loadExcelFile(IConstantUtility.HMSTESTDATFILELOCATION);
		String specialist = excelUtil.getExcelData("Patient",4,1);
		String doctorName = excelUtil.getExcelData("Patient",4,2);
		String timeAppt = excelUtil.getExcelData("Patient",4,3);
		String date = excelUtil.getExcelData("Patient",4,4);



		/*for practise purpose im hard coding*/

		//enter the date using sendkeys

		//driver.findElement(By.xpath("//input[@class='form-control datepicker']")).sendKeys(date);
		//we can enter the date using sendkeys..it is working

		//now enter the date by selecting the calender pop up




		pgPrc.clickondateTextField();
		String[] monthYear=pgPrc.getMonthYear();

		//driver.findElement(By.xpath("//input[@class='form-control datepicker']")).click();
		//String[] monthYear = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")).getText().split(" ");

		String expectedDate="13-August-2022";
		String[] splitedExpected = expectedDate.split("-");
		String splitedDate = splitedExpected[0];
		String splitedMonth = splitedExpected[1];
		String splitedYear = splitedExpected[2];




		String month = monthYear[0];
		String year = monthYear[1];
		System.out.println(month);
		System.out.println(year);

		int convertedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(month).get(ChronoField.MONTH_OF_YEAR);
		int convertedExpectedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(splitedMonth).get(ChronoField.MONTH_OF_YEAR);
		int convertedYear = Integer.parseInt(year);
		int convertedExpectedYear = Integer.parseInt(splitedYear);
		
		while(!(convertedExpectedMonth==convertedMonth && convertedExpectedYear==convertedYear)) {
			
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[@class='next']")).click();
			pgPrc.clickondateTextField();
			monthYear=pgPrc.getMonthYear();
			month = monthYear[0];
			year = monthYear[1];
			convertedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(month).get(ChronoField.MONTH_OF_YEAR);
			//convertedExpectedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(splitedMonth).get(ChronoField.MONTH_OF_YEAR);
			convertedYear = Integer.parseInt(year);
			//convertedExpectedYear = Integer.parseInt(splitedYear);
		}
		
		
		driver.findElement(By.xpath("//td[@class='day' and .='"+splitedDate+"']")).click();
		

















	}

}
