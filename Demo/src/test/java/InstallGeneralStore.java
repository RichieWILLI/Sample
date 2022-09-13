import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallGeneralStore {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Richard William\\Desktop\\datafile\\Appium Notes\\General-Store.apk");
		
		
		URL ur =new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(ur, dc);

	}

}
