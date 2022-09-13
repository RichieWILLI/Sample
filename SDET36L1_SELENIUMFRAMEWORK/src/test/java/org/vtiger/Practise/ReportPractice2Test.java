package org.vtiger.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("allure epic 1")

public class ReportPractice2Test {
	
	@Severity(SeverityLevel.CRITICAL)
	@Description("very good")
	
	
	@Test
	public void reportPractice2Test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testyantra",Keys.ENTER);
		
		driver.close();
	}

}
