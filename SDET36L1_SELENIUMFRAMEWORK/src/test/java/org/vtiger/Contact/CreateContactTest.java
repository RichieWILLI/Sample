package org.vtiger.Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tyss.generic.BassClass;
import org.tyss.generic.IConstantUtility;
import org.vitiger.objectReposatary.CommonPage;
import org.vitiger.objectReposatary.ContactInformationPage;
import org.vitiger.objectReposatary.CreateContactPage;
import org.vitiger.objectReposatary.CreateNewContactPage;

public class CreateContactTest extends BassClass {
	
	@Test()
	 public void createContactTest(){


		CommonPage cmnPg=new CommonPage(driver);
		CreateContactPage contPg=new CreateContactPage(driver);
		CreateNewContactPage contnewPg=new CreateNewContactPage(driver);
		ContactInformationPage infoPg=new ContactInformationPage(driver);
		
		cmnPg.contactmodule();
		
		contPg.clickCreateContactIcon();

		String data = excelFile.getExcelData("Contacts",2,1)+randomNumber;

		contnewPg.enterLastName(data);
		contnewPg.clickonSaveBtn();
		
		String actual = infoPg.gettextOfLastNameOfContact();
		
	//	driver.findElement(By.name("lastname")).sendKeys(data);
		//driver.findElement(By.name("button")).click();
		//String actual = driver.findElement(By.id("dtlview_Last Name")).getText();
		String excepted=data;
		
		
		
		if(actual.equals(excepted))
		{
			System.out.println("The actual and excepted values are same");

			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Contacts", 2, 3, "Pass", IConstantUtility.VITIGEREXCELFILEPATH);

		}
		else {
			System.out.println("the actual and expected values are not same");

		 	excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Contacts", 2, 3, "Fail", IConstantUtility.VITIGEREXCELFILEPATH);

		}

		webUtility.actionClassCall();
		cmnPg.mouseHoverToSignOut(webUtility);
		
		
		
//		WebElement resourse = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//
//		webUtility.mousehoverAction(resourse);
//
//		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		


	}
	

}


