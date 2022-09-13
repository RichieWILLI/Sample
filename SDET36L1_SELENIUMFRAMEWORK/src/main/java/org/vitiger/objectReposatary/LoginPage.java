package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath ="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void pageLogin(String usn,String psd) {
		usernameTextField.sendKeys(usn);
		passwordTextField.sendKeys(psd);
		loginBtn.click();
	}
	

}
