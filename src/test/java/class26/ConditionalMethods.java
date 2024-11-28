package class26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//isDisplayed - 
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("logo display status: " +logo.isDisplayed());
		
		//boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("logo display status: " +logo);
		
		//isEnabled()
		//boolean status=driver.findElement(By.name("FirstName")).isEnabled();
		//System.out.println(status);
		
		//
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection...........");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
	
		System.out.println("After selection...........");
		female_rd.click(); //select male radio button
		//
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		boolean newsletter_status = driver.findElement(By.xpath("//input[@id='Newsletter']")).isDisplayed();
		System.out.println("Newsletter Staus : "+newsletter_status);
		driver.quit();
	
	}

}
