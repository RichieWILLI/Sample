package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Generic.BigBasketLoginPg;
import Generic.CommonDataUtility;
import Generic.IConstantUtility;
import Generic.MobileDriverUtilities;
import Pom.HomePgBig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EndToEndScenarioBig {
	
	@Test
	public void endToEndScenarioBig() throws MalformedURLException, InterruptedException {
		
		
		
		
		
		
		
		MobileDriverUtilities mbUtil=new MobileDriverUtilities();
		CommonDataUtility comdat=new CommonDataUtility();
		
		
		comdat.filefetch(IConstantUtility.CAPABILITYREALDEVICECOMMONDATAPATH);
		
		
		String platformName = comdat.fecthingData("platformName");
		String platformVersion = comdat.fecthingData("platformVersion");
		String deviceName = comdat.fecthingData("deviceName");
		String deviceId = comdat.fecthingData("deviceID");
		
		mbUtil.desiredCapabilityObject();
		mbUtil.setCapabilities(MobileCapabilityType.PLATFORM_NAME,platformName);
		mbUtil.setCapabilities(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		mbUtil.setCapabilities(MobileCapabilityType.DEVICE_NAME,deviceName);
		mbUtil.setCapabilities(MobileCapabilityType.UDID,deviceId);
		mbUtil.setCapabilities("appPackage","com.bigbasket.mobileapp");
		mbUtil.setCapabilities("appActivity",".activity.SplashActivity");
		
		
//		DesiredCapabilities dc=new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
//		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
//		dc.setCapability("appPackage","com.bigbasket.mobileapp");
//		dc.setCapability("appActivity",".activity.SplashActivity");
//		
		
		mbUtil.urlMethod("http://localhost:4723/wd/hub");
		AndroidDriver driver = mbUtil.androidDriverObject();
		
		//pom class object creation
				BigBasketLoginPg lgPg=new BigBasketLoginPg(driver);
				HomePgBig hgpg=new HomePgBig(driver);
		
		
//		URL url=new URL("http://localhost:4723/wd/hub");
//		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		driver.launchApp();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		lgPg.clickLoginBtn();
		
		lgPg.clickContinueBtn();
		Thread.sleep(200);
		hgpg.getTheProduct();
		
		
	}

}
