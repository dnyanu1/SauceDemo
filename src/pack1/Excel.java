package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {

	public static void main(String[] args) throws IOException 
	{
		String timestamp = new SimpleDateFormat("ddMMYYYY_HHmmss").format(new Date());
		
		String path="C:\\Users\\yashv\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
//		String value=workbook.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
//		System.out.println(value);
		int row=workbook.getSheet("Sheet1").getLastRowNum();
		int column=workbook.getSheet("Sheet1").getRow(row).getLastCellNum();
		System.out.println(row);
		System.out.println(column);
		for(int r=0; r<=row; r++)
		{
			for(int c=0; c<column; c++)
			{
			System.out.print(workbook.getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue());
			System.out.print("  ");
			}
			System.out.println();
         }
		
//		int row1=workbook.getSheet("Sheet1").getLastRowNum();
//		int column1=workbook.getSheet("Sheet1").getRow(4).getLastCellNum();
//		System.out.println(row1);
//		System.out.println(column1);
//		for(int i=0; i<=4; i++)
//		{
//			for(int j=2; j<column1; j++)
//			{
//			System.out.print(workbook.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue());
//			System.out.print("  ");
//			}
//			System.out.println();
//	    }
	
     }
}