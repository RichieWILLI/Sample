package org.tyss.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.vitiger.objectReposatary.CommonPage;
import org.vitiger.objectReposatary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	public PropertyFileUtility prop;
	public ExcelFileUtility excelFile;
	public JavaUtility javaUtil;
	public WebDriverUtility webUtility;
	public String url;
	public String usn;
	public String psd;
	public String browser;
	public String timeouts;
	public int randomNumber;
	public LoginPage lgpg;
	public WebDriver driver;
	public long longTimeout;

	@BeforeSuite()
	public void beforeSuiteMethod() {

		
		System.out.println("Before Suite");
		//creating object of generic class

	
	}
	@Parameters("browser")
	@BeforeClass()
	public void beforeClassMethod(String browser) {
		
		System.out.println("Before class");
		
		
		
		

		

	}

	
	@BeforeMethod()
	public void beforeMethod() {
		
		System.out.println("before method");
		
		prop=new PropertyFileUtility();
		excelFile=new ExcelFileUtility();
		javaUtil=new JavaUtility();
		webUtility=new WebDriverUtility();
		
		prop.loadPropertyFile(IConstantUtility.VITIGERPROPERTYFILEPATH);

		url = prop.getPropertyData("url");
		usn = prop.getPropertyData("username");
		psd = prop.getPropertyData("password");
		//browser = prop.getPropertyData("browser");
		timeouts = prop.getPropertyData("timeout");

		
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		
				
		//driver = webUtility.browserSelect(browser);

		webUtility.browserMaximize();
		longTimeout = javaUtil.stringToIntConvertUsingParse(timeouts);
		webUtility.implicitWaitMethodCall(longTimeout);

		lgpg=new LoginPage(driver);

		randomNumber=javaUtil.getRandomMethod();

		
		excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);


		webUtility.getUrlMethod(url);

		lgpg.pageLogin(usn, psd);



	}
	@AfterMethod()
	public void aftermethod() {
		
		System.out.println("After Method");
		excelFile.closeWorkBook();
		
	}


	@AfterClass()
	public void afterClassMethod() {
		
		System.out.println("After Class");
		
		webUtility.browserClose();
		webUtility.browserQuit();
	}

	@AfterSuite()
	public void afterSuiteMethod() {
		System.out.println("After Suite");
		
	}

}
