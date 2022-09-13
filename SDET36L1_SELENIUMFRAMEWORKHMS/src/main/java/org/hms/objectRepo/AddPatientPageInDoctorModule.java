package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatientPageInDoctorModule {
	
	@FindBy(xpath = "//input[@name='patname']")
	private WebElement patientNameTextBox;
	
	@FindBy(xpath = "//input[@name='patcontact']")
	private WebElement patientContactNo;
	
	@FindBy(xpath = "//input[@name='patemail']")
	private WebElement patientEmailTextField;
	
	@FindBy(xpath = "//label[@for='rg-female']")
	private WebElement genderFemaleRadioButton;
	
	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement genderMaleRadioBtn;
	
	
	@FindBy(xpath = "//textarea[@name='pataddress']")
	private WebElement patientAddressTextField;
	
	@FindBy(xpath = "//input[@name='patage']")
	private WebElement patientAgeTextField;
	
	@FindBy(xpath = "//textarea[@name='medhis']")
	private WebElement patientMedicalHistory;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement addBtn;
	
	
	
	public AddPatientPageInDoctorModule(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	
	public void enterallDetailsInAddPatient(String patientName,String contactNum,String emailId,String addres,String age,String medicHis,String value) {
	
		patientNameTextBox.sendKeys(patientName);
		patientContactNo.sendKeys(contactNum);
		patientEmailTextField.sendKeys(emailId);
		
		if(value.equals("male")) {
			genderMaleRadioBtn.click();
		}
		if(value.equals("female")) {
			genderFemaleRadioButton.click();
			
		}
		
		patientAddressTextField.sendKeys(addres);
		
		patientAgeTextField.sendKeys(age);
		
		patientMedicalHistory.sendKeys(medicHis);
		addBtn.click();
		
		
	}
	
}
