package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
		
		//2. we need to havem fileInputStream
		FileInputStream fis= new FileInputStream(filePath);
		
		
		// 3. build the obj of workbook--> from its child class XSSFWorkbook
		Workbook book=new XSSFWorkbook(fis);
		
		
		//4. if you want to write in a new Sheet---> you need to create a new Sheet
		//								existing Sheet---> we need to get the sheet
		
		// so we will write into existing sheet
		Sheet sheet3=book.getSheet("Sheet3");
		
		// we need to get number of rows
		int rows=sheet3.getPhysicalNumberOfRows();
		
		// we need to get colums		
		int colums=sheet3.getRow(0).getLastCellNum();
		
		// creating empty collection, as we are going to add our maps that are in excel
		// every row is individual map
		List <Map<String,String>> listMap=new ArrayList<>();
		
		for (int r=1; r<rows; r++) { // every new raw will give as a map--->r=1 coz r=0 it is our key and it is stable. so we started from 1
			Map<String, String> map=new LinkedHashMap<>();
			for (int c=0; c<colums; c++) {// iterating over the colums
				String key=sheet3.getRow(0).getCell(c).toString();// here we are getting our keys that in row 0
				String value=sheet3.getRow(r).getCell(c).toString();// here we are getting our values
				map.put(key, value);// after we declared keys and values we are adding them into the Map
				
			}
			listMap.add(map);// here we adding our map to list --> that was empty
		}
		System.out.println(listMap);

	}

}
