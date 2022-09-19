package generic_utility_sevamandir_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	public FileInputStream fis;
	public Workbook wb;
	public Sheet sheet;
	
	public void fetchingExcel(String filePath) {
		try {
		fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void gettingDataFromExcel(String sheetName,int row,int cell) {
		sheet = wb.getSheet(sheetName);
		sheet.getRow(row).getCell(cell).getStringCellValue();
	}
	
	
	
}
