package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Project {
	@Test
	public void project() throws MalformedURLException
	{
		
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"RR");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID,"9a07233");
		desiredCapabilities.setCapability("appPackage","com.app.dream11Pro");
		desiredCapabilities.setCapability("appActivity","com.app.dream11.dream11.SplashActivity");
		
		
			URL url=new URL("http://localhost:4723/wd/hub");
		
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, desiredCapabilities);
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		MobileElement selectEnglishLanguage = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='English']"));
//		selectEnglishLanguage.tap(1, 10);
//		MobileElement clickContinueBtn = (MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']"));
//		clickContinueBtn.tap(1, 10);
		MobileElement registerBtn = (MobileElement)driver.findElement(By.xpath("//android.widget.ImageView[@package='com.app.dream11Pro']"));
		driver.tap(1, 487, 1950, 10);
		MobileElement mobileNumberTextBox = (MobileElement)driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile no.']"));
		
		
		mobileNumberTextBox.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mobileNumberTextBox));
		
		driver.tap(1, 641, 1918, 10);
		driver.tap(1, 148, 1934, 10);
		driver.tap(1, 148, 1799, 10);
		driver.tap(1, 148, 1651, 10);
		driver.tap(1, 148, 1934, 10);
		driver.tap(1,706,1643, 10);
		driver.tap(1, 148, 1651, 10);
		driver.tap(1, 407, 1815, 10);
		driver.tap(1, 407, 1815, 10);
		driver.tap(1, 148, 1651, 10);
		
		mobileNumberTextBox.sendKeys("9741731551");
		MobileElement secondRegisterBtn = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='REGISTER']"));
		secondRegisterBtn.tap(1, 10);
		
		driver.switchTo().alert().accept();
		WebElement allowButton = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		String name = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(name);
		
		MobileElement login = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Log in']"));
		login.click();
		MobileElement enterMobileNumber = (MobileElement)driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile no']"));
		enterMobileNumber.sendKeys("9741731551");
		MobileElement nextbtn = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
		nextbtn.click();
		
		scrollToView(driver,"id","com.android.packageinstaller:id/button_group");
		
	}
	public static void scrollToView(AndroidDriver driver,String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	
	}
}
