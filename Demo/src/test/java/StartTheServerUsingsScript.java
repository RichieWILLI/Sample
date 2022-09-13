import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartTheServerUsingsScript {
	@Test
	public void startServer() throws MalformedURLException {
		AppiumDriverLocalService server = AppiumDriverLocalService.buildDefaultService();
		server.start();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","RR");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","9 PKQ1.190616.001");
		dc.setCapability("UDID","9a07233");
		
		
		//important use the below code for every code so data will not be lost
		dc.setCapability("noReset", true);
		
		//dc for android
		dc.setCapability("appPackage","com.android.camera");
		dc.setCapability("appActivity", ".Camera");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		
		
		
	
		
	}

}
