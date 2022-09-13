import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"AOSP on IA Emulator");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		
		//WebElement view = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		//driver.tap(1, view, 100);
		
		//verical swipe 
		//driver.swipe(217, 1388, 217, 676, 100);
		
		Dimension size = driver.manage().window().getSize();
		
		int height = size.getHeight();
		System.out.println(height);
		int width = size.getWidth();
		System.out.println(width);

		
		//vertical swipe
		driver.swipe(width/2, (int)(height*0.25), width/2, (int)(height*0.80),1000);
		driver.swipe((int)(width*0.1), (int)(height*0.2), (int)(width*0.1), (int)(height*0.80),500);
		driver.swipe((int)(width*0.5), (int)(height*0.2), (int)(width*0.5), (int)(height*0.80),500);
		driver.swipe((int)(width*0.9), (int)(height*0.2), (int)(width*0.9), (int)(height*0.80),500);

		//horizontal swipe
		
	//	driver.swipe((int)(width*0.25),height, width, height, width);



		
		
		
		
		
		
		
		
		
//		ScreenOrientation ori = driver.getOrientation();
//		driver.rotate(ori.LANDSCAPE);
//		
//		//verical swipe equalhalf
//		
//		Dimension size = driver.manage().window().getSize();
//		
//		int height = size.getHeight();
//		int width = size.getWidth();
//		driver.swipe(width/2, height, width/2, height, 100);
		
		
		
		

	}

}
