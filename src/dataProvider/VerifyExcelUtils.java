package dataProvider;

import utils.ExcelUtils;

public class VerifyExcelUtils {

	public static void main(String[] args) throws Exception {
		ExcelUtils excel = new ExcelUtils();
		int rows = excel.getLastRow("Sheet1");
		int cols = excel.getLastColumn("Sheet1", 0);
		System.out.println(rows+"   "+cols);
	}
	
	
}
