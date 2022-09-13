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

public class GettingAllDataFromExcelByItteration {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sheetName = wb.getSheet("password");
		String data = sheetName.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);
		DataFormatter dataFormt=new DataFormatter();
		String ary[][]=new String[6][2];
		
		
		for(int i=0;i<sheetName.getLastRowNum();i++)
		{
			for(int j=0;j<sheetName.getRow(0).getLastCellNum();j++) {
			 String allData = dataFormt.formatCellValue(sheetName.getRow(i).getCell(j));
				ary[i][j]=allData;
				System.out.println(ary[i][0]+" "+ary[0][j]);
			}
		}

	}

}
