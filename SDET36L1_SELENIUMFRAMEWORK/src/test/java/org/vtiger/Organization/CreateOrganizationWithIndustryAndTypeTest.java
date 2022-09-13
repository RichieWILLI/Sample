package org.vtiger.Organization;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithIndustryAndTypeTest {

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
		String actualData =excelFile.getExcelData("Organisation",4,2) +randomNumber;
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(actualData);
		WebElement dropDownOfIndustry = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(dropDownOfIndustry);
		s.selectByIndex(8);
		WebElement dropDownofType = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select s1=new Select(dropDownofType);
		s1.selectByIndex(7);
		driver.findElement(By.xpath("//input[@value='T']")).click();
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		String dataEntered = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		String expectedData = actualData;
		if(actualData.equals(expectedData))
		{
			System.out.println("entered data is corect");
		}
		else
		{
			System.out.println("entered data is wrong");
		}
		String enteredIndustry = driver.findElement(By.xpath("//span[@id='dtlview_Industry']")).getText();
		if(enteredIndustry.equals("Education"))
		{
			System.out.println("data entered in industry is matching");
		}
		else {
			System.out.println("data entered in industry is not macthing");
		}
		String enteredType = driver.findElement(By.xpath("//span[@id='dtlview_Type']")).getText();
		if(enteredType.equals("Press"))
		{
			System.out.println("data entered in Type is matching");
		}
		else {
			System.out.println("data entered in type is not macthing");
		}
		webUtility.actionClassCall();
		WebElement adminstationIcon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		webUtility.mousehoverAction(adminstationIcon);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		webUtility.browserQuit();
		
	
	}

}
