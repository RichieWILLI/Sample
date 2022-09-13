package org.hms.practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindTheAllBrokenLink {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		
		List<String> list=new ArrayList<>();
		
		for (WebElement links : allLinks) {
			String gettingAllLinks = links.getAttribute("href");
			//System.out.println(gettingAllLinks);
			list.add(gettingAllLinks);
			list.remove(null);	
		}
		
		for(String allList:list) {
			URL url=new URL(allList);
		HttpURLConnection connect = (HttpURLConnection)url.openConnection();
		int sourceCode = connect.getResponseCode();
		if(sourceCode!=200) {
			System.out.println(url+"  "+connect.getResponseMessage()+"  "+sourceCode+"   ");
		}
			
			
		}
		
		
		
	}

}
