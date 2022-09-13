package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.tyss.generic.ExcelFileUtility;
import org.tyss.generic.IConstantUtility;
import org.tyss.generic.JavaUtility;
import org.tyss.generic.JdbcConnection;
import org.tyss.generic.PropertyFileUtility;
import org.tyss.generic.WebDriverUtility;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraValidateProjectSecondScenarioTest {
	

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

		

		

		
		
		
		
		
		
		
		
		
		
		
		
		int randomNumber =javaUtil.getRandomMethod();
		
		String expectedProject = "RICHI";
		/*Driver dbdrive=new Driver();
		DriverManager.registerDriver(dbdrive);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		Statement statements = connection.createStatement();*/
		jdbc.gettingDataFromDataBase("jdbc:mysql://localhost:3306/projects","root","root");
		int result = jdbc.writeQueryIntoJdbc("insert into project values('TY_PROJ_0"+randomNumber+"','MOHAN','23/06/2022','"+expectedProject+"','CREATED',0);");
		
		if(result==1) {
			System.out.println("the data is entered");
		}
		else
		{
			System.out.println("the data is not entered");
		}
		
		
		//statements.executeUpdate("insert into project values('TY_PROJ_0"+randomNumber+"','MOHAN','23/06/2022','"+expectedProject+"','CREATED',0);");
		
		
		webUtility.implicitWaitMethodCall(longTimeout);
		webUtility.getUrlMethod(url);
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(usn);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(psd);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		List<WebElement> projectName = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement project : projectName) {
			String acutalProject = project.getText();
			if(acutalProject.equals(expectedProject))
			{
				System.out.println("project is present in the list of the project page");
				System.out.println("Actual projectName==>"+acutalProject);
				break;
			}
			
		}
		webUtility.browserQuit();
		
	}

}
