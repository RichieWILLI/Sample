package org.vtiger.Practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateFormat {

	public static void main(String[] args) throws ParseException {

		Date date=new Date();
		String d="21/10/2022";
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String convertedDate = dateFormat.format(d);
		System.out.println(convertedDate);
		
		
		String s="23/05/1997";
		SimpleDateFormat dd=new SimpleDateFormat("dd/MM/yyyy");
		Date temp = dd.parse(s);
		
		SimpleDateFormat ddd=new SimpleDateFormat("yyyy/MM/dd");
		String h = ddd.format(temp);
		System.out.println(h);
		
				
		
	}

}
