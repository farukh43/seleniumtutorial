package class34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_HotelBooking {
	
	static void selectDate(WebDriver driver, String year, String month, String date)
	{

		while (true) {
	            // Get the current year from the date picker as a string and convert it to integer
	            String currentYearText = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	            int currentYear = Integer.parseInt(currentYearText);
	            int targetYearInt = Integer.parseInt(year);

	            // Compare current year to the target year
	            if (currentYear == targetYearInt) {
	                break;
	            } else if (currentYear > targetYearInt) {
	                // If the current year is greater, click the "Previous" button (for past years)
	                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	            } else {
	                // If the current year is less, click the "Next" button (for future years)
	                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	            }
	        }
		
		WebElement monthDropdown=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s = new Select(monthDropdown);
		s.selectByVisibleText(month);
		
		 // Select the correct date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement d : dates) {
            if (d.getText().equals(date)) {
                d.click();
                break;
            }
        }
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the specified URL
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Hotel']")).click();
		System.out.println("Clicked on hotel link");
		driver.findElement(By.xpath("//form[@id='hotel_form']//div[@class='col-sm-12 p-0 suggestion-cities-container']//input[@name='city[]']")).sendKeys("hyd");
		
		Thread.sleep(5000);
		
		//Selecting City
		List <WebElement> city=driver.findElements(By.xpath("//ul[@class='suggestions-cities-list']//li//p"));
		for (WebElement ct : city) {
			 if (ct.getText().equalsIgnoreCase("Hyderabad")) {
	                ct.click();
	                System.out.println("City Selected");
	                break;
			}
		}
		
		//method 2 : Using data picker - Expected data
		//checkindata
		String inyear="2023";
		String inmonth="Apr";
		String indate="25";
		
		driver.findElement(By.name("checkin[]")).click();
		selectDate(driver, inyear, inmonth, indate);
		
		Thread.sleep(3000);
		driver.findElement(By.name("checkout[]")).click();
		//checkoutdata
		String outyear="2025";
		String outmonth="Mar";
		String outdate="25";
		selectDate(driver, outyear, outmonth, outdate);
		driver.quit();
		
	}

}
