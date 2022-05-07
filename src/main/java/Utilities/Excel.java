package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getData(int row,int cell,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\HANUMAN SHINDE\\eclipse-workspace\\ZerodhaAutomation\\src\\test\\resources\\Test Data.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
}
}