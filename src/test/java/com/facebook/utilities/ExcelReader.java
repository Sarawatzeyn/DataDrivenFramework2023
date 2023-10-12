package com.facebook.utilities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	/*
	 * name of the workbook==registration
	 * sheet name=sheet1, sheet2..
	row==start from 0
	column ==start from 0
	cell==intersection of row and column
	Faruq=registration.xlsx->sheet1->row1->column0==Stringcell
	
	*Index rule is- starts from 0
	*row starts from 0
	*column starts from 0
	*row always comes first
	*
	*
	*/
	
	public String filePath;
	public String sheetName;
	
	public ExcelReader(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	
	
	
public  String getStringCellValue(int rowNum,int columnNum) {
	String celldata =null;//flag
	try {
		FileInputStream fis= new FileInputStream(filePath);
		Workbook registrationBook = new XSSFWorkbook(fis);
		Sheet sheet=registrationBook.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell column=row.getCell(columnNum);
		celldata= column.getStringCellValue();
		System.out.println(celldata);
		registrationBook.close();
		fis.close();
	}
catch (Exception e)	{
	e.printStackTrace();
}
return celldata;

}


public  double getNumericCellValue(int rowNum,int columnNum) {
double celldata =0.0;//flag
try {
	FileInputStream fis= new FileInputStream(filePath);
	Workbook registrationBook = new XSSFWorkbook(fis);
	Sheet sheet=registrationBook.getSheet(sheetName);
	Row row=sheet.getRow(rowNum);
	Cell column=row.getCell(columnNum);
	 celldata=column.getNumericCellValue();
 System.out.println(celldata);
 registrationBook.close();
 fis.close();

} catch (IOException e) {
	
	e.printStackTrace();
}

return celldata;
}



	

	public static void main(String[] args) {
		String file="src/test/resources/resources/registration.xlsx";
		
		ExcelReader er = new ExcelReader(file,"Sheet1");
		
		er.getStringCellValue(0, 0);
		er.getStringCellValue(0, 2);
		er.getStringCellValue(0, 3);
		er.getStringCellValue(1, 1);
		er.getStringCellValue(1, 2);
		er.getStringCellValue(1, 3);
		ExcelReader er1 = new ExcelReader(file,"Sheet3");
		er1.getNumericCellValue(1, 0);
		er1.getNumericCellValue(1, 1);
	}

}
