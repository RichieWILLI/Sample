package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EnterDataIntoExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream filExcel=new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook workBook = WorkbookFactory.create(filExcel);
		Sheet sheetName = workBook.getSheet("Contacts");
		//sheetName.getRow(2).getCell(2).setCellValue("sivasubramanian");
		
		
		sheetName.getRow(2).createCell(2).setCellValue("SivaSubramanian");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
		workBook.write(fos);
		workBook.close();
		
		
		
		

	}

}
