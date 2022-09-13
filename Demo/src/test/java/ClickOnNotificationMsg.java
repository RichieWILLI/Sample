import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClickOnNotificationMsg {
	
	@Test
	public void ClickOnNotificationMsg() throws MalformedURLException, InterruptedException {
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
	dc.setCapability(MobileCapabilityType.UDID,"9a07233");
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity",".ApiDemos");
	
	URL ur=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(ur, dc);
	driver.launchApp();

	driver.findElementByAccessibilityId("App").click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
	driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
	
	driver.openNotifications();
	
	Thread.sleep(200);
	driver.findElement(By.className("android.widget.TextView")).click();
	//dont work use text=joe
	
	//mani sent
//	WebElement clickcontinue = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
//	driver.tap(1, clickcontinue, 300);
//	WebElement clickok = driver.findElement(By.id("android:id/button1"));
//	driver.tap(1, clickok, 300);
//	driver.findElementByAccessibilityId("App").click();
//	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
//	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
//	Thread.sleep(2000);
//	driver.findElementByAccessibilityId("Show App Notification").click();
//	Thread.sleep(2000);
//	driver.openNotifications();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
	
	
}
}
