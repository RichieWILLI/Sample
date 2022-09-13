package org.vtiger.documents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import org.vitiger.objectReposatary.CommonPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDocumentTest extends BassClass{
	
	@Test()

	public void createDocumentTest() throws IOException {
		
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
//
//		webUtility.getUrlMethod(url);
//		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		
		//pomObject creation
		CommonPage compg=new CommonPage(driver);
		
		//document
		
	//	int randomNumber =javaUtil.getRandomMethod();
	//	excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String title =excelFile.getExcelData("Document",2,1)+randomNumber;
		
		compg.documentClick();
		//driver.findElement(By.xpath("//a[.='Documents']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='notes_title']")).sendKeys(title);
		
	WebElement childFrame = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(childFrame);
	
	String description = excelFile.getExcelData("Document",2,2);
	driver.findElement(By.xpath("//body[@class='cke_show_borders']")).sendKeys(description+Keys.CONTROL+"acvabiu");
	
	driver.switchTo().parentFrame();
	
	//driver.get("C:\\Users\\Richard William\\Desktop\\datafile\\commondata.property");
	
		 File f=new File("./src/test/resources/commondata.properties");
		String abopath = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@id='filename_I__']")).sendKeys(abopath);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		String enteredTitle = driver.findElement(By.xpath("//span[@id='dtlview_Title']")).getText();
		String enteredDescription = driver.findElement(By.xpath("//p")).getText();
		//String fileUploaded=driver.findElement(By.xpath("//a[.='"+abopath+"']")).getText();
		
//		if(enteredTitle.equals(title)&& enteredDescription.equals(description)&& fileUploaded.equals(abopath)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		
		
		
		
		
		webUtility.actionClassCall();
		WebElement resourse = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		webUtility.mousehoverAction(resourse);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		//driver.close();

		

	}

}
