package class37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //Approach 1 
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		/*
		//single file upload - test1.txt
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Faruk\\Downloads\\Text1.txt");

		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text1.txt"))
		{
			System.out.println("File is sucessfully uploaded");
		}
		else
		{
			System.out.println("File uploaded");
		}
		*/
		
		//multiple files uploaded
		String file1="C:\\Users\\Faruk\\Downloads\\Text1.txt";
		String file2="C:\\Users\\Faruk\\Downloads\\Text2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesuploded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//validation 1 - noumer of files
		if(noOfFilesuploded==2)
		{
			System.out.println("All Files are sucessfully uploaded");
		}
		else
		{
			System.out.println("File are not uploaded or incorect files uploaded");
		}
		
		//validate file names
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text2.txt"))
		{
			System.out.println("File names matching");
		}
		else
		{
			System.out.println("File names are not matching");
		}
		}

}
