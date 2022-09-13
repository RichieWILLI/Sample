package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Random ran=new Random();
		int randomNumber = ran.nextInt(100);
		DataFormatter dataFormat=new DataFormatter();
		
		
		
		
		//convert the physical file to java readable object
		FileInputStream fisExcel=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		String data = wb.getSheet("Contacts").getRow(2).getCell(1).getStringCellValue()+randomNumber;
		
	String numData =dataFormat.formatCellValue(wb.getSheet("Contacts").getRow(5).getCell(1));
	

		
		wb.close();
		System.out.println(data);
		System.out.println(numData);
		
		
		

	}

}
