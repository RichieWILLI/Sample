package Generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtilities {
	
	public DesiredCapabilities dc;
	public URL ur;
	public AndroidDriver driver; 

	public void desiredCapabilityObject() {
		dc=new DesiredCapabilities();
	}
	
	public void setCapabilities(String capabilityName,String capabilityValue) {
		dc.setCapability(capabilityName,capabilityValue);
		}
	
	public void urlMethod(String url) throws MalformedURLException {
		ur=new URL(url);
	}
	
	public AndroidDriver androidDriverObject() {
		return driver =new AndroidDriver(ur, dc);
	}
	
	
	public void launchAppMethod() {
		driver.launchApp();
	}
	
	public void tapMethod(int fingure,WebElement element,int time) {
		driver.tap(fingure,element, time);
	}
	
	public void tapMethod(int fingure,int x_cordinate,int y_cordinate,int time) {
		driver.tap(fingure, x_cordinate, y_cordinate, time);
	}
	
	public void swipe(int start_x,int start_y, int end_x,int end_y,int time) {
		driver.swipe(start_x,start_y,end_x,end_y,time);
	}
	
	public void install(String pathOfFile) {
		driver.installApp(pathOfFile);
	}
	
	public void checkingAppIsInstalled(String packageName) {
		driver.isAppInstalled(packageName);
	}
	
	public void runAppInBackground(int timeDuration) {
		driver.runAppInBackground(timeDuration);
	}
	
	public void removeApp(String packageName) {
		driver.removeApp(packageName);
	}
	
	public void zoom(WebElement element) {
		driver.zoom(element);
	}
	
	public void zoom(int x, int y) {
		driver.zoom(x, y);
	}
	public void pinch(WebElement element) {
		driver.pinch(element);
	}
	
	public void pinch(int x,int y) {
		driver.pinch(x, y);
	}
	
}
