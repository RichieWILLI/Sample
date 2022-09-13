package org.vtiger.Organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteOrganisationTest {

	public static void main(String[] args) throws IOException {
		
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
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		
		
		
		
		//organization
		
		
		int randomNumber =javaUtil.getRandomMethod();
		excelFile.loadExcelFile(IConstantUtility.VITIGEREXCELFILEPATH);
		String actualData =excelFile.getExcelData("Organisation",6,1)+randomNumber;
		
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(actualData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(longTimeout));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='small']"))));
		
		driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		
		String[] pageOfNum = driver.findElement(By.xpath("//span[@name='Accounts_listViewCountContainerName']")).getText().split(" ");
		
	
		String pageNum = pageOfNum[pageOfNum.length-1];
		
		driver.findElement(By.xpath("//input[@name='pagenum']")).clear();
		
		driver.findElement(By.xpath("//input[@name='pagenum']")).sendKeys(pageNum,Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/status.gif']"))));
		
		
		webUtility.implicitWaitMethodCall(longTimeout);
		
		
		List<WebElement> allOrganisationName = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
		
		for(int i=0;i<=allOrganisationName.size();i++) {
			
			
			String values = allOrganisationName.get(i).getText();
			if(values.equals(actualData)) {
				driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(i+2)+"]/td[1]")).click();
				break;
				
			}
			
			
		}
		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		driver.switchTo().alert().accept();

List<WebElement> allOrganisationName2 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
		
		int count2=0;
		for(int i=0;i<=allOrganisationName2.size();i++) {
			
			
			String values = allOrganisationName2.get(i).getText();
			if(values.equals(actualData)) {
				
				count2++;
				
				break;
				
			}
			
			
		}
		
		

		
		webUtility.actionClassCall();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))));
		WebElement resourse = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));

		webUtility.mousehoverAction(resourse);

		driver.findElement(By.xpath("//a[.='Sign Out']")).click();

		webUtility.browserQuit();

	}
	

}
