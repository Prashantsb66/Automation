package Filereading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AB {

	public static void main(String[] args) throws Throwable {
		 String h = WorkbookFactory.create(new FileInputStream("./src/test/resources/testdata.xlsx ")).getSheet("mydata").getRow(0).getCell(0).getStringCellValue();
         
          System.out.println(h);
	}
	
}
