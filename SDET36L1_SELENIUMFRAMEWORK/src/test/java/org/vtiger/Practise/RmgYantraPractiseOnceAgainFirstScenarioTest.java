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

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraPractiseOnceAgainFirstScenarioTest {

	public static void main(String[] args) throws SQLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8084/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random ran=new Random();
		int randomNumber = ran.nextInt(100);
		String actualData = "Richard"+randomNumber;
		String projectManger = "Mohan"+randomNumber;
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(actualData);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys(projectManger);
		WebElement projectStatus = driver.findElement(By.xpath("//select[@name='status']"));
		Select select=new Select(projectStatus);
		select.selectByIndex(0);
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		//check in database
		
	Driver dbDriver=new Driver();
	DriverManager.registerDriver(dbDriver);
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	Statement statement = connection.createStatement();
	ResultSet result = statement.executeQuery("select * from project;");
	
	//validate
	
	/*while(result.next())
	{
		System.out.println(result.getString("project_name"));
		
	}*/
	while(result.next())
	{
		String enteredvalue = result.getString("project_name");
		if(enteredvalue.equals(actualData))
		{
			System.out.println("the data is entered into database sucessfully");
			System.out.println("the project name entered in database is "+actualData);
			
		}
		else {
			System.out.println("the data is not entered into the database ");
			
		}
	}
	
	driver.quit();
	
	
		
	}

}
