package org.vtiger.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends BrowserBaseClass{
	
	@Test
	public void launchTest() throws InterruptedException {
		
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
