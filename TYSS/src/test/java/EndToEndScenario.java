import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtities.BaseClassOfEndToEnd;
import GenericUtities.DriverMethods;
import GenericUtities.FileUtilities;
import GenericUtities.Iconstant;
import GenericUtities.JavaUtilities;
import ObjectReposatory.HomePage;
import ObjectReposatory.HomePage2;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EndToEndScenario extends BaseClassOfEndToEnd {
	
	@Test
	public void endToEndScenario() throws InterruptedException {
		
		System.out.println("executed");
		
		HomePage hp=new HomePage(driver);
		HomePage2 hp2=new HomePage2(driver);
		
		
		hp.clickOnBangalorestore();
		Thread.sleep(500);
		
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		System.out.println(height);
		int width = size.getWidth();
		
		Thread.sleep(500);
		driver.swipe(width/2, (int)(height*0.80), width/2, (int)(height*0.25),1000);
		
		driver.swipe(width/2, (int)(height*0.80), width/2, (int)(height*0.25),1000);
		
		driver.swipe(width/2, (int)(height*0.80), width/2, (int)(height*0.25),1000);
		

		

	}
	
	
}
