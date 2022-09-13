package org.tyss.genric;

import org.hms.objectRepo.HomePage;
import org.hms.objectRepo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public FileUtility flUtil;
	public WebUtility webUtil;
	public JavaUtility javaUtil;
	public ExcelFileUtility excelUtil;
	public JavaScriptUtility javascriptUtil;
	public WebDriver driver;
	public String browser;
	public String timeouts;
	public LoginPage lgPg;
	public String url;
	public HomePage homePg;
	public long longTimeOut;
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		
		System.out.println("before suite");
		
		//creating generic object
				flUtil=new FileUtility();
				 webUtil=new WebUtility();
				javaUtil=new JavaUtility();
				excelUtil=new ExcelFileUtility();
				javascriptUtil=new JavaScriptUtility();
				
				
				
				
				
				
				
				
				
				
		
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before Test");
		
	}
	@BeforeClass
	public void beforeClassTest() {
		
		System.out.println("before class");
		
		flUtil.propertyfileInitilize(IConstantUtility.HMSCOMMONDATAFILELOCATION);
		
		excelUtil.loadExcelFile(IConstantUtility.HMSTESTDATFILELOCATION);
		
		
		
		url = flUtil.getDataFromCommonData("url");
		browser= flUtil.getDataFromCommonData("browser");
		timeouts= flUtil.getDataFromCommonData("timeout");
		longTimeOut = javaUtil.parseStringToLong(timeouts);
		driver = webUtil.selectBrowser(browser);
		
		webUtil.maximizeBrowser();
		webUtil.implicitlyWaitMethod(longTimeOut);
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method");
		lgPg=new LoginPage(driver);
		homePg=new HomePage(driver);
		
		
		
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
		
		
	}
	@AfterClass
	public void afterClassMethod() {
		System.out.println("after class");
		
	}
	@AfterTest
	public void afterTestMethod() {
		System.out.println("after test");
		
	}
	@AfterSuite
	public void afterSuitMethod() {
		System.out.println("after suite");
		excelUtil.closeWorkBook();
		
		
	}
	

}
