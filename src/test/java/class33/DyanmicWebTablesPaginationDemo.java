package class33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicWebTablesPaginationDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//*[@class='table-container']//tbody//tr[3]//td[2]
		//ul[@class='pagination']//a[text()='2']
		
		// reading data from the all pages and select the 
		int totalnoOfPages =driver.findElements(By.xpath("//ul[@class='pagination']//a")).size();
		int noOfRows = driver.findElements(By.xpath("//*[@class='table-container']//tbody//tr")).size();
		
		for (int p=1;p<=totalnoOfPages;p++)
		{
			
			if(p>=1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//a[text()="+p+"]"));
				active_page.click();	
				//Thread.sleep(3000);
			}
			for(int r=1;r<=noOfRows;r++)
			{
				String productName=driver.findElement(By.xpath("//*[@class='table-container']//tbody//tr["+r+"]//td[2]")).getText();
				String productprice=driver.findElement(By.xpath("//*[@class='table-container']//tbody//tr["+r+"]//td[3]")).getText();
				WebElement productSelection=driver.findElement(By.xpath("//*[@class='table-container']//tbody//tr["+r+"]//td[4]//input"));
				productSelection.click();
				
				System.out.println(productName+ "\t"+ "\t"+productprice );
			}
			
		}
		driver.quit();

		
	}

}
