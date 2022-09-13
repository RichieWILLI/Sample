package org.vitiger.objectReposatary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.generic.WebDriverUtility;

public class OrganisationInformationPage {
	
	public OrganisationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']")
	private WebElement textOfOrganisationName;
	
	private String xpathOfElement="//span[@id='dtlview_Organization Name']";
	
	
	public void explicitWaitUsingVisibilityOfElementLoactor(WebDriverUtility webUtility,long longTimeout) {
	
		webUtility.explicitlyWaitVisibilityOfElementLocator(longTimeout, xpathOfElement);
		
		
	}
}
