import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomAndPinch {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability("automationName","appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"AOSP on IA Emulator");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
		//these below capabilties is copied directly from board the scale app is not visible in App Launcher
		dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity",".MainActivity");

		URL ur=new URL("https://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement img=driver.findElement(By.id("img");
		//driver.zoom(img);
//		Thread.sleep(100);
//		driver.pinch(img);
		
		
	}

}
