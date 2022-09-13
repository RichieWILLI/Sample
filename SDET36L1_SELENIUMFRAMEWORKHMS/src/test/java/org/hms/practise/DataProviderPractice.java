package org.hms.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPractice {
	
	public FileInputStream fis;

	@Test(dataProvider = "excel")
	public void dataProviderPractice(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		

		driver.close();
		
	}

	
	@DataProvider(name = "login", parallel = true)
	
	public String[][] loginUsnPsd() {
		
		String ary[][]=new String[3][2];
		ary[0][0]="admin1";
		ary[0][1]="admin1";
		
		ary[1][0]="admin2";
		ary[1][1]="admin2";
		
		ary[2][0]="admin";
		ary[2][1]="admin";
		
		
		return ary;
		
	}
	
	@DataProvider(name = "excel")
	public void loginUsnPsdThroughExcel() {
		Workbook workbk=null;
		
		try {
			FileInputStream fis=new FileInputStream("./src/test/resources/dataProvider.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			workbk = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workbk.getSheet("Sheet");
		
		
		
	}
}
