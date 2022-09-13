package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/simple.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int count = sh.getLastRowNum();
		
		for(int i=1;i<count;i++) {
			
			Row row = sh.getRow(i);
			String col1 = row.getCell(0).getStringCellValue();
			String col2 = row.getCell(1).getStringCellValue();
			System.out.println(col1+"     "+col2);
			
		}

	}

}
