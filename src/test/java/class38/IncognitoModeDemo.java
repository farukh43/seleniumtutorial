package class38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoModeDemo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--incognito");
	    
	    WebDriver driver= new ChromeDriver(options);
	    //2) Open URL https://demo.opencart.com/
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			//3) Validate title should be "Google"
			String act_title=driver.getTitle();
			System.out.println(act_title);
			if(act_title.equalsIgnoreCase("Google"))
			{
				System.out.println("Test Passed");
			}else
			{
				System.out.println("Test Failed");
			}
			
			//4) close browser
			//driver.quit();

	}

}
