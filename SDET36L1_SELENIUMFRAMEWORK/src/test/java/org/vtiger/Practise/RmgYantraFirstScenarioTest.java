package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.JdbcConnection;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraFirstScenarioTest {

	public static void main(String[] args) throws SQLException {
		PropertyFileUtility prop=new PropertyFileUtility();
		ExcelFileUtility excelFile=new ExcelFileUtility();
		JavaUtility javaUtil=new JavaUtility();
		WebDriverUtility webUtility=new WebDriverUtility();
		JdbcConnection jdbc=new JdbcConnection();

		prop.loadPropertyFile(IConstantUtility.RMGYANTRAFILEPATHCOMMONDATA);

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



		
		int randomNumber = javaUtil.getRandomMethod();
		String projectName = "Sdet36_"+randomNumber;
		System.out.println("project Name is "+projectName);
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(psd);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projectName);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("mohan");
		WebElement projectDetails = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
		Select s=new Select(projectDetails);
		s.selectByVisibleText("On Goging");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

		
		
		jdbc.gettingDataFromDataBase("jdbc:mysql://localhost:3306/projects","root","root");
		ResultSet result = jdbc.exequteQuery("select * from project");
		
		
		
		/*Driver dbDriver=new Driver();
		DriverManager.registerDriver(dbDriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		Statement statement = connection.createStatement();
		ResultSet result= statement.executeQuery("select * from project");*/
		
		while(result.next())
		{

			if(result.getString("project_name").equals(projectName))
			{
				System.out.println("the data is entered into database");
				System.out.println("actual project name is"+result.getString("project_name"));
			}

		}

		webUtility.browserQuit();


	}

}
