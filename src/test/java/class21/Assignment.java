package class21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 1) Launch browser (chrome)
 * 2) Open URL https://demo.nopcommerce.com/
 * 3) Validate title should be "nopCommerce demo store"
 * 4) close browser
 */
public class Assignment {

	public static void main(String[] args) throws Exception {
	
		//1) Launch browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		//2) Open URL https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		//Thread.sleep(10000);
		
		//3)Validate title should be "nopCommerce demo store"
		String act_title=driver.getTitle();
		if (act_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test Passed");
		} else
		{
			System.out.println("Test Failed");
		}
		
		//4) close browser
		Thread.sleep(3000);
		driver.close();
		 
		

	}

}
