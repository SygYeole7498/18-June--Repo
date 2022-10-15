package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\SUYOG YEOLE\\OneDrive\\Desktop\\18 June.xlsx");

		// double data =
		// WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();

		int rowCount = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum(); // count-1

		Cell c = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);

		for (int i = 0; i <= rowCount; i++) {

			int cellCount = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getLastCellNum();

			for (int j = 0; j <= cellCount - 1; j++) {

				if (c.getCellType().equals(CellType.BOOLEAN)) {
					System.out.println(c.getBooleanCellValue());
				} else if (c.getCellType().equals(CellType.NUMERIC)) {
					System.out.println(c.getNumericCellValue());
				} else {
					System.out.println(c.getStringCellValue());
				}
			}

		}
	//	System.out.println(data);
	}
}
