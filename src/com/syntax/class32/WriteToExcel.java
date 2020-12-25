package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		// in order to write to excel from java
		// we need to load our file !!!
		
		
		//1. we need to make a path
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
		
		//2. we need to have fileInputStream
		FileInputStream fis= new FileInputStream(filePath);
		
		
		// 3. build the obj of workbook--> from its child class XSSFWorkbook
		Workbook book=new XSSFWorkbook(fis);
		
		
		//4. if you want to write in a new Sheet---> you need to create a new Sheet
		//								existing Sheet---> we need to get the sheet
		
		// so we will write into existing sheet
		Sheet sheet1=book.getSheet("Sheet1");
				
		// before we are writing into a new cell---> we need to create a cell
		//										---> we need to create a row/colum
		
		sheet1.getRow(0).createCell(5).setCellValue("Country"); // here we have row we just created column and added country
		
		
		
		// we want to create a row
		sheet1.createRow(3).createCell(0).setCellValue("Mark");
		
		
		// create a sheet
		Sheet customSheet=book.createSheet("CreatedSheet");
		
		// here we made lots of changes but they are still in java so we need to put it in excel
		// so we use FileOutputStream
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		book.write(fos);

	}

}
