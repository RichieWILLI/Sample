import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Perform {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"AOSP on IA Emulator");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage","com.android.calculator2");
		dc.setCapability("appActivity",".Calculator");
		
	URL ur=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.launchApp();
		
		driver.findElement(By.id("")).click();
		

	}

}
