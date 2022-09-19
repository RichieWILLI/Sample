package org.tyss.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.generic.WebDriverUtility;

public class AddToCartPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[.='Cart']")
	private WebElement cartBtn;
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	
	public void clickCartBtn(WebDriverUtility webUtility,String title) {
		
		String currentUrl = driver.getCurrentUrl();
		webUtility.explicitlyWaitForUrl(currentUrl);
		webUtility.navigateBack();
		
		webUtility.explicitlyWaitForTitle(title);
		cartBtn.click();	
	}
	

}
