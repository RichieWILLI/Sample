package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRegistrtaion {
	
	public PatientRegistrtaion(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//input[@name='full_name']")
	private WebElement fullName;
	
	@FindBy(xpath = "//input[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='address']")
	private WebElement city;
	
	@FindBy(xpath = "//label[@for='rg-female']")
	private WebElement genderRadioBtnFemale;
	
	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement genderRadioBtnMale;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@id='password_again']")
	private WebElement passwordAgain;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement submitBtn;
	
	
	public void registor(String name,String addrs,String cty,String mailId,String psd) {
		fullName.sendKeys(name);
		address.sendKeys(addrs);
		city.sendKeys(cty);
		genderRadioBtnMale.click();
		emailTextBox.sendKeys(mailId);
		passwordTextBox.sendKeys(psd);
		passwordAgain.sendKeys(psd);
		submitBtn.click();
		
		
		
		
		
	}
	
	
	
}

