package class27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txt_username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txt_username.sendKeys("Admin");
		
		WebElement txt_pswd=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		txt_pswd.sendKeys("admin123");
		
		WebElement btn_login=mywait.until(ExpectedConditions.elementToBeClickable (By.xpath("//button[@type='submit']")));
		btn_login.click();
		
		driver.quit();
		
	}

}
