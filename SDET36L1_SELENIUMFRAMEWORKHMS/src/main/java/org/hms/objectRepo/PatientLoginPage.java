package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement patientUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement patientPassword;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='form-group form-actions']/a")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//div[@class='new-account']/a")
	private WebElement createAccountLink;
	
	public PatientLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsnPsdPatient(String username, String password) {
		patientUsername.sendKeys(username);
		patientPassword.sendKeys(password);
		loginBtn.click();
	}
	
	public void forgotPasswordClick() {
		forgotPassword.click();
	}
	
	public void clickCreateAccount() {
		createAccountLink.click();
		
	}
	
	
}
