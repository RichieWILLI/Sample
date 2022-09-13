package org.vtiger.Practise;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteDataBySelectingPageTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		
		//load the external file using properties class
		
		Properties p= new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String usn = p.getProperty("username").trim();
		String psd = p.getProperty("password");
		String browser = p.getProperty("browser");
		String timeouts = p.getProperty("timeout");
		
		long longTimeout=Long.parseLong(timeouts);
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("the browser name may be incorrect");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		
		
		
		
		//organization
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(longTimeout));
		
		Random ran=new Random();
		int randomNumber = ran.nextInt();
		String actualData = "testy"+randomNumber;
		
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(actualData);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='small']"))));
		
		driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		
		String[] pageOfNum = driver.findElement(By.xpath("//span[@name='Accounts_listViewCountContainerName']")).getText().split(" ");
		
	
		String pageNum = pageOfNum[pageOfNum.length-1];
		
		driver.findElement(By.xpath("//input[@name='pagenum']")).clear();
		
		driver.findElement(By.xpath("//input[@name='pagenum']")).sendKeys(pageNum,Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//img[@src='themes/softed/images/status.gif']"))));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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

		
		

		

	}

}
