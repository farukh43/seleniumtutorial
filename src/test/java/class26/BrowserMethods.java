package class26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); 
		
		Thread.sleep(5000);
		//driver.close(); // close single browser window wherever the driver is focused
		driver.quit(); //close all the browser windows

	}

}
