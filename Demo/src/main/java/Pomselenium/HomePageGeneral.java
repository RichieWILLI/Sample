package Pomselenium;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageGeneral {
	
	@FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private MobileElement dropdown;
	
	@FindBy(id = "com.androidsample.generalstore:id/nameField")
	private MobileElement nameTextField;
	
	@FindBy(id = "com.androidsample.generalstore:id/radioMale")
	private MobileElement radioBtnMale;
	
	@FindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private MobileElement radioBtnFemale;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letShopBtn;
	
	public HomePageGeneral(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void fillAllDetails() {
		nameTextField.sendKeys("richard");
		radioBtnMale.click();
		letShopBtn.click();
	}


}
