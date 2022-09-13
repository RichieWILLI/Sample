package org.hms.practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPractice {

	public WebDriver driver;

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}
	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String browser) {
		//open the browser and driver executable
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//mazimize and implicit wait
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		else if(browser.equals("microsoftedge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("beforeMethod");
		driver.get("http://localhost:8888/");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

}
