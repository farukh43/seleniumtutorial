package class39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_svg_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Try more examples on SVG
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iPhone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
	
		//svg element xpath
		//button[@class='_2iLD__']//*[name()='svg']//*[local-name()='path' and contains(@stroke-linecap,'round')][1]
	}

}
