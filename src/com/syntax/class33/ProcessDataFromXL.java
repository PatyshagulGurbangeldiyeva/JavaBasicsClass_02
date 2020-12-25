package com.syntax.class33;

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

public class ProcessDataFromXL {

	public static void main(String[] args) throws IOException {
		
		// access test file excel
		
		String filePath= System.getProperty("user.dir")+ "/testdata/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book= new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet2");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int colums=sheet.getRow(0).getPhysicalNumberOfCells();
		
		List <Map<String, String>> aMap=new ArrayList<>();
		
		for (int r=1; r<rows; r++) {
			Map<String, String>map=new LinkedHashMap<>(); // creating a map
			aMap.add(map); // storing a map 
			for (int col=0; col<colums; col++) {
				String key=sheet.getRow(0).getCell(col).toString();
				String value=sheet.getRow(r).getCell(col).toString();
				map.put(key, value);
			}
			aMap.add(map);
		
		}
		System.out.println(aMap);
	
		System.out.println();
		
		for (Map<String, String> m:aMap) { // getting all the maps separately from the list
			System.out.println(m);
		}

	}

}
