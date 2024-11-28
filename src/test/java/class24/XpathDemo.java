package class24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
		
		//xpath with multiple attribute
		//input[@placeholder='Search'][@name='search']
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tshirts");
		
		//Xpath with 'and' 'or' operators
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='xyz']")).sendKeys("Tshirts");
		
		Thread.sleep(5000);
		
		//Xpath with text()
		//driver.findElement(By.xpath("//a[text()='MacBook']"));
		
		//boolean displayStatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displayStatus);//true
		
		//String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);//Featured
		
		//Xpath with contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'ear')]")).sendKeys("tablets");
		
		//Xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("tablets");
		
		//chained xpath
		boolean imagstatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imagstatus);
		
		driver.quit();
		

	}

}
