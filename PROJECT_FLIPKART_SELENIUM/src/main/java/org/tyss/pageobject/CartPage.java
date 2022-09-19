package org.tyss.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public String textOfProduct;
	
	@FindBy(xpath="//a[@class='_2Kn22P gBNbID']")
	private WebElement cartedProduct;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String textOfCartedProduct() {
		return cartedProduct.getText();
		
	}
	public void checkForProduct(String actualData) {
		textOfProduct.contains(actualData);
		System.out.println("yes the product is present in cart ");
	}
	

}
