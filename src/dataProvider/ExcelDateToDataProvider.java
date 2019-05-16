package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtils;

public class ExcelDateToDataProvider {
	
	public ExcelUtils excel = null;
	public Object[][] testData(String sheetName) throws Exception
	{
		Object[][] excelData = null;
		excel = new ExcelUtils();
		int NumberOfRows = excel.getLastRow(sheetName);
		int NumberOfCols = excel.getLastColumn("Sheet1", 0);
		System.out.println(NumberOfRows);
		System.out.println(NumberOfCols);
		excelData = new Object[NumberOfRows][NumberOfCols];
		for (int i = 1; i <=NumberOfRows; i++) {
			int innerNumberOfCols = excel.getLastColumn(sheetName, i);
			for (int j = 0; j < innerNumberOfCols; j++) {
				System.out.println(excel.getCellValue(sheetName, i, j));
				excelData[i-1][j] = excel.getCellValue(sheetName, i, j);
			}
		}

		return excelData;
		
	}
	@DataProvider(name="userData")
	public static Object[][] userFormData() throws Exception
	{
		ExcelDateToDataProvider data = new ExcelDateToDataProvider();
		return data.testData("Sheet1");
	}
	/*@Test(dataProvider="userData")
	public void TestOne(String userName,String password,String email)
	{
		System.out.println(userName+"****"+password+"****"+email);
	}*/

}
