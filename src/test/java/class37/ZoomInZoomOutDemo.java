package class37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOutDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/");
		//Thread.sleep(3000);
		// Minimizing the page
		//driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");

		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='80%'");

	}

}
