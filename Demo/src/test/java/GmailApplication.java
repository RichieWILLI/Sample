import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GmailApplication {
	
	@Test
	public void gmailApplication() throws MalformedURLException, InterruptedException {
		
//		MobileDriverUtility mbUtil=new MobileDriverUtility();
//		
//		
//		
//		
//		mbUtil.desiredCapabilties(MobileCapabilityType.PLATFORM_NAME,"Android");
//		mbUtil.desiredCapabilties(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
//		mbUtil.desiredCapabilties(MobileCapabilityType.DEVICE_NAME,"RR");
//		mbUtil.desiredCapabilties(MobileCapabilityType.UDID,"9a07233");
//		mbUtil.desiredCapabilties("appPackage","com.androidsample.generalstore");
//		mbUtil.desiredCapabilties("appActivity",".SplashActivity");
//		
//		
//		mbUtil.urlMethod("http://localhost:4723/wd/hub");
//		mbUtil.androidDriver();
//		mbUtil.launchApp();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.190616.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		dc.setCapability(MobileCapabilityType.UDID,"9a07233");
		dc.setCapability("appPackage","com.google.android.gm");
		dc.setCapability("appActivity",".ConversationListActivityGmail");
		
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.launchApp();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("com.google.android.gm:id/welcome_tour_got_it")).click();
		driver.findElement(By.id("com.google.android.gm:id/account_display_name")).click();
		driver.findElement(By.id("com.google.android.gm:id/action_done")).click();
		Thread.sleep(100);
		driver.findElementByAccessibilityId("Close").click();
		driver.findElement(By.id("com.google.android.gm:id/compose_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.EditText")).sendKeys("richardwilliam1994@gmail.com");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]")).click();
		driver.findElement(By.id("com.google.android.gm:id/subject")).sendKeys("Testing Gmail");
		driver.findElement(By.id("com.google.android.gm:id/wc_body_layout")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText")).sendKeys("hi..Richie");
		driver.hideKeyboard();
		driver.findElementByAccessibilityId("Send").click();
		
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[11]/android.widget.LinearLayout")).click();
		
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
		
		
	}

}
