package class37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //Approach 1 
		//ChromeDriver driver = new ChromeDriver(); //Approach 2
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement firstName_loc = driver.findElement(By.xpath("//input[@id='name']"));
		// firstName_loc.sendKeys("Johny");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//Approach 1 
		//JavascriptExecutor js = driver;//Approach 2
		
		// if we use the Approach 1 then we need to upcast the  driver because JavascriptExecutor interface and WebDriver Interface does not have any relationship
		// If we use the Approach 2 then we no need to upcast as ChromeDriver class can access the JavascriptExecutor interface as it is grandchild of it
		// The problem with approach 2 is WebDriver interface methods we cannot access , that's why approach 1 is preferred
		
		/* chatgpt the below line, you will get example
		 * ChromeDriver driver = new ChromeDriver(); JavascriptExecutor js = driver; what will be the problem with the above approach just theory explainantion
		 */
		
		js.executeScript("arguments[0].setAttribute('value','John')", firstName_loc);
		//passing the text into the input box - altenative of sendKeys();
		
		//alternate of click method - clicking on the element
		WebElement gender_loc = driver.findElement(By.xpath("//input[@id='male']"));
		//gender_loc.click();
		js.executeScript("arguments[0].click()", gender_loc);
		
		driver.quit();
	}

}
