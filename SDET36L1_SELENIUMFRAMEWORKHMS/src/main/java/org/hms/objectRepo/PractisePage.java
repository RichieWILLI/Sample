package org.hms.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractisePage {
	
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	private WebElement dateEntery;
	
	@FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")
	private WebElement monthYearText;
	
	public PractisePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void clickondateTextField() {
		dateEntery.click();
	}
	
	public String[] getMonthYear() {
		String[] monthAndYear = monthYearText.getText().split(" ");
		return monthAndYear;
	}
	
	
}
