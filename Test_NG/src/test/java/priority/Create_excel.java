package priority;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Create_excel {
	public static void main(String[] args) throws IOException  
	{
	File file=new File("C:\\Users\\sunma\\eclipse-workspace\\Test_NG\\excel\\data.xlsx");
	Workbook book=new XSSFWorkbook();
	Sheet sheet=book.createSheet();
	Row row=sheet.createRow(0);
	Cell cell=row.createCell(0);
	FileOutputStream output=new FileOutputStream(file);
	book.write(output);
	book.close();
	System.out.println("done");
	
	}
	

	
	
	}
