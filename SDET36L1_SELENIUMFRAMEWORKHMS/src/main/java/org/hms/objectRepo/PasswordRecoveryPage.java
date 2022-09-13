package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
	
	public PasswordRecoveryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement registeredFullName;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement registeredEmailId;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//div[@class='new-account']/a")
	private WebElement loginLink;
	
	/**
	 * This method is used to reset the password forgoten for patient module
	 * @param registeredfullName
	 * @param emailId
	 */
	public void recoveryPassword(String registeredfullName, String emailId) {
		registeredFullName.sendKeys(registeredfullName);
		registeredEmailId.sendKeys(emailId);
		resetBtn.click();
		loginLink.click();
		
	}
	
	

}
