package dataProvider;
//Orange HRM
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	
	public ExcelDataProvider() {
		// All the Excel File loading related code is here
		
		File src = new File("C:\\Qspider\\Local\\com.OrangeHRM.Hybrid\\ApplicationTestData\\TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception is "+e.getMessage());
			
			
		}
		
	
		
	}
	
	public String getData(int sheetIndex,int row,int column)
	{
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public String getData(String sheetName,int row,int column)
	{
		String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
