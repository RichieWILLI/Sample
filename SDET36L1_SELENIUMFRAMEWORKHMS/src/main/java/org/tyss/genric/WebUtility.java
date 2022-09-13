package org.tyss.genric;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is used to create the web element using method
 * @author Richard William
 *
 */
public class WebUtility {
	
	private Select select;
	
	private WebDriver driver;
	
	/**
	 * this method is used to select the particular browser
	 * @param browser
	 * @return
	 */
	
	public WebDriver selectBrowser(String browser) {
		
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
			}
		
		else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 }
		else if (browser.equals("microsoft")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		else {
			System.out.println("The select browser is incorrect");
		}
		
		return driver;
		
	}
	
	/**
	 * this method is used to mazimize the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		
	}
	
	/**
	 * this method is used to minimize the browser
	 */
	public void minimizeBrowser() {
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to make selenium to wait implicitly
	 */
	
	public void implicitlyWaitMethod(long timeouts) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
		
	}
	/**
	 * this method is used to get url
	 * @param url
	 */

	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void selectClass(WebElement element,String value) {
		select=new Select(element);
		select.selectByValue(value);
				
	}
	
	public void selectByVisibleTextMethod(WebElement element,String visibleText) {
		select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public void alertPopAccept() {
		driver.switchTo().alert().accept();
	}
	
}
