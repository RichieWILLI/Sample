package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	@FindBy(xpath = "//h2[.='My Profile']/following-sibling::p/a")
	private WebElement updatePatientProfile;
	
	@FindBy(xpath = "//h2[.='My Appointments']/following-sibling::p/a")
	private WebElement appointmentHistoryLink;
	
	@FindBy(xpath = "//h2[.=' Book My Appointment']/following-sibling::p/a")
	private WebElement bookAppointmentLink;
	
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickUpdatePatientProfile() {
		updatePatientProfile.click();
	}
	
	public void clickAppointmentHistory() {
	
		appointmentHistoryLink.click();
	}
	public void clickBookAppointmentLink() {
		bookAppointmentLink.click();
	}

}
