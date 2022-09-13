package org.vtiger.Contact;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tyss.generic.BassClass;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;
import org.vitiger.objectReposatary.ChildWindowInOrganisationModule;
import org.vitiger.objectReposatary.CommonPage;
import org.vitiger.objectReposatary.ContactInformationPage;
import org.vitiger.objectReposatary.CreateContactPage;
import org.vitiger.objectReposatary.CreateNewContactPage;
import org.vitiger.objectReposatary.CreateNewOrganisationPage;
import org.vitiger.objectReposatary.LoginPage;
import org.vitiger.objectReposatary.OrganisationInformationPage;
import org.vitiger.objectReposatary.OrganisationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithOrganizationTest extends BassClass {


	@Test()
	public void reateContactWithOrganizationTest()  throws IOException, InterruptedException {


		//pom class object
		//		LoginPage lgnpg=new LoginPage(driver);
		CommonPage compg=new CommonPage(driver);
		OrganisationPage orgPg=new OrganisationPage(driver);
		CreateNewOrganisationPage creatOrgPg=new CreateNewOrganisationPage(driver);
		OrganisationInformationPage orgInfoPg=new OrganisationInformationPage(driver);
		CreateContactPage contPg=new CreateContactPage(driver);
		CreateNewContactPage contnewPg=new CreateNewContactPage(driver);
		ChildWindowInOrganisationModule childOrgPg=new ChildWindowInOrganisationModule(driver);
		ContactInformationPage infoPg=new ContactInformationPage(driver);




		String actualData =excelFile.getExcelData("Contacts",4,1)+randomNumber;
		String lastNameInContact =excelFile.getExcelData("Contacts",4,2)+randomNumber;

		//		lgnpg.pageLogin(usn, psd);
		compg.organisationClick();
		orgPg.clickOnCreateOrganisationIcon();
		creatOrgPg.enterOrganisationName(actualData);
		creatOrgPg.clickSave();


		orgInfoPg.explicitWaitUsingVisibilityOfElementLoactor(webUtility, longTimeout);
		compg.contactmodule();
		contPg.clickCreateContactIcon();
		contnewPg.enterLastName(lastNameInContact);
		contnewPg.clickonorganisationIcon();










		//getting into child window

		Set<String> allwhs = driver.getWindowHandles();
		for (String whs: allwhs) {
			driver.switchTo().window(whs);
			if(driver.getCurrentUrl().contains("Accounts")) {
				break;

			}
		}


		childOrgPg.typeInSearchBox(actualData);
		childOrgPg.clickOnSearchBtn();	
		childOrgPg.dynamicXpath(actualData);

		//comming out of child window
		Set<String> allwhs2 = driver.getWindowHandles();
		for (String whs2 : allwhs2) {
			driver.switchTo().window(whs2);
			if(driver.getCurrentUrl().contains("Documents")) {
				break;
			}


		}


		contnewPg.clickonSaveBtn();


		String enteredContactLastNameData = infoPg.gettextOfLastNameOfContact();
		String enteredOrganisationName = infoPg.getTextOfOrgName(actualData, driver);




		if(enteredContactLastNameData.equals(lastNameInContact)&& enteredOrganisationName.equals(actualData)) {
			System.out.println("the data entered is correctly matching");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Contacts",4,3,"Pass",IConstantUtility.VITIGEREXCELFILEPATH);
		}
		else {
			System.out.println("the data entered is not matching");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Contacts",4,3,"Fail",IConstantUtility.VITIGEREXCELFILEPATH);

		}

		webUtility.actionClassCall();

		compg.mouseHoverToSignOut(webUtility);



	}
	
	


}


