package class35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement destktop = driver.findElement(By.xpath("//*[text()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

		Actions act = new Actions(driver);
		//mouse over
		//act.moveToElement(destktop).moveToElement(mac).build().perform();
		//act.moveToElement(destktop).moveToElement(mac).perform();// same as above from selenium 4

		act.moveToElement(destktop).moveToElement(mac).click().build().perform();
	}

}
