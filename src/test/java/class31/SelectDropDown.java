package class31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//
	WebElement drpCpuntryEle=driver.findElement(By.id("country"));
	Select drpCountry = new Select(drpCpuntryEle);
	
	//Selecting option from the dropdown
	//drpCountry.selectByVisibleText("Germany");
	//drpCountry.selectByValue("japan");
	//drpCountry.selectByIndex(2);
	
	//capture the options from the dropdown
	List<WebElement> options=drpCountry.getOptions();
	System.out.println("Number of options in a drop down: "+options.size());
	
	//printing options - using foreach loop
//	for (WebElement webElement : options) {
//		System.out.println(webElement.getText());
//	}
	

	//printing options - using for loop
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	
	
	
	
	Thread.sleep(2000);
	driver.quit();
	}

}
