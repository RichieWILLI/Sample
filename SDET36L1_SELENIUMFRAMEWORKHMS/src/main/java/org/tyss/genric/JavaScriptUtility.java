package org.tyss.genric;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is used to access the javaScript actions
 * @author Richard William
 *
 */
public class JavaScriptUtility {
	private JavascriptExecutor javaScriptExe;
	
	public void typeCastToJavaScript(WebDriver driver) {
		
		javaScriptExe=(JavascriptExecutor)driver;
		
	}
	
	public void scrolltilldown() {
		javaScriptExe.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	

}
