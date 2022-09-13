package org.vtiger.Practise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class FetchingDataFromCSVtest {

	public static void main(String[] args) throws IOException, CsvException {
		
		
		
		CSVReader reader=new CSVReader(new FileReader("./src/test/resources/commasepratedvalue.csv"));
		
		List<String[]> allData = reader.readAll();
		
		String[] rowData = allData.get(0);
		
		String dataInAry = rowData[2];
		
		System.out.println(dataInAry);
		
	}

}
