package class35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act =new Actions(driver);
		
		//right click action
		act.contextClick(button).perform();

		//click on copy
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Thread.sleep(3000);
		
		//close the alert
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.quit();
		
	}

}
