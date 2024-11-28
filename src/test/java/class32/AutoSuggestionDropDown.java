package class32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//*[@role='option']"));
		System.out.println("All the options : " + options.size());

		for (WebElement op : options) {
			// String option=op.getText();
			if (op.getText().equals("selenium")) {
				op.click();
				break;
			}

		}

		Thread.sleep(2000);
		driver.quit();

	}

}
