package org.hms.practise;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseAllTypeCalender {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String expectedDate = "21/10/1994";
		String[] splitedDate = expectedDate.split("/");
		String dateSplited = splitedDate[0];
		String monthSplited = splitedDate[1];
		String yearSplited = splitedDate[2];
		
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//table[@id='datepickers']/tbody/tr/td/input[@id='first_date_picker']")).click();
		String month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ")[0];
		String year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ")[1];
		
		int convertedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(month).get(ChronoField.MONTH_OF_YEAR);
		int convertedYear = Integer.parseInt(year);
		int convertedExpDate = Integer.parseInt(dateSplited);
		int convertedExpMonth = Integer.parseInt(monthSplited);
		int convertedExpYear= Integer.parseInt(yearSplited);

		
		while(!(convertedExpMonth==convertedMonth && convertedExpYear==convertedYear)) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ")[0];
			year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ")[1];
			convertedMonth = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(month).get(ChronoField.MONTH_OF_YEAR);
			convertedYear = Integer.parseInt(year);
		}
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[.='"+convertedExpDate+"']")).click();
		
		
		
		
		
		
		
		
	}

}
