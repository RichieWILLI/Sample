package org.vtiger.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserBaseClass {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browser) {
		
		switch (browser) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			 driver=new ChromeDriver();
//			break;
		case "firefox":
			
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();

		default:
			break;
		}
		
	}

}
