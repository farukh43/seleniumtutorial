package class31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			// Open the specified URL
			driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2#google_vignette");
			driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//span[contains(@class,'multiselect-select')]")).click(); //opens dropdown options
			
			//1)select single options
			//driver.findElement(By.xpath("//input[@value='Java']")).click();
			
			//2)capture all the options and find out size
			List <WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//label"));
			System.out.println("Number of options: "+options.size());
			
			//3) printing options from dropdown
			/*for (WebElement webElement : options) {
				System.out.println(webElement.getText());
				
			}
			*/
			
			//4) select multiple options
			for (WebElement op : options) {
				String option = op.getText();
				if (option.equals("Java") || option.equals("HTML") || option.equals("Python") || option.equals("MS SQL Server")) 
				{
					op.click();
				}

			}

			Thread.sleep(2000);
			driver.quit();
	}

}
