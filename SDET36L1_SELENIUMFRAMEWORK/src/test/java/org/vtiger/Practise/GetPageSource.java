package org.vtiger.Practise;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		String htmlcode = driver.getPageSource();
		
		//System.out.println(htmlcode);
		
		//Runtime.getRuntime().exec("notepad");
		
		String address = driver.getWindowHandle();
		System.out.println(address);
	
		
		
		
		
		

	}

}
