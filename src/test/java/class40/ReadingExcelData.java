package class40;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\SampleTestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//XSSFSheet sheet=workbook.getSheetAT(0); // to import based on sheet number
		
		int totalRows=sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows: "+totalRows); //5
		System.out.println("Number of Cells: "+totalcells); //4
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow cuurentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell currentcell =cuurentRow.getCell(c);
				//System.out.println(currentcell.toString());
				System.out.print(currentcell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}
