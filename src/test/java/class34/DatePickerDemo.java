package class34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	static void selectFutureDate(WebDriver driver, String month, String year, String date)
	{
		//select month & years
				while(true)
				{
				String cuurentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String cuurentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(cuurentMonth.equals(month) && cuurentYear.equals(year) )
				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next button
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous button
				
				}
				
				// select the date
				List<WebElement> alldates = driver.findElements(By.xpath("//table//tbody//tr//td//a"));
				for (WebElement dt : alldates) {
					if (dt.getText().equals(date)) {
						dt.click();
						break;
					}

				}
		
	}
	static void selectPastDate(WebDriver driver, String month, String year, String date)
	{
		//select month & years
				while(true)
				{
				String cuurentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String cuurentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(cuurentMonth.equals(month) && cuurentYear.equals(year) )
				{
					break;
				}
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous button
				
				}
				
				// select the date
				List<WebElement> alldates = driver.findElements(By.xpath("//table//tbody//tr//td//a"));
				for (WebElement dt : alldates) {
					if (dt.getText().equals(date)) {
						dt.click();
						break;
					}

				}
		
	}

	static void selectMonthAndYear (WebDriver driver, String month, String year) {
		//select month & years
		while(true)
		{
		String cuurentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String cuurentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(cuurentMonth.equals(month) && cuurentYear.equals(year) )
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// next button
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous button
		
		}
	}

	static void selectData(WebDriver driver,String date)
	{
		// select the date
		List<WebElement> alldates = driver.findElements(By.xpath("//table//tbody//tr//td//a"));
		for (WebElement dt : alldates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}

		}
	}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the specified URL
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//method 1 : using sendKeys()
		//driver.findElement(By.id("datepicker")).sendKeys("11/19/2024"); //MM/DD/YYYY
	
		//method 2 : Using data picker - Expected data
		String year="2020";
		String month="May";
		String date="25";
		
		//opens the date picker
		driver.findElement(By.id("datepicker")).click();
		
		//selecting month and Year and Selecting date separate -- this is one example
		//selectMonthAndYear(driver, month, year);
		//selectData(driver, date);	
		
		
		//selectFutureDate(driver, month, year, date);
		selectPastDate(driver, month, year, date);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
