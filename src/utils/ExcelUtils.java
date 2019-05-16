package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.eclipse.jetty.util.component.Dumpable;

public class ExcelUtils {
	 
	public static FileInputStream fis = null;
	Workbook wb;
	
	public ExcelUtils()throws Exception
	{
		fis = new FileInputStream("D://TestNG//TestNGExamples//DataProvider.xlsx");
		wb = WorkbookFactory.create(fis);
	}
	
	public int getLastRow(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int getLastColumn(String sheetname,int rowNumber)
	{
		return wb.getSheet(sheetname).getRow(rowNumber).getLastCellNum();
	}
	public String getCellValue(String sheetName,int rowNumber,int colNumber)
	{
		if (wb.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getCellType()==CellType.NUMERIC) {
			int n = (int)wb.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getNumericCellValue();
			String data = String.valueOf(n);
			return data;
		}
		return wb.getSheet(sheetName).getRow(rowNumber).getCell(colNumber).getStringCellValue();
	}

}
