package ObjectReposatory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage2 {
	AndroidDriver driver;

	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]")
	private WebElement freshFruitModule;
	
	public HomePage2(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFreshFruit() {
		
		freshFruitModule.click();
	}
	
	
	
		
}
