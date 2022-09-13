package org.vtiger.Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelDataIttarationTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fisExcel=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sheetName = wb.getSheet("Contacts");
		String data = sheetName.getRow(4).getCell(1).getStringCellValue();
		//System.out.println(data);
		
		//using ittaration
		DataFormatter datform=new DataFormatter();
		
		
		for(int i=0;i<=sheetName.getLastRowNum();i++) {
			//System.out.println(sheetName.getRow(i).getCell(1));
			
			//now printing the value after the organization name
		 String currentValue = datform.formatCellValue(sheetName.getRow(i).getCell(1));
		
		if(currentValue.equals("OrganisationName")) {
			System.out.println(sheetName.getRow(i+1).getCell(1));
			break;
			
		}
		
		
		
	
		}
		
		

	}

}
