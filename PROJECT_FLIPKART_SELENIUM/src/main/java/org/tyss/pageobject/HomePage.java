package org.tyss.pageobject;

import java.awt.RenderingHints.Key;

import javax.naming.ldap.Control;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Enter;

public class HomePage {
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchBox;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterText() {
		searchBox.sendKeys("winter heater");
		searchBox.sendKeys(Keys.ENTER);
	}
	

}
