package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	public static void main(String[] args) throws IOException {
	
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/testdata/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		XSSFWorkbook book=new XSSFWorkbook (fis);
		
		Sheet sheet=book.getSheet("Sheet2");
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		int colums=sheet.getRow(0).getLastCellNum();
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<colums;c++) {
				String cells=sheet.getRow(r).getCell(c).toString();
				System.out.print(cells+"   ");
			}
			System.out.println();
		}
		

	}

}
