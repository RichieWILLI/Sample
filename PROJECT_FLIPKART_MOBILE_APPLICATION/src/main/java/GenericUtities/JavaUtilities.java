package GenericUtities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class JavaUtilities {
	
	URL url;
	DesiredCapabilities dc;
	AndroidDriver driver;
	
	
	public void desiredCapabilities(String capabiltyName, String capabiltyValue) {
		 dc=new DesiredCapabilities();
		dc.setCapability(capabiltyName,capabiltyValue);
	}
	
	public void urlForAndroid(String appiumServerUrl) {
		try {
			 url=new URL(appiumServerUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public AndroidDriver androidDriver() {
		driver=new AndroidDriver (url,dc);
		return driver;
	}

}
