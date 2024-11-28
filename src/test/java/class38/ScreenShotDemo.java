package class38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		/*
		//1 Full page screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		// HardCoded patha - > C:\Learnings\SeleniumTutorials
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile); //Copy sourcefile to target file
		*/
		
		/*
		//2) capture the screenshot of the specific section
		
		WebElement featuredProduct =driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile1 =featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshots\\featuredProduct.png");
		sourcefile1.renameTo(targetfile1); //Copy sourcefile to target file
		
		*/
		//3) capture the screenshot of the WebElement
		Thread.sleep(3000);
		WebElement featuredProduct =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile1 =featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshots\\Logo.png");
		sourcefile1.renameTo(targetfile1); //Copy sourcefile to target file
	
		//delete generated file before re run, if the file is existed then it will not re-write the file
		//driver.quit();
	}

}
