package class22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayed = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayed);
		
		
		//LinkText and partialLinkText
		//Mostly we prefer the LinkText , Partial link test may return multiple values ex table and tablets etc
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//ClassName
		//This is used for locating multiple webElements
		
		//List<WebElement>  headerLinks=driver.findElements(By.className("list-inline"));
		//System.out.println("Total No of links in Header "+headerLinks.size());
		
		//TagName		
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		//int totalnoOfLinks =links.size();
		//System.out.println("Total No of Links on the Page :"+totalnoOfLinks);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int totalnoOfImages =images.size();
		System.out.println("Total No of Links on the Page :"+totalnoOfImages);
				
		driver.quit();
		
	}

}
