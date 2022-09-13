import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnApiUsingTapAction {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		
		WebElement view = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		driver.tap(1, view, 100);
		WebElement control = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]"));
		driver.tap(1, control, 100);
		WebElement lightTheme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]"));
		driver.tap(1, lightTheme, 100);
		
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("keertana Madam");
		WebElement checkbox1 = driver.findElement(By.id("io.appium.android.apis:id/check1"));
		driver.tap(1, 53, 505, 100);
		WebElement checkbox2 = driver.findElement(By.id("io.appium.android.apis:id/check2"));
		driver.tap(1, 70, 669, 100);

		WebElement radio1 = driver.findElement(By.id("io.appium.android.apis:id/radio1"));
		driver.tap(1, 57, 805,100);
		WebElement radio2 = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		driver.tap(1, 62, 940, 100);
		WebElement star = driver.findElement(By.id("io.appium.android.apis:id/star"));
		driver.tap(1, 57, 1043, 100);
		WebElement tog1 = driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		driver.tap(1, 57, 1150, 100);
		WebElement tog2 = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		driver.tap(1, 94, 1257, 100);
		WebElement dropdown = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, 949, 1400, 100);
		
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Mars']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement save = driver.findElement(By.id("io.appium.android.apis:id/button"));
		driver.tap(1, 53, 57, 100);
		
		WebElement dropdownSecond = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1, 949, 1400, 100);
		
		List<WebElement> allList = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		for (WebElement all: allList) {
			String values = all.getText();
			System.out.println(values);
			
		}
		
		
		
		

	}

}
