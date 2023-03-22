package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// Create the FileInputStream type object and Pass the Resource path of the Excel Sheet as an Argument in the form of String.
		FileInputStream fis = new FileInputStream("./src/test/resources/testcasedataqasa5.xlsx");
		
		// Create a Workbook type object and call the WorkbookFactory.create(FileInputStream fis) Parameterized Method.
		//WorkbookFactory.create(FileInputStream fis) is an Abstract Method of Workbook Interface.
		//It takes FileInputStream Type object as an argument.
		// This Method is used to Open the Excel Workbook internally to access the Data.
		// It will return Workbook type Object.
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Creating a Sheet Type object to access a Particular Sheet.
		//Call the workbook.getSheet(String name); using Workbook type Reference.
		//It Accepts the String type data (i.e) takes the sheet name present in the WorkBook in the form of String.
		// It will return Sheet Type Object.
		Sheet sheet = workbook.getSheet("chocolates");
		
		//Create a Row Type Object to access the Row Values.
		//Call the sheet.getRow(int index); using the Sheet Type Reference.
		//getRow() will accept the index value in the form of int type data.
		//It will return Row type Object.
		//Index Value starts from 0---------->[Row value starts from 1]
		Row row = sheet.getRow(0);
		
		//Create a Cell type Object to access the cell Values.(Column Values)
		//call the getCell(int index); method using Row Type Reference.
		//getCell() will accept the index value in the form of int type data.
		//It will return Cell type Object.
		//Index Value starts from 0---------->[Cell value starts from 1]
		
		Cell cell = row.getCell(0);
		
		// Using the Cell Type as the reference to access the data from the Excel Sheet
		System.out.println(cell.getStringCellValue()); 
		
		// Using the Sheet type as the reference to access the data from the Excel Workbook
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue()); 
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(5).getCell(0).getStringCellValue());
		System.out.println("________________________________________");
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println((long)sheet.getRow(1).getCell(1).getNumericCellValue());
		System.out.println((long)sheet.getRow(2).getCell(1).getNumericCellValue());
		System.out.println((long)sheet.getRow(3).getCell(1).getNumericCellValue());
		System.out.println((long)sheet.getRow(4).getCell(1).getNumericCellValue());
		System.out.println((long)sheet.getRow(5).getCell(1).getNumericCellValue());
	}
}