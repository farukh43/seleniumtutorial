package class28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 1) Search for a specific string
		String searchString = "Selenium";
		WebElement bodyText = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		bodyText.sendKeys(searchString);

		WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBtn.click();

		// 2) Count the number of links
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='wikipedia-search-results']/child::div/a"));
		System.out.println("Number of links on the page: " + links.size());

		// 3) Click on each link using a for loop
		String mainWindow = driver.getWindowHandle();
		for (WebElement link : links) {
			
			// Open each link in a new tab and switch to it
			link.click();

			// Switch to the new tab and perform actions if needed
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowID : windowHandles) {
				if (!windowID.equals(mainWindow)) {
					driver.switchTo().window(windowID);
					System.out.println("Switched to window with title: " + driver.getTitle());
					System.out.println("Current ID : "+windowID);
					driver.close(); // Close the new tab
				}
			}
			driver.switchTo().window(mainWindow); // Switch back to the main window
		}

		// 4) Get window IDs for every browser window
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Parent Window IDs:");
		for (String windowID : allWindowHandles) {
			System.out.println(windowID);
		}

		// 5) Close a specific browser window (if open)
		// For example, close the main window
		driver.switchTo().window(mainWindow);
		driver.close();

	}

}
