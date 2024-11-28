package class29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//handle alert without using switchTo().alert()
//by using explicit wait
public class HandleAlertsWithExplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Open the specified URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		//1) normal alert with ok button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); //capture alert
		System.out.println(myalert.getText());
		myalert.accept();
		driver.quit();

	}

}
