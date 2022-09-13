package org.vtiger.campaing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import org.vitiger.objectReposatary.CreateNewProductPage;
import org.vitiger.objectReposatary.CreatingNewCampaignPage;
import org.vitiger.objectReposatary.LoginPage;
import org.vitiger.objectReposatary.ProductPage;

import com.fasterxml.jackson.databind.ser.AnyGetterWriter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaingWithProductTest extends BassClass {
	
	@Test()
	public void createCampaingWithProductTest() throws IOException, InterruptedException {

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
//
//		webUtility.implicitWaitMethodCall(longTimeout);
		
		//object
//		LoginPage lgnpg=new LoginPage(driver);
		CommonPage compg=new CommonPage(driver);
		ProductPage prodPg=new ProductPage(driver);
		CreateNewProductPage prodCre=new CreateNewProductPage(driver);
		CampaingPage createCamp=new CampaingPage(driver);
		CreatingNewCampaignPage campNameSave=new CreatingNewCampaignPage(driver);
		CampaignInformationPage getCampaingText=new CampaignInformationPage(driver);

//		webUtility.getUrlMethod(url);
		
		
//		lgnpg.pageLogin(usn, psd);

//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		//creating product
		
//		int randomValue =javaUtil.getRandomMethod();
		
//		excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String actualProductName =excelFile.getExcelData("Campaing",4,2)+randomNumber;
		compg.productBtnClick();
		prodPg.clickCreateProductIcon();
		prodCre.productNameText(actualProductName);
		prodCre.productSave();

		//clicking on campaing module
		String actualCampaingName =excelFile.getExcelData("Campaing",4,1)+randomNumber;
		webUtility.actionClassCall();
		
		
		WebElement more = driver.findElement(By.xpath("//a[@href='javascript:;']"));
		compg.mouseHoverAndCampaing(webUtility);
		createCamp.clickCreateCamapingIcon();
		campNameSave.nameCampaingProductClick(actualCampaingName);
		campNameSave.productSelectIcon();

		String parentWindow = driver.getWindowHandle();

		Set<String> allwh = driver.getWindowHandles();
		for (String childWindow : allwh) {
			driver.switchTo().window(childWindow);




		}

		campNameSave.searchProduct(actualProductName);
		campNameSave.clickSearchBtn();

		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='javascript:window.close();']")));
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));

		campNameSave.serachedProduct();

		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);




		//String te = driver.findElement(By.xpath("//b[.='Campaign Information']")).getText();
		//System.out.println(te);
		campNameSave.clickSaveCampaing();
		String campaingNameText = getCampaingText.getCampaingTextName();
		String productText = getCampaingText.getProductText();
		
		if(campaingNameText.equals(actualCampaingName)&& productText.equals(actualProductName) )
		{
			System.out.println("enter campaing name and expected are same");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Campaing",4,3,"Pass",IConstantUtility.VITIGEREXCELFILEPATH);
			
		}
		else
		{
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Campaing",4,3,"Fail",IConstantUtility.VITIGEREXCELFILEPATH);
			System.out.println("enter campaing name and expected are not same");
		}
		//String productText = driver.findElement(By.xpath("//span[@id='dtlview_Product']")).getText();
		//if(productText.equals(actualProductName)) {
			//System.out.println("same");
		//}
//		else {
//			System.out.println("not same");
//		}
		
//		WebElement admin = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		webUtility.mousehoverAction(admin);
//		driver.findElement(By.linkText("Sign Out")).click();
		
		compg.mouseHoverToSignOut(webUtility);
//		
//		excelFile.closeWorkBook();
//		
//		webUtility.browserQuit();

	}


}
