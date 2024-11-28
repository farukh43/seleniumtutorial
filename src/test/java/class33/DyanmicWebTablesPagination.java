package class33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class DyanmicWebTablesPagination {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the specified URL
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		

		// Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(30))
		    .pollingEvery(Duration.ofSeconds(5))
		    .ignoring(NoSuchElementException.class);
	
		//login steps
		WebElement username_txt_loc = driver.findElement(By.name("username"));
		WebElement password_txt_loc = driver.findElement(By.name("password"));
		WebElement login_btn_loc = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		username_txt_loc.clear();
		password_txt_loc.clear();
		username_txt_loc.sendKeys("demo");
		password_txt_loc.sendKeys("demo");
		login_btn_loc.click();
		Thread.sleep(3000);
		WebElement  customersparent_btn_loc = driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']"));
		mywait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		        return customersparent_btn_loc;
		    }
		});
		
		
		customersparent_btn_loc.click();
		WebElement  customerschild_btn_loc = driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]"));
		customerschild_btn_loc.click();
		Thread.sleep(15000);
		
		//Showing 1 to 10 of 11187 (1119 Pages)
		String txt=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages=Integer.parseInt(txt.substring(txt.indexOf("(")+1, txt.indexOf("Pages")-1));
		
		for (int i=1;i<=5;i++) {
			
			if(i>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+i+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
		}
		
		
		// reading data from the page
		int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for (int r=1;r<=noOfRows;r++)
		{
			String CustomerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String Customeremail=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			String CustomerStatus=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
			
			System.out.println(CustomerName +"\t" +Customeremail +"\t" +CustomerStatus);
			
			
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
