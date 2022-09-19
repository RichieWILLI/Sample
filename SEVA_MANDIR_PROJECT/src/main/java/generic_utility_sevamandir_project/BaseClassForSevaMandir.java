package generic_utility_sevamandir_project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClassForSevaMandir {
	
	public DriverMethods driverUtilis;
	public FileUtilities fileutilis;
	public String url;
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("before class method is executing");
		driverUtilis=new DriverMethods();
		fileutilis=new FileUtilities();
		
		fileutilis.fetchingPropertyData(Iconstant.PROPERTYFILEPATH);
		String platformName = fileutilis.loadPropertyFile("platformName");
		String platformVersion = fileutilis.loadPropertyFile("platformVersion");
		String deviceName = fileutilis.loadPropertyFile("deviceName");
		String deviceUdid = fileutilis.loadPropertyFile("deviceUdid");
		String appPackage = fileutilis.loadPropertyFile("appPackage");
		String appActivity = fileutilis.loadPropertyFile("appActivity");
		 url = fileutilis.loadPropertyFile("url");
		
		
		
		
		
		driverUtilis.desiredCapabilty();
		driverUtilis.setCapabilty(MobileCapabilityType.PLATFORM_NAME, platformName);
		driverUtilis.setCapabilty(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		driverUtilis.setCapabilty(MobileCapabilityType.DEVICE_NAME, deviceName);
		driverUtilis.setCapabilty(MobileCapabilityType.UDID, deviceUdid);
		driverUtilis.setCapabilty("appPackage", appPackage);
		driverUtilis.setCapabilty("appActivity", appActivity);
		
	}

	
	@BeforeMethod
	public void beforeMethod() {
		
		
		driverUtilis.url(url);
		driverUtilis.androidDriver();
		driverUtilis.launchingApp();
		
		
	}
	
	
	
}
