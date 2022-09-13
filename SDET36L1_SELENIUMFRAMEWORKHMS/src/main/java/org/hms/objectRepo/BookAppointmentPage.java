package org.hms.objectRepo;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genric.WebUtility;

public class BookAppointmentPage {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement selectSpecialization;
	
	@FindBy(xpath = "//select[@id='doctor']")
	private WebElement doctor;
	
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	private WebElement date;
	
	@FindBy(xpath = "//td[.='19']")
	private WebElement clickDate;
	
	@FindBy(xpath = "//input[@id='timepicker1']")
	private WebElement time;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//span[.=' Appointment History ']")
	private WebElement appointmentHistoryBTnInBookAppointPg;
	
	public BookAppointmentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void fillDetailsToBookAppointment(WebUtility webUtil,String speclist,String doctorname,String appointtime) {
		
		webUtil.implicitlyWaitMethod(10);
		webUtil.selectClass(selectSpecialization,speclist);
		webUtil.implicitlyWaitMethod(10);
		webUtil.selectByVisibleTextMethod(doctor,doctorname);
		webUtil.implicitlyWaitMethod(10);
		date.click();
		clickDate.click();
	
		
		
		
	
		webUtil.implicitlyWaitMethod(10);
		time.sendKeys(appointtime);
		webUtil.implicitlyWaitMethod(10);
		submitBtn.click();
			
	}
	
	public void clickappointmentHistoryBTnInBookAppointPg() {
		appointmentHistoryBTnInBookAppointPg.click();
	}
	


}
