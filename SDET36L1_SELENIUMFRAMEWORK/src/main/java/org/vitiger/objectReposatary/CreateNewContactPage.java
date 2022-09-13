package org.vitiger.objectReposatary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']/input[@name='account_name']/following-sibling::img")
	private WebElement organisationIconInContactPg;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterLastName(String lastname) {
		lastNameTextField.sendKeys(lastname);
	}

	public void clickonorganisationIcon() {
		organisationIconInContactPg.click();
	}
	
	public void clickonSaveBtn() {
		saveBtn.click();
	}
}
