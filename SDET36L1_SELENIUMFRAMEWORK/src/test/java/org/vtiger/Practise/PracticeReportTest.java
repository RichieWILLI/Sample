package org.vtiger.Practise;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tyss.generic.PracticeListnersreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(org.tyss.generic.PracticeListnersreport.class)
public class PracticeReportTest{

	@Test
	public void practiceReportTest() throws InterruptedException {
		
		
		
		
		
		
	
		
		WebDriverManager.chromedriver().setup();
		PracticeListnersreport.logTest.info("Setting up the driver executables");
		
		WebDriver driver=new ChromeDriver();
		PracticeListnersreport.logTest.info("Launching the browser");
		
		driver.get("http://www.google.com");
		PracticeListnersreport.logTest.info("getting url");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testyantra", Keys.ENTER);
		PracticeListnersreport.logTest.info("typing data");
		
		Thread.sleep(3000);
		PracticeListnersreport.logTest.info("waiting for browser");
		
		driver.close();
		PracticeListnersreport.logTest.info("closing the browser");
		
		PracticeListnersreport.logTest.pass("test is pass");
		
		
	}

}
