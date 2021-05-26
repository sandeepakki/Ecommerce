package utils;

public class ExcelRequisits {
	
	public static void main(String[] args) {
		
		ExcelUtils excel = new ExcelUtils("C:\\Users\\sande\\eclipse-workspace\\CSTech\\"+
										"EcomCategoryCreations\\Excel\\Categories.xlsx","Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 2);
		excel.getCellDataNumber(1, 2);
		excel.getColCount();
	}
}
