package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildWindowInOrganisationModule {
	private WebDriver driver;

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchTextBox;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchButton;
	
	private String xpath = "//a[.='%s']";
	
	public ChildWindowInOrganisationModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void dynamicXpath(String acutalData) {
		String modifiedXpath = String.format(xpath,acutalData);
		driver.findElement(By.xpath(modifiedXpath)).click();
		}
	
	
	public void typeInSearchBox(String actualData) {
		searchTextBox.sendKeys(actualData);
		
	}
	
	public void clickOnSearchBtn() 
	{
		searchButton.click();
		
	}
}
