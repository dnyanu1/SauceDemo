package pack3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExcelSwitchCase {

	private static final int STRING =0;
	private static final int BOOLEAN = 0;
	private static final int NUMERIC = 0;

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\yashv\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	
       int rows=workbook.getSheet("Sheet1").getLastRowNum();
       int columns=workbook.getSheet("Sheet1").getRow(rows).getLastCellNum();
     for(int r=0; r<=rows; r++)
     {
    	 XSSFRow row=sheet.getRow(r);
    	for(int c=0; c<columns; c++)
    	{
    		XSSFCell cell=row.getCell(c);
    		
    		
    		System.out.println(cell.getStringCellValue());
//    		switch(cell.getCellType())
//    		{
//    case STRING : System.out.println(cell.getStringCellValue()); break;
//    case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
//    case BOOLEAN : System.out.println(cell.getBooleanCellValue()); break;	
//    		}
    	}
	}

}}
