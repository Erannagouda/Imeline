package work;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataUsingDataFormatter {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	

	// step1: convert physical file to java readable object
			FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");

			// step2: open the excel workbook
			// import workbook from org.apache.poi.ss.usermodel
			// The below statement throws encrypted document exception and IO exception
			Workbook wb = WorkbookFactory.create(fis);
            DataFormatter df=new DataFormatter();
			System.out.println(df.formatCellValue(wb.getSheet("sheet1").getRow(3).getCell(0)));
			
			// step7: close workbook
			wb.close();

	}
}

