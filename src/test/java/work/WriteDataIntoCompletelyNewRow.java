package work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoCompletelyNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		
		Row r=sh.createRow(4);
		
		//creates new cell by deleting older data in the cell
		Cell c=r.createCell(0);
		//write data into the cell
		c.setCellValue("bye");
		//saves data into excel
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
