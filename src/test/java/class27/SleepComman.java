package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepComman {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000); //pause the execution
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
		}

}
