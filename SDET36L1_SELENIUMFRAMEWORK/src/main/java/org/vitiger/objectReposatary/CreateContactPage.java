package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactIcon;
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickCreateContactIcon() {
		createContactIcon.click();
	}
	
}
