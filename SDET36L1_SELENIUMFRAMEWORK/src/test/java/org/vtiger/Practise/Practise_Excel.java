package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practise_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream=new FileInputStream("./src/test/resources/Excel.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheetName = workBook.getSheet("excel");
		int row = sheetName.getLastRowNum();
		
		for(int i=1;i<=row;i++) {
			Row rowNum = sheetName.getRow(i);
			String name = rowNum.getCell(1).getStringCellValue();
			String name2 = rowNum.getCell(2).getStringCellValue();
			System.out.println(name+"  "+name2);
			
			
		}
		
	}

}
