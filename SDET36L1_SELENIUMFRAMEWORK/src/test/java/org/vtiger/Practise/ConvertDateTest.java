package org.vtiger.Practise;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class ConvertDateTest {

	public static void main(String[] args) {

		String s = "21/10/1994";
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(s,dft);
		System.out.println(date);
		Month month = date.getMonth();
		System.out.println(month);//october
		
		IsoChronology chro = date.getChronology();
		System.out.println(chro);//iso
		
		int da = date.getDayOfYear();
		System.out.println(da);
		
		
		
		
		
		
		
	}

}
