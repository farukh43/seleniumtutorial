package class29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[4]//input[contains(@type,'checkbox')]"));
		for (WebElement webElement : checkboxes) {
			webElement.click();
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
