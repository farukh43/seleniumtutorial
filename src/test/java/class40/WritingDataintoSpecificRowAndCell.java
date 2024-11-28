package class40;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoSpecificRowAndCell {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\MyFile_Random.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		
		cell.setCellValue("Welcome");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created successfully");
	
		
	}

}
