package class23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws Exception {
		//https://demo.nopcommerce.com/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//tag id
		//driver.findElement(By.cssSelector("div#header-cart")).click();
		//driver.findElement(By.cssSelector("#header-cart")).click();
		
		
		//tag class	tag.classname
		//if the class name is having spaces , just give the starting part it will identity the element
		//eg- form-control form-control-lg ---> form-control this should work
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Tablets");
		
		
		//tag attribute       tag[attribute="value"] 
		//Tag name is optional here
		//driver.findElement(By.cssSelector("button[type='button'][data-lang='en-gb']")).click();
		//driver.findElement(By.cssSelector("[type='button'][data-lang='en-gb']")).click();
		
		//tag class attribute
		//Tag name is optional here
		//driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("Tablets");
		driver.findElement(By.cssSelector(".form-control[name='search']")).sendKeys("Tablets");
		
		driver.findElement(By.cssSelector("[type='button'][data-lang='en-gb']")).click();
		
		
				
		
		//driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Tablets");
		//driver.findElement(By.cssSelector("[type='button'][data-lang='en-gb']")).click();
		//driver.quit();
	}

}
