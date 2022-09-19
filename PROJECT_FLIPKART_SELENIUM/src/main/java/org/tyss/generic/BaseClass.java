package org.tyss.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.tyss.pageobject.AddToCartPage;
import org.tyss.pageobject.CartPage;
import org.tyss.pageobject.HomePage;
import org.tyss.pageobject.ProductPage;
import org.tyss.pageobject.loginPageTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public PropertyFileUtility prop;
	
	public JavaUtility javaUtil;
	public WebDriverUtility webUtility;
	public String url;
	public String usn;
	public String psd;
	public String browser;
	public String timeouts;
	public int randomNumber;
	public WebDriver driver;
	public long longTimeout;
	public JavaScriptExecutorUtility jsUtility;
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("before suite method is executing");
	}
	
	
	@BeforeTest
	public void beforetestMethod() {
		System.out.println("before test is executing");
	}
	@BeforeClass
	public void beforeClassMethod() {
		
		//utility object creation
		System.out.println("before class method");
		
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		prop=new PropertyFileUtility();
		
		javaUtil=new JavaUtility();
		webUtility=new WebDriverUtility();
		
		
		prop.loadPropertyFile(IConstantUtility.FLIPKARTPROPERTYFILEPATH);

		url = prop.getPropertyData("url");
		usn = prop.getPropertyData("username");
		psd = prop.getPropertyData("password");
		
		browser = prop.getPropertyData("browser");
		timeouts = prop.getPropertyData("timeout");

		driver=webUtility.browserSelect(browser);
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
				
				
		

		webUtility.browserMaximize();
		longTimeout = javaUtil.stringToIntConvertUsingParse(timeouts);
		webUtility.implicitWaitMethodCall(longTimeout);
		webUtility.getUrlMethod(url);
		
	}
	@AfterMethod
	public void afterMethod() {
		
		webUtility.browserQuit();
	}
	@AfterClass
	public void afterClassMethod() {
		System.out.println("after class method");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("after test is executing");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("after suite method is executing");
	}

}
