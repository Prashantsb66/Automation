package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filelib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream  fis=new FileInputStream("./src/test/resources/actitimedata.properties");
		Properties  p =new Properties(); 
		p.load(fis);
		String data=p.getProperty(key);
		return data;
		
	}
		public String getExcelData(String shtnam,int row,int column) throws EncryptedDocumentException, IOException
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream( "./src/test/resources/testdata.xlsx"));
			String data = wb.getSheet(shtnam).getRow(row).getCell(column).getStringCellValue();
			return data;
			
		}
		
	
	
	
}

