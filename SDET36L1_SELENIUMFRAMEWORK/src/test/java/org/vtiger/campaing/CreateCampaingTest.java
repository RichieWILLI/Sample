package org.vtiger.campaing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.tyss.generic.BassClass;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;
import org.vitiger.objectReposatary.CampaignInformationPage;
import org.vitiger.objectReposatary.CampaingPage;
import org.vitiger.objectReposatary.CommonPage;
import org.vitiger.objectReposatary.CreatingNewCampaignPage;
import org.vitiger.objectReposatary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaingTest extends BassClass {
	
	@Test()
	public void createCampaingTest() throws IOException {
		
		
		
		
//		PropertyFileUtility prop=new PropertyFileUtility();
//		ExcelFileUtility excelFile=new ExcelFileUtility();
//		JavaUtility javaUtil=new JavaUtility();
//		WebDriverUtility webUtility=new WebDriverUtility();
//		
//		prop.loadPropertyFile(IConstantUtility.VITIGERPROPERTYFILEPATH);
//		
//		String url = prop.getPropertyData("url");
//		String usn = prop.getPropertyData("username");
//		String psd = prop.getPropertyData("password");
//		String browser = prop.getPropertyData("browser");
//		String timeouts = prop.getPropertyData("timeout");
//
//		long longTimeout = javaUtil.stringToIntConvertUsingParse(timeouts);
//
//		WebDriver driver = webUtility.browserSelect(browser);
//
//		webUtility.browserMaximize();
		
		//Object
//		LoginPage lgnpg=new LoginPage(driver);
		CommonPage compg=new CommonPage(driver);
		CampaingPage createCamp=new CampaingPage(driver);
		CreatingNewCampaignPage campNameSave=new CreatingNewCampaignPage(driver);
		CampaignInformationPage getCampaingText=new CampaignInformationPage(driver);
		

//		webUtility.implicitWaitMethodCall(longTimeout);
//
//		webUtility.getUrlMethod(url);
		
		
//		lgnpg.pageLogin(usn, psd);

		
		webUtility.actionClassCall();
		
		
		compg.mouseHoverAndCampaing(webUtility);
		

		createCamp.clickCreateCamapingIcon();
		
		
//		int randomNumber =javaUtil.getRandomMethod();
		//convert the physical file to java readable object
		
		excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String data = excelFile.getExcelData("Campaing",2,1)+randomNumber;
		
		
		
		
		campNameSave.nameCampaingClickSave(data);
		
		String actual = getCampaingText.getCampaingTextName();
		String expected =data;
		if(actual.equals(expected))
		{
			System.out.println("Actual and Expected are same");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Campaing",2,3,"Pass",IConstantUtility.VITIGEREXCELFILEPATH);
			
		}
		else
		{
			System.out.println("Actual and Expected are not same");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Campaing",2,3,"Fail",IConstantUtility.VITIGEREXCELFILEPATH);
			
		}
		
		
		compg.mouseHoverToSignOut(webUtility);

		
		
//		excelFile.closeWorkBook();
//		webUtility.browserQuit();
		

	}
	

}
