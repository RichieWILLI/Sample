import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverNaukri {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
		
		dc.setCapability("appPackage","naukriApp.appModules.login");
		dc.setCapability("appActivity","com.naukri.deeplinking.ApplyDeeplinkInterceptActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		
		driver.findElement(By.id("naukriApp.appModules.login:id/textViewContinue")).click();
		driver.findElement(By.id("naukriApp.appModules.login:id/profile_navigation")).click();
		
		//swipe action
		driver.swipe(471, 891, 471, 290, 200);
		
		//run in background
		
		driver.runAppInBackground(10);
		
		//switch app
		driver.startActivity("io.appium.android.apis",".ApiDemos");
		
		//harware control
		
		Connection connect = driver.getConnection();
		
		driver.setConnection(connect.AIRPLANE);
		
		driver.setConnection(connect.WIFI);
		
		
		//orientation
		
//		ScreenOrientation orientation = driver.getOrientation();
//		driver.rotate(orientation.LANDSCAPE);
//		Thread.sleep(200);
//		driver.rotate(orientation.PORTRAIT);
		
	}

}
