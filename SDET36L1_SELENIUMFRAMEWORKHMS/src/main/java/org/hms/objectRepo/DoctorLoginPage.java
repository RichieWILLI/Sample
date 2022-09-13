package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorLoginPage {
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement doctorUsernameTextField;
	
	@FindBy(xpath = "//input[@class='form-control password']")
	private WebElement doctorPasswordTextField;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement submitButton;
	
	public DoctorLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterAllLoginDetails(String username,String password) {
		doctorUsernameTextField.sendKeys(username);
		doctorPasswordTextField.sendKeys(password);
		submitButton.click();
		
	}

}
