package org.vitiger.objectReposatary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {
	
	
	public CampaignInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//span[@id='dtlview_Campaign Name']")
	private WebElement getTextCampaingName;
	
	@FindBy(xpath = "//span[@id='dtlview_Product']")
	private WebElement textProduct;
	
	
	public String getCampaingTextName() {
		String text = getTextCampaingName.getText();
		return text;
	}
	
	public String getProductText() {
		String textPro = textProduct.getText();
		return textPro;
	}

}
