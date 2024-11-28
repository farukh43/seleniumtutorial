package class21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 1) Launch browser (chrome)
 * 2) Open URL https://demo.opencart.com/
 * 3) Validate title should be "Your Store"
 * 4) close browser
 */

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// 1) Launch browser (chrome)
		//ChromeDriver driver1 = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		//Edge browser
		//WebDriver driver= new EdgeDriver();
		
		//Firefox browser
		//WebDriver driver= new FirefoxDriver();
		
		//2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3) Validate title should be "Your Store"
		String act_title=driver.getTitle();
		if(act_title.equalsIgnoreCase("Your Store"))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		
		//4) close browser
		Thread.sleep(3000);
		driver.close();
		
		//driver.quit();
	}

}
