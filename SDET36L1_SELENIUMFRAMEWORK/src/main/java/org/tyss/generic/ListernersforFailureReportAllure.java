package org.tyss.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;

public class ListernersforFailureReportAllure implements ITestListener {

	public WebDriver driver;
	
	public void onTestStart(ITestResult result) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Attachment(value="abc",type = "img/png")
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./screen/shot.png");
		try {
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	
		
		
			
			
		 
			
			
	
	}
		

