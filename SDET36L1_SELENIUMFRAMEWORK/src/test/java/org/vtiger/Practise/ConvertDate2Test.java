package org.vtiger.Practise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class ConvertDate2Test {

	public static void main(String[] args) {
		
//		String s = "DECEMBER";
//		String s1 = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
//		System.out.println(s1);
//		
//		int d = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(s1).get(ChronoField.MONTH_OF_YEAR);
//		System.out.println(d);
		
		String s = "JULY";
		String s1 = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("MMMM");
		TemporalAccessor date = dft.withLocale(Locale.ENGLISH).parse(s1);
		int monthValue = date.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(monthValue);
		
	}

}
