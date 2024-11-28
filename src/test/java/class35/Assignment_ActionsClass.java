package class35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment_ActionsClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//mouse over action
		Actions act = new Actions(driver);
		WebElement pointme= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		WebElement mobiled= driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		Action pontingthe =act.moveToElement(pointme).moveToElement(mobiled).click().build();
		Thread.sleep(3000);
		pontingthe.perform();
		
		//Double Click
		WebElement field1=driver.findElement(By.id("field1"));
		WebElement field2=driver.findElement(By.id("field2"));
		WebElement copytextbtn_loc=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		act.doubleClick(copytextbtn_loc).perform();
		String field1_txt=field1.getAttribute("value");
		String field2_txt=field2.getAttribute("value");
		
		System.out.println("Copied Text is :"+field1_txt);
		
		if(field1_txt.equals(field2_txt))
		{
			System.out.println("text copied...");
		}
		else
		{
			System.out.println("text not copied properly..."); 
			
		}
		
		
		//drag and drop  
		WebElement dragele_loc= driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement dropele_loc= driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(dragele_loc, dropele_loc).perform();
		
		String message=driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText();
		System.out.println(message);
		
		if (message.equals("Dropped!"))
		{
			System.out.println("Element drag and dropped sucessfullY: "+message);
		}else
		{
			System.out.println("unable Element drag and dropped sucessfullY: "+message);

		}
		
	}

}
