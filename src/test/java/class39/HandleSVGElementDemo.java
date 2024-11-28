package class39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		//login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		//abs expath will not work svg elements
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/svg")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
		//driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M256,302c8')]")).click();
		WebElement element =driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M256,302c8')]/parent::*"));
		
		
		//a[@class='oxd-main-menu-item active']//*[name()='svg']
		//document.querySelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4) > a > svg");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		// Use JavaScript to click the element 
		//js.executeScript("arguments[0].click()", element);
		js.executeScript("var evt = new MouseEvent('click', {bubbles: true, cancelable: true, view: window}); arguments[0].dispatchEvent(evt);", element);// this will work

	
	}

}
