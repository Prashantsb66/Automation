package Filereading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//Create the FileInputStream Obj of java with the  path of the address.
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
	//Call the create() from WorkBookFactory Class of POI Library
	Workbook workbook = WorkbookFactory.create(fis);
	
	//call the getSheet() by specifying the sheetName
	Sheet sheet = workbook.getSheet("mydata");
	//call the getRow() by specifying the row index value
	Row row = sheet.getRow(0);
	//call the getCell() by specifying the cell index
	Cell cell = row.getCell(1);
	//based on the type of data call the appropriate method
//	 long numericValue =(long)cell.getNumericCellValue();
//	System.out.println(numericValue);
	long cellValue =(long) cell.getNumericCellValue();
	System.out.println( cellValue);
	workbook.close();
}
}
