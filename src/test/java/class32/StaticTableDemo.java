package class32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) find total number of rows in a table
		// this is more accurate and used in script
		//recommanded when we have multiple tables
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows :"+rows);
		
		//when we have only single table in the web page
		int rowsq=driver.findElements(By.tagName("tr")).size();
		System.out.println("Number of rows :"+rowsq);
		
		
		//2) find total number of column ina table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // multipe tables
		System.out.println("Number of columns :"+cols);
		
		int cols1=driver.findElements(By.tagName("th")).size();
		System.out.println("Number of columns :"+cols1);
		
		
		//read data from specific row and column (ex: 5th row and 1st column)
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);//Master In Selenium
		
		//read data from all the rows and columns
		/*
		System.out.println("-----Printing Table Data -----");
		for (int r=2;r<=rows;r++)
		{
			for (int c = 1; c <= cols; c++) {
   String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
   
   System.out.print(value + "\t");
			}
			System.out.println();
		}
		*/
		
		//print book names whose author is mukesh
		/*
		System.out.println("**************print book names whose author is mukesh******************");
		for (int r=2;r<rows;r++)
		{
		String authorName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//System.out.println(authorName);
		
		if(authorName.equals("Mukesh"))
		{
			String bookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookName+"\t"+authorName);
			
		}
		}
		*/
		
		//print total value of books
	   System.out.println("**************print total value of books******************");
	   int totalPrice=0;
	   for (int r=2;r<rows;r++)
	   {
	   String bookPrice= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	   System.out.println("Each Book Price :"+bookPrice);
	   totalPrice=totalPrice+Integer.parseInt(bookPrice);
	   }
	   System.out.println("Total Price of All Books: "+totalPrice);
	
		Thread.sleep(2000);
		driver.quit();
		
	}

}
