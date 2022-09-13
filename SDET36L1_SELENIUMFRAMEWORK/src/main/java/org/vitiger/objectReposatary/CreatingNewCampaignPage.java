package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignPage {
	
	@FindBy(xpath = "//input[@name='campaignname']")
	private WebElement campaignNameTextField;
	
	@FindBy(xpath = "//input[@accesskey='S']")
	private WebElement camapingSaveBtn;
	
	@FindBy(xpath = "//td [@class='dvtCellInfo']/img[@align='absmiddle']")
	private WebElement selectProduct;
	
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement searchForProduct;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement serachBtn;
	
	@FindBy(xpath = "//a[@href='javascript:window.close();']")
	private WebElement clickSearchedProduct;
	
	public CreatingNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void nameCampaingClickSave(String data) {
		campaignNameTextField.sendKeys(data);
		camapingSaveBtn.click();
	}
	
	public void nameCampaingProductClick(String data) {
		campaignNameTextField.sendKeys(data);
		
	}
	
	public void productSelectIcon() {
		selectProduct.click();
		}
	
	public void searchProduct(String actualProductName) {
		searchForProduct.sendKeys(actualProductName);
	}
	
	public void clickSearchBtn() {
		serachBtn.click();
	}
	
	public void serachedProduct() {
		clickSearchedProduct.click();
	}
	
	public void clickSaveCampaing() {
		camapingSaveBtn.click();
	}
	
	
	
	
}
