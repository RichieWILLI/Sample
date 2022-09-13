package org.vtiger.Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraValidateTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8084/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("naveen");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("mohan");
		WebElement projectStausDropDown = driver.findElement(By.xpath("//label[.='Project Status ']/following-sibling::select"));
		Select select=new Select(projectStausDropDown);
		select.selectByVisibleText("On Goging");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	
		List<WebElement> projectName = driver.findElements(By.xpath("//tr/td[2]"));
		int count=0;
		for (WebElement allProjectdetails: projectName) {
			
			
		}
		
		
		
	}

}
