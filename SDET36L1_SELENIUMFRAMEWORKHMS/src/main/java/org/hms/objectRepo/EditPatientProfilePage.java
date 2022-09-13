package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.tyss.genric.WebUtility;

public class EditPatientProfilePage {

	@FindBy(xpath = "//input[@name='fname']")
	private WebElement usernameComponent;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement addressComponent;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityComponent;
	
	@FindBy(xpath = "//select[@name='gender']")
	private WebElement genderDropDownComponent;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement mainEmailUpdateBtn;
	
	@FindBy(xpath = "//div[@class='col-md-12']/h5")
	private WebElement updateMgs;
	
	
	public EditPatientProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	/**
	 * this method is to fill all component details in edit patient profile page..i.e, components like name,address,city,gender etc
	 * @param name
	 * @param address
	 * @param city
	 * @param gender
	 * @param webUtil
	 */
	
	public void editProfilePatients(String name,String address,String city,String value,WebUtility webUtil) {
		usernameComponent.clear();
		usernameComponent.sendKeys(name);
		addressComponent.clear();
		addressComponent.sendKeys(address);
		cityComponent.clear();
		cityComponent.sendKeys(city);
		
		
		webUtil.selectClass(genderDropDownComponent,value);
		mainEmailUpdateBtn.click();
		
		}
	
//	public void validateUpdateProfile() {
//		boolean textDispalyed = updateMgs.isDisplayed();
//		
//		if(textDispalyed==true) {
//			System.out.println("the patient details is updated sucessfully");
//			
//		}
//		else {
//			System.out.println("the patient details not updated");
//		}
//		
//		
//	
//	}
	
	public String validateUsingAssert() {
		String textDispalyed = updateMgs.getText();
		return textDispalyed;
	}
	
	
}
