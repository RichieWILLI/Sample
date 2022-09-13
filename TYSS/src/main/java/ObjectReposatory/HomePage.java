package ObjectReposatory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	
	@FindBy(xpath = "//android.widget.TextView[@text='Explore Bangalore Store']")
	private WebElement exploreBangloreStore;
	
	public HomePage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnBangalorestore() {
		exploreBangloreStore.click();
		
	}

}
