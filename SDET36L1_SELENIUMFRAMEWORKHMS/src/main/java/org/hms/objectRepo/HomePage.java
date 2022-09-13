package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
	@FindBy(xpath = "//h3[.='Patients']/following-sibling::div/span/a")
	private WebElement patientModule;
	
	@FindBy(xpath = "//h3[.='Doctors Login']/following-sibling::div/span/a")
	private WebElement doctorModule;
	
	@FindBy(xpath = "//h3[.='Admin Login']/following-sibling::div/span/a")
	private WebElement adminModule;
	
	@FindBy(xpath = "//div[@class='top-nav']/ul/li[2]/a")
	private WebElement contactBtn;
	
	@FindBy(xpath = "//span[.=' Dashboard ']")
	private WebElement dashboardBtn;
	
	@FindBy(xpath = "//span[.=' Book Appointment ']")
	private WebElement bookappointmentBtn;
	
	@FindBy(xpath = "//span[.=' Appointment History ']")
	private WebElement appointmentHistoryBtn;
	
	@FindBy(xpath = "//span[.=' Medical History ']")
	private WebElement medicalHistoryBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}

	
	/**
	 * this method is used to click on the patient module in home page
	 */
	public void clickPatientModule() {
		patientModule.click();
	}

	/**
	 * this method is used to click on the doctor module in home page
	 */
	
	public void clickDoctorModule() {
		doctorModule.click();
	}
	
	/**
	 * this method is used to click on the admin module in home page
	 */
	
	public void clickAdminModule() {
		adminModule.click();
	}
	
	/**
	 * this method is used to click on contact button
	 */
	
	public void clickContactBtn() {
		contactBtn.click();
		
	}
	
	/**
	 * this method is used to click on dashboard btn
	 */
	public void clickDashboardBtn() {
		dashboardBtn.click();
	}
	
	/**
	 * this method is used to click on book appointment history
	 */
	public void clickBookAppointment() {
		bookappointmentBtn.click();
	}
	/**
	 * this method is used to check the appointment history
	 */
	
	public void clickAppointmentHistoryBtn() {
		appointmentHistoryBtn.click();
	}
	
	
	/**
	 * this method is used to click on medical history
	 */
	public void clickMedicalHistory() {
		medicalHistoryBtn.click();
	}
	
	
	
}
