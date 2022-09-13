import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServerCustom {
	@Test
	public void startServerCustom() throws MalformedURLException {
		AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("../Demo/Logs.txt")));
		
		server.start();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		//common for android or ios
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
