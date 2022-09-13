package org.vitiger.objectReposatary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisationPage {
	
	public CreateNewOrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organisationLastName;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	public void enterOrganisationName(String orgName) {
		organisationLastName.sendKeys(orgName);
	}
	public void clickSave() {
		saveBtn.click();
	}
	

}
