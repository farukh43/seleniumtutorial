package class35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copytext_btn=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		
		box1.clear();
		box1.sendKeys("WELCOME");
		
		//double click on the button
		Actions act = new Actions(driver);
		act.doubleClick(copytext_btn).perform();
		
		//validation : box2 should contains "Welcome"
		String text=box2.getAttribute("value");
		System.out.println("captured value is :" +text);
		
		if (text.equals("WELCOME"))
		{
			System.out.println("text copied...");
		}else
		{
			System.out.println("text not copied properly..."); 
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
