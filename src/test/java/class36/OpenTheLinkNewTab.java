package class36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@aria-expanded='false']//i[@class='fa-solid fa-caret-down']")).click();
		WebElement register_link = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		//Control + RegLink
		act.keyDown(Keys.CONTROL).click(register_link).keyUp(Keys.CONTROL).build();
		
		//switching to registration page
		List <String> ids= new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1)); //switch to registratio page
		
		driver.findElement(By.name("first Name")).sendKeys("John");
		
		//home page
		driver.switchTo().window(ids.get(0)); 
		driver.findElement(By.xpath("input[@id=''small-searchitme]")).sendKeys("T-Shirts");
		
		
		
		
		
	}

}
