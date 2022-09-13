package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateContactTestPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileLib fib=new FileLib();
		String url = fib.getDataFromPrpertyFile("url");
		String usn = fib.getDataFromPrpertyFile("username");
		String psw = fib.getDataFromPrpertyFile("password");
		
		driver.navigate().to(url);
		driver.findElement(By.name("user_name")).sendKeys(usn);
		driver.findElement(By.name("user_password")).sendKeys(psw);

		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		driver.findElement(By.name("lastname")).sendKeys("Richi");
		driver.findElement(By.name("button")).click();
		String actual = driver.findElement(By.id("dtlview_Last Name")).getText();
		String excepted="Richi";
		if(actual.equals(excepted))
		{
			System.out.println("The actual and excepted values are same");
		}
		else {
			System.out.println("the actual and expected values are not same");
		}
		
		Actions a=new Actions(driver);
		WebElement resourse = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		a.moveToElement(resourse).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();


	}

}
