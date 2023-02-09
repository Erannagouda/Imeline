package work;

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

		//step1: convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		
		//step2: open the excel workbook
		//import workbook from org.apache.poi.ss.usermodel
		//The below statement throws encrypted document exception and IO exception
		Workbook wb=WorkbookFactory.create(fis);
		
		//step3: get control over particular sheet
		Sheet s= wb.getSheet("sheet1");
		
		//step4: get control over specific row
		Row r=s.getRow(0);
		
		//step5: get control over specific cell
		Cell c=r.getCell(1);
		
		//step6: fetch data from cell
		System.out.println(c.getStringCellValue());
		
		//step7: close workbook
		wb.close();	
	}
}
