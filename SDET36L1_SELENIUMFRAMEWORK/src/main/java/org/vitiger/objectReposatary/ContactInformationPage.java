package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	@FindBy(xpath = "//span[@id='dtlview_Last Name']")
	private WebElement lastNameContact;
	
	private String orgLastNameXpath="//td[@id='mouseArea_Organization Name' ]/a[.='%s']";
	
	public ContactInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gettextOfLastNameOfContact() {
		return lastNameContact.getText();
		
	}
	public String getTextOfOrgName(String actualData,WebDriver driver) {
		String dynamicPath = String.format(orgLastNameXpath, actualData);
		return driver.findElement(By.xpath(dynamicPath)).getText();
	}

}
