package org.vtiger.Organization;

import java.awt.Desktop.Action;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationTest {

	public static void main(String[] args) {
		
		PropertyFileUtility prop=new PropertyFileUtility();
		ExcelFileUtility excelFile=new ExcelFileUtility();
		JavaUtility javaUtil=new JavaUtility();
		WebDriverUtility webUtility=new WebDriverUtility();
		
		prop.loadPropertyFile(IConstantUtility.VITIGERPROPERTYFILEPATH);

		String url = prop.getPropertyData("url");
		String usn = prop.getPropertyData("username");
		String psd = prop.getPropertyData("password");
		String browser = prop.getPropertyData("browser");
		String timeouts = prop.getPropertyData("timeout");

		long longTimeout = javaUtil.stringToIntConvertUsingParse(timeouts);

		WebDriver driver = webUtility.browserSelect(browser);

		webUtility.browserMaximize();

		webUtility.implicitWaitMethodCall(longTimeout);

		webUtility.getUrlMethod(url);
		
		
		
		
		
		int randomNumber =javaUtil.getRandomMethod();
		excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String actualData =excelFile.getExcelData("Organisation",2,1)+randomNumber;
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(actualData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		String textEntered = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		String expectedData = actualData;
		if(textEntered.equals(expectedData))
		{
			
			System.out.println("Entered text and Expected text is same");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Organisation",2,4,"Pass",IConstantUtility.VITIGEREXCELFILEPATH);
			
			
			
		}
		else
		{
			System.out.println("Expect text and Expected text is not same");
			excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
			excelFile.writeDataToExcel("Organisation",2,4,"Fail",IConstantUtility.VITIGEREXCELFILEPATH);
			
			
		}
		
		webUtility.actionClassCall();
		WebElement adminstationIcon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		webUtility.mousehoverAction(adminstationIcon);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		excelFile.closeWorkBook();
		webUtility.browserQuit();
		
		
	}
	

}
