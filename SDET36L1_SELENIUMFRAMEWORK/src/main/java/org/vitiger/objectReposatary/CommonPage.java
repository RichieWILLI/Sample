package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.generic.WebDriverUtility;

public class CommonPage {
	
	@FindBy(xpath = "//a[.='More']")
	private WebElement moreDropDown;
	
	@FindBy(xpath = "//a[@name='Campaigns']")
	private WebElement campaingBtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstatorIcon;
	
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signOutLink;
	
	@FindBy(xpath = "//a[.='Products']")
	private WebElement productBtn;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement contactsBtn;
	
	@FindBy(xpath = "//a[.='Documents']")
	private WebElement documentBtn;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[.='Organizations']")
	private WebElement organisationBtn;
	
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void mouseHoverAndCampaing(WebDriverUtility webUtility) {
		
		webUtility.mousehoverAction(moreDropDown);
		campaingBtn.click();
	}
	
	public void mouseHoverToSignOut(WebDriverUtility webUtility) {
		webUtility.mousehoverAction(adminstatorIcon);
		signOutLink.click();
		
	}
	
	public void productBtnClick() {
		productBtn.click();
	}
	
	public void contactmodule() {
		contactsBtn.click();
		
	}
	public void organisationClick() {
		organisationBtn.click();
		
	}
	
	public void documentClick() {
		documentBtn.click();
	}
	
	
	
	

}
