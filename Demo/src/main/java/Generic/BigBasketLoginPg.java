package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BigBasketLoginPg {
	
	@FindBy(id = "com.bigbasket.mobileapp:id/text_login")
	private WebElement loginBtn;
	
	@FindBy(id="com.bigbasket.mobileapp:id/text_choose_location")
	private WebElement locationBtn;
	
	@FindBy (id = "com.truecaller:id/confirm")
	private WebElement continueBtn;
	
	@FindBy(id = "com.truecaller:id/continueWithDifferentNumber")
	private WebElement skipBtn;
	
	
	public BigBasketLoginPg(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void clickSkipBtn() {
		skipBtn.click();
	}
	public void clickContinueBtn() {
		continueBtn.click();
	}
}
