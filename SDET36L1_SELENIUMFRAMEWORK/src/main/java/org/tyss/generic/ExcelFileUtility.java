package org.tyss.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is used to use the data from excel which is used to store the test data
 * @author Richard William
 *
 */

public class ExcelFileUtility {
	
	private Workbook workBook;
	private FileInputStream filex;
	FileOutputStream fos;
	
	/**
	 * This method is to load the external excel file and convert to java readable object
	 * @param pathExcel
	 */
	
	
	
	public void loadExcelFile(String pathExcel) {
		
	
	try {
		filex = new FileInputStream(pathExcel);
		workBook = WorkbookFactory.create(filex);
	}
			catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	DataFormatter dataformat=new DataFormatter();
	
	/**
	 * This method is used to get the data from excel file
	 * @param nameOfSheet
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String getExcelData(String nameOfSheet,int rowNum,int cellNum) {
		
		
	String data = dataformat.formatCellValue(workBook.getSheet(nameOfSheet).getRow(rowNum).getCell(cellNum));
	try {
		workBook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
	}
	
	/**
	 * This method is used to write the data into excel
	 * @param nameOfSheet
	 * @param rowNum
	 * @param cellNum
	 * @param dataToEnter
	 * @param pathToSave
	 */
	
	public void writeDataToExcel(String nameOfSheet,int rowNum,int cellNum,String dataToEnter,String pathToSave) {
		workBook.getSheet(nameOfSheet).getRow(rowNum).createCell(cellNum).setCellValue(dataToEnter);
		try {
			fos=new FileOutputStream(pathToSave);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		}
		
	public void closeWorkBook() {
		
		try {
			workBook.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			workBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}

	
	
	}







