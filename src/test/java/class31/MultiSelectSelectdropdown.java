package class31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSelectdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();

		//selecting multiple dropdown - select tag
		WebElement color_dropdown = driver.findElement(By.id("colors"));
		Select mutiselect_dropdown = new Select(color_dropdown);
		mutiselect_dropdown.selectByVisibleText("Red");
		mutiselect_dropdown.selectByVisibleText("Blue");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
