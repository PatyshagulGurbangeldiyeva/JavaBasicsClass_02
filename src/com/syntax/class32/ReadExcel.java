package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
String filPath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/testdata/Test.xlsx";

FileInputStream fis=new FileInputStream(filPath);

// get an Object of Workbook type

Workbook book=new XSSFWorkbook(fis);

Sheet sheet=book.getSheet("Sheet1");

// need to find numbers or rows

int rows=sheet.getPhysicalNumberOfRows();

System.out.println();

//find number of colums

int cols=sheet.getRow(0).getLastCellNum();

for (int r=0; r<rows;r++) { // iterates over the rows
	for (int c=0; c<cols;c++) {// iterates over the cols
		String cell=sheet.getRow(r).getCell(c).toString();// row:1/ col:0,1,2,3,4
		System.out.print(cell+" "); // this will be printed then it will go back to raws
	}								 
	System.out.println();
}

	}

}
