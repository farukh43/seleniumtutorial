package class29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 1) select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//2) select all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));

		/*
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		*/
		/*
		for (WebElement webElement : checkboxes) {
			webElement.click();
		}
		Thread.sleep(5000);
		*/
		
		//3) select last 3 checkboxes
		//total no of checkboxes- how many checkboxes want to select = starting index
		//7-3=4
		//for (int i = 4; i < checkboxes.size(); i++) {
			//checkboxes.get(i).click();
		//}
		
		//4)select first 3 checkboxes
		//for (int i = 0; i < checkboxes.size()-4; i++) {
		//	checkboxes.get(i).click();
		//}
		
		//or 
		
		//for (int i = 0; i < 3; i++) {
			//checkboxes.get(i).click();
		//}
		
		//5) unselect checkboxes if they are selected
		//selecting check boxes
		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(2000);
		//the below for loop will deselect the selected checkbox will select the other checkboxes
//		for (WebElement webElement : checkboxes) {
//			webElement.click();
//		}
		
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
