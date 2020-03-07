package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static Workbook wbook;
	private static Sheet sheet;
	
	/**
	 * This method will open excel file and specified sheet
	 * @param filePath
	 * @param sheetName
	 */
	public static void openExcel(String filePath, String sheetName) {
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			wbook=new XSSFWorkbook(fis);
			sheet=wbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int rowCount() {
		int rowCount=sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	
	public static int colsCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public static String getCellData(int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}
	
	/**
	 * This method will read any Excel file and return data in 2D array
	 * @param filePath
	 * @param sheetName
	 * @return
	 */
	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		
		openExcel(filePath, sheetName);
		
		Object[][] data=new Object[rowCount()-1][colsCount()];
		
		for (int i=1; i< rowCount(); i++) {
			for (int y=0; y<colsCount(); y++) {
				data[i-1][y]=getCellData(i, y);
			}
		}
		return data;
	}
}