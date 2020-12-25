package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/vepagurbangeldiyev/Desktop/Test.xlsx"; // copy the location where your file is located
														// this part we adding ourself adding the name of the file and extension
		
		FileInputStream fis=new FileInputStream(filePath); // put the path into fis
		
		Workbook wbook=new XSSFWorkbook(fis);// as we work with excel we are creating excel obj and pas the fis in it
		
		Sheet sheet=wbook.getSheet("Sheet1");// we can access our file by name or sheetName/ or index
		// sheet name will be more perfect as there are many sheets
		// import ss sheet!!
		
		Row row1=sheet.getRow(0); // here we use index of the sheet. as index starts with zero and our sheet is the firs sheet so, we used index 0
		
		Cell cell=row1.getCell(1); // accessing to cell (index 1 it means "B" cell)
		
		String r1cell2=cell.toString(); //getting values from cell ( we need to specify the row too) and convert to the string!!!!
		
		System.out.println(r1cell2);// retreiving lastname
		
		// lets retreive New York (long way)
		
		Row row3=sheet.getRow(2);
		
		Cell  r3cell3=row3.getCell(2);
		
		System.out.println(r3cell3);
		
		
		// access VA (sort way)
		
		String cellValue= sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		
		// access the zip of John's zip
		
	double	cellValue1=sheet.getRow(1).getCell(4).getNumericCellValue();
	System.out.println(cellValue1);
	System.out.println((int)cellValue1);// converting to int 
	
	System.out.println();
	// how to get 20151 in a String format 
		
		String valC=sheet.getRow(1).getCell(4).toString();
		String[] arr=valC.split("\\.");
		System.out.println(arr[0]);
		

	}

}
