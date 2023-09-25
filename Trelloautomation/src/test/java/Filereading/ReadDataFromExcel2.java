package Filereading;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel2 {
	public static void main(String[] args) throws Throwable {
		CellType celltype;
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./src/test/resources/mydata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("data");
		int column_count = sheet.getRow(0).getPhysicalNumberOfCells();
//		 System.out.println(column_count);
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
//		System.out.println(firstRowIndex);
//		System.out.println(lastRowIndex);
		for (int i = 0; i < column_count; i++) {

			for (int j = firstRowIndex + 1; j < lastRowIndex; j++) {
				Cell c = sheet.getRow(j).getCell(i);
				if (c != null) {

					if (i == 1) {
//					
						expectedMonthList.add(sheet.getRow(j).getCell(i).getStringCellValue());
					}

					else if (i == 0) {
//						
						expectedDayList.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));
					} else if (i == 2) {
//					
						expectedYearList.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));

					}

				}
			}
		}
		/*
		 	// create fileInputStream Obj
		FileInputStream fis = new FileInputStream("./src/test/resources/facebookdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("doblist");
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			int firstCellIndex = (int) sheet.getRow(i).getFirstCellNum();
			int lastIncrimentalIndex = (int) sheet.getRow(i).getLastCellNum();
			for (int j = firstCellIndex + 1; j < lastIncrimentalIndex; j++) {
				if (String.valueOf(sheet.getRow(i).getCell(j).getCellType()).equals("STRING")) {
					expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
				} else if (String.valueOf(sheet.getRow(i).getCell(j).getCellType()).equals("NUMERIC")) {
					if (lastIncrimentalIndex == 32) {
						expectedDayList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					} else if (lastIncrimentalIndex == 120) {
						expectedYearList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					}
				}
			}
		}*/
		workBook.close();

		System.out.println(expectedDayList);
		System.out.println(expectedMonthList);
		System.out.println(expectedYearList);

	}
}
