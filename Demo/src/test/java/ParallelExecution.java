import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecution {

	@Parameters({"platformVersion","deviceName","deviceId","port"})
	@Test
	public void parallelExecution(String platformVersion,String deviceName,String deviceId,String port) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		dc.setCapability(MobileCapabilityType.UDID,deviceId);
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		
		
		URL ur=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.launchApp();

	}

}
