package class32;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentForStaticTable {

	public static void main(String[] args) {
	/*
	 * Go to https://blazedemo.com/ website
	 * select source and destination
	 * find the cheapest flight
	 * and book the flight
	 * and confirm the massege and validate it
	 */

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement sourceCity_Loc= driver.findElement(By.name("fromPort"));
		Select sourceCity = new Select(sourceCity_Loc);
		sourceCity.selectByVisibleText("Philadelphia");
		
		WebElement destinationCity_Loc= driver.findElement(By.name("toPort"));
		Select destinationCity = new Select(destinationCity_Loc);
		destinationCity.selectByVisibleText("New York");
	
		WebElement findFlights_Loc= driver.findElement(By.xpath("//input[@value='Find Flights']"));
		findFlights_Loc.click();
		
		//1) find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("Number of rows :"+rows);
		
		//2) find total number of column ina table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // multipe tables
		System.out.println("Number of columns :"+cols);
				
		 System.out.println("**************Finding the lowest price in the webtable******************");
		
		 // Step 3: Extract the prices and store them in an array
         List<WebElement> priceElements = driver.findElements(By.xpath("//table[@class='table']//td[6]"));
         double[] prices = new double[priceElements.size()];

         for (int i = 0; i < priceElements.size(); i++) {
             String priceText = priceElements.get(i).getText().replace("$", "");
             prices[i] = Double.parseDouble(priceText);
         }

         // Step 4: Sort the array to find the cheapest price
         Arrays.sort(prices);
         double cheapestPrice = prices[0];
         System.out.println("cheapestPrice is :" +cheapestPrice);

         // Step 5: Find and click the "Choose This Flight" button for the cheapest flight
         for (int i = 0; i < priceElements.size(); i++) {
             String priceText = priceElements.get(i).getText().replace("$", "");
             if (Double.parseDouble(priceText) == cheapestPrice) {
                 // Click the corresponding "Choose This Flight" button
                 List<WebElement> chooseButtons = driver.findElements(By.cssSelector("input[type='submit']"));
                 chooseButtons.get(i).click();
                 break;
             }
         }

         // Step 6: Book the flight
         driver.findElement(By.id("inputName")).sendKeys("John Doe");
         driver.findElement(By.id("address")).sendKeys("123 Main St");
         driver.findElement(By.id("city")).sendKeys("Anytown");
         driver.findElement(By.id("state")).sendKeys("CA");
         driver.findElement(By.id("zipCode")).sendKeys("12345");
         driver.findElement(By.id("creditCardNumber")).sendKeys("4111111111111111");
         driver.findElement(By.id("nameOnCard")).sendKeys("John Doe");
         driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();

         // Step 7: Confirm the booking message and validate it
         String confirmationMessage = driver.findElement(By.cssSelector("h1")).getText();
         if (confirmationMessage.equals("Thank you for your purchase today!")) {
             System.out.println("Booking confirmed successfully.");
         } else {
             System.out.println("Booking confirmation failed.");
         }
     
         driver.quit();

	}

}
