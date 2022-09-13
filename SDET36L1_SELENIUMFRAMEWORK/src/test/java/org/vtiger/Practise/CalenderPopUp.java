package org.vtiger.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUp {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@name='policynumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				Select s=new Select(year);
				Thread.sleep(2000);
		s.selectByValue("7");
		WebElement yy = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Thread.sleep(2000);
		Select s1=new Select(yy);
		s1.selectByValue("1994");
		
		driver.findElement(By.xpath("//a[.='21']")).click();
		driver.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
		
		
		
	}

}
