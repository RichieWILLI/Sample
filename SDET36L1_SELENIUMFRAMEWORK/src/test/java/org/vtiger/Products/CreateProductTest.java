package org.vtiger.Products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

public class CreateProductTest {

	@Test(retryAnalyzer = org.tyss.generic.ListnersclassIRetryAnalyserImplementationClass.class)
	public void createProductTest()
	{
		
		PropertyFileUtility properties=new PropertyFileUtility();
		WebDriverUtility webutility=new WebDriverUtility();
		JavaUtility javaUtil=new JavaUtility();
		ExcelFileUtility excelUtils=new ExcelFileUtility();
		
		properties.loadPropertyFile(IConstantUtility.VITIGERPROPERTYFILEPATH);
		
		String url = properties.getPropertyData("url");
		String usn = properties.getPropertyData("username");
		String psd = properties.getPropertyData("password");
		String browser = properties.getPropertyData("browser");
		String timeouts = properties.getPropertyData("timeout");
		
		WebDriver driver = webutility.browserSelect(browser);
		
		long longTimeouts = javaUtil.stringToIntConvertUsingParse(timeouts);
		webutility.browserMaximize();
		webutility.implicitWaitMethodCall(longTimeouts);
		webutility.getUrlMethod(url);
		
		
	
		int randomNumber= javaUtil.getRandomMethod();
		
		excelUtils.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String enteredData =excelUtils.getExcelData("Product",2,1) +randomNumber;
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		Assert.fail();
		
		driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(enteredData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
	
		
		String textEntered = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		String expectedText = enteredData;
		if(textEntered.equals(expectedText))
		{
			System.out.println("the entered text and expected text are same");
			excelUtils.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelUtils.writeDataToExcel("Product",2,3,"Pass",IConstantUtility.VITIGEREXCELFILEPATH);
			
		}
		else {
			System.out.println("the entered text and expected text are not same");
			excelUtils.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelUtils.writeDataToExcel("Product",2,3,"Fail",IConstantUtility.VITIGEREXCELFILEPATH);
			
			
			
		}
		webutility.actionClassCall();
		WebElement adminstatorIcon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		webutility.mousehoverAction(adminstatorIcon);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		excelUtils.closeWorkBook();
		webutility.browserQuit();
		
	}

}
