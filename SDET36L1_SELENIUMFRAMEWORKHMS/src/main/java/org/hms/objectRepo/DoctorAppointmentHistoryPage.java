package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorAppointmentHistoryPage {
	
	public DoctorAppointmentHistoryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[.=' Patients ']")
	private WebElement doctorPagePatientbtn;
	
	@FindBy(xpath = "//span[.=' Add Patient']")
	private WebElement clickonCreatePatientDocPg;
	
	@FindBy(xpath = "//span[.=' Manage Patient ']")
	private WebElement clickOnMedicalHistory;
	
	public void clickonPatientBtn() {
		doctorPagePatientbtn.click();
	}
	
	public void clickonCreatePatientBtn() {
		clickonCreatePatientDocPg.click();
	}
	
	public void clickmedicalHis() {
		clickOnMedicalHistory.click();
	}

}
