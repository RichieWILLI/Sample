package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchProertyFileTest {

	public static void main(String[] args) throws IOException {
		//converting the physical file into java readable object
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
		


		
	
		
		
		

	}

}
