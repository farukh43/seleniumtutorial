package class26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//getTittle()- returns tittle of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()- returns URL of the page
		System.out.println(driver.getCurrentUrl());
	
		//getPageSource() - returns source code of the code
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns the ID of the single browser window
		
		//String WindowId =driver.getWindowHandle();
		//System.out.println(WindowId);
		//everyTime it changes
		//05B4570EC4125FDE157DE0ED461191A4
		//D3711BA8E1F0DCEB3E9439628672DA42
		
		//getWindowHandles() - returns IDs of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); 
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
		Thread.sleep(5000);
		
		//System.out.println(driver.getClass());
		
		driver.quit();
	}

}
