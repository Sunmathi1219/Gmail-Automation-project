package priority;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base_Dataprovider {
	

	String get_data(int a,int b,int c)
	{
		File f=new File("C:\\Users\\sunma\\eclipse-workspace\\Test_NG\\excel\\data.xlsx");
	    Workbook book=new XSSFWorkbook();
	    Sheet sheet = book.getSheetAt(a);
    	Row row = sheet.getRow(b);
    	Cell cell = row.getCell(c);
    	String stringCellValue = cell.getStringCellValue();
    	System.out.println(stringCellValue);
		return stringCellValue;
		
	}

}
