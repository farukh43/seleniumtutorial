package class35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragAndDropGuru99 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//mouse over action
		Actions act = new Actions(driver);
		//dragable elements
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement bankAmount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement salesAmount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		
		WebElement bankAct_drop = driver.findElement(By.id("bank"));
		WebElement bankAmount_drop = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		WebElement sales_drop = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		WebElement salesAmount_drop = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		//performing drag and drop
		act.dragAndDrop(bank, bankAct_drop).dragAndDrop(bankAmount, bankAmount_drop).dragAndDrop(sales, sales_drop).dragAndDrop(salesAmount, salesAmount_drop).perform();
		
		String perfectMessage= driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();
		if(perfectMessage.equals("Perfect!"))
		{
			System.out.println("Expected Message is Displayed :"+ perfectMessage);
		}
		else
		{
			System.out.println("Expected Message is NOT Displayed :"+ perfectMessage);
			
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
