package org.vtiger.Organization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

public class DeleteOrganisationByOrgnisationListTest {

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
		String actualData =excelFile.getExcelData("Organisation",8,1)+randomNumber;
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(actualData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		
		WebDriverWait wait = webUtility.explicitWaitMethodCall(longTimeout);
		
		WebElement visibleText = driver.findElement(By.xpath("//span[@class='small']"));
		wait.until(ExpectedConditions.visibilityOf(visibleText));
		
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		
		String[] pageOfNum = driver.findElement(By.xpath("//span[@name='Accounts_listViewCountContainerName']")).getText().split(" ");
		
		
		String pageNum = pageOfNum[pageOfNum.length-1];
		
		int page = Integer.parseInt(pageNum);
		
		int count=0;
		for(int j=1;j<=page;j++) {
		List<WebElement> organisationList = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
		for(int i=0;i<organisationList.size();i++) {
			
			String allOrg = organisationList.get(i).getText();
			if(allOrg.equals(actualData)) {
				driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(i+2)+"]/td[1]")).click();
				count++;
				break;
			}
			
		}
		if(count==1) {
			break;
		}
		else {
		driver.findElement(By.xpath("//a[@alt='Next']")).click();
		WebDriverWait wair=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wair.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/status.gif']"))));
		
		}
		}
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
		driver.switchTo().alert().accept();
		
	}

}
