package org.vtiger.Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaScriptExecutorUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

public class ScreenShot {

	public static void main(String[] args) {
		
		PropertyFileUtility propUtils=new PropertyFileUtility();
		WebDriverUtility webUtils=new WebDriverUtility();
		JavaUtility javautils= new JavaUtility();
		JavaScriptExecutorUtility javaScriptUtil=new JavaScriptExecutorUtility();
				
		
		propUtils.loadPropertyFile(IConstantUtility.VITIGERPROPERTYFILEPATH);
		
		String url = propUtils.getPropertyData("url");
		String usn = propUtils.getPropertyData("username");
		String psd = propUtils.getPropertyData("password");
		String browser = propUtils.getPropertyData("browser");
		String timeouts = propUtils.getPropertyData("timeout");
		
		WebDriver driver = webUtils.browserSelect(browser);
		webUtils.getUrlMethod(url);
		webUtils.browserMaximize();
		
		
		long time = javautils.stringToIntConvertUsingParse(timeouts);
		
		webUtils.implicitWaitMethodCall(time);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		
		
		webUtils.takeScreenShot();
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		
		javaScriptUtil.typeCastingToJavaScriptExecute(driver);
	
		javaScriptUtil.scrollTillDown();
		
	
				
				driver.close();

		
		
		
	}

}
