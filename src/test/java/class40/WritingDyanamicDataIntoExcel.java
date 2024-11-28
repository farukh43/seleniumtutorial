package class40;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDyanamicDataIntoExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\MyFile_dynamic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many Rows?");
		int noOfRows=sc.nextInt();
		
		System.out.println("Enter how many Cells?");
		int noOfCells=sc.nextInt();
		
		for (int r=0;r<=noOfRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<noOfCells;c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
			
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created successfully");
	
		
	}

}
