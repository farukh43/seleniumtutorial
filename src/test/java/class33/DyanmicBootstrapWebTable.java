package class33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicBootstrapWebTable {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the specified URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		Thread.sleep(3000);
		
		// Find the username and user role 
		List<WebElement> usernames = driver.findElements(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-row oxd-table-row--with-border']//div[2]/div[1]")); 
		List<WebElement> userRoles = driver.findElements(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-row oxd-table-row--with-border']//div[3]/div"));

		for (int i = 0; i < usernames.size(); i++) 
		{
			System.out.println("Username: " + usernames.get(i).getText() + ", User Role: " + userRoles.get(i).getText());
			}
		driver.quit();
	
	}

}
