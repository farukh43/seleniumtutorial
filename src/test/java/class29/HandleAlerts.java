package class29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		// Open the specified URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		/*
		//1) normal alert with ok button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//the below command will close the alert
		//driver.switchTo().alert().accept();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		 */
		
		//2)confirmation Alter with - Ok & Cancel button
		/*
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept(); //close alert using Ok button
		alert.dismiss(); //close alert using Cancel button
		*/
		
		// 3. prompt alert - input box
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert myPromptalert =driver.switchTo().alert();
		myPromptalert.sendKeys("Welcome");
		Thread.sleep(3000);
		System.out.println(myPromptalert.getText());
		
		myPromptalert.accept(); //close alert using Ok button
		//myPromptalert.dismiss(); 
		
		driver.quit();
	}

}
