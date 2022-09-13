package Pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePgBig {
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])")
	private List<WebElement> product;
	
	public HomePgBig(AndroidDriver<WebElement> driver ) {
		PageFactory.initElements(driver,this);
	}
	
	public void getTheProduct() {
		for (WebElement pro : product) {
			pro.getText();
			System.out.println(pro);
			
		}
	}

}
