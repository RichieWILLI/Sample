package org.vtiger.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;


@Listeners(org.tyss.generic.PracticeListeners.class)
public class TakeScreenShotTestUsingListners {

	
	@Test
	public void takeScreenShotTestUsingListners() {
		
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
		
		Assert.fail();
		
		
	
		int randomNumber= javaUtil.getRandomMethod();
		
		excelUtils.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String enteredData =excelUtils.getExcelData("Product",2,1) +randomNumber;
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		
		
		
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
		
		driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(enteredData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		
	}

}
