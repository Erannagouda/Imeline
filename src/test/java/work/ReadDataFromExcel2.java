package work;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// step1: convert physical file to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

		// step2: open the excel workbook
		// import workbook from org.apache.poi.ss.usermodel
		// The below statement throws encrypted document exception and IO exception
		Workbook wb = WorkbookFactory.create(fis);

		System.out.println(wb.getSheet("sheet1").getRow(3).getCell(0).getNumericCellValue());
		
		String data = wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);

		// step7: close workbook
		wb.close();
	}
}
