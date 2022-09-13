package Pom;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	@AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private MobileElement dropdown;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private MobileElement nameTextField;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
	private MobileElement radioBtnMale;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private MobileElement radioBtnFemale;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letShopBtn;

	public MobileElement getDropdown() {
		return dropdown;
	}

	public MobileElement getNameTextField() {
		return nameTextField;
	}

	public MobileElement getRadioBtnMale() {
		return radioBtnMale;
	}

	public MobileElement getRadioBtnFemale() {
		return radioBtnFemale;
	}

	public MobileElement getLetShopBtn() {
		return letShopBtn;
	}
	
	public HomePage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void fillAllDetails() {
		nameTextField.sendKeys("richard");
		radioBtnMale.click();
		letShopBtn.click();
	}
	
	public void fillAllDetails(String name) {
		nameTextField.sendKeys(name);
		radioBtnMale.click();
		letShopBtn.click();
	}
	
	
}
