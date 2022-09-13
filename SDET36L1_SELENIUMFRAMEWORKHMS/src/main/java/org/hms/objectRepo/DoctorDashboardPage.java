package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardPage {
	
	@FindBy(xpath = "//p[@class='cl-effect-1']/a")
	private WebElement doctorAppointmentHistory;
	
	@FindBy(xpath = "//p[@class='links cl-effect-1']/a")
	private WebElement doctorUpdateProfile;
	
	public DoctorDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickonDoctorAppointmentHistory() {
		doctorAppointmentHistory.click();
	}
	public void clickonDoctorUpdateProfile() {
		doctorUpdateProfile.click();
		
	}

}
