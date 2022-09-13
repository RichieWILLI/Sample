package Generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService server;
	AndroidDriver driver;
	
	@BeforeSuite
	public void opendatabase() {
		System.out.println("start database");
	}
	
	
	
	@BeforeClass()
	public void startServer() {
		server = AppiumDriverLocalService.buildDefaultService();
		server.start();
		
		
		
	}
	
	
	@BeforeMethod()
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		 driver=new AndroidDriver(ur, dc);
		driver.launchApp();
	}
	@AfterMethod()
	public void closeApp() {
		driver.closeApp();
	}
	@AfterClass()
	public void closeServer() {
		server.stop();
		
	}
	@AfterSuite()
	public void closedatebase() {
		System.out.println("close database");
	}
	
}
