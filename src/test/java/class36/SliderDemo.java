package class36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement minSliderButton= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		WebElement MaxsliderButton= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		
		System.out.println("Before Moving "+minSliderButton.getLocation());
		System.out.println(MaxsliderButton.getLocation());
		
		Actions act =new Actions(driver);
		//changing min slider
		act.dragAndDropBy(minSliderButton, 100, 289).perform();
		System.out.println("After Moving minSliderButton"+minSliderButton.getLocation());
		
		//chaning max slider
		act.dragAndDropBy(MaxsliderButton, -100, 289).perform();
		System.out.println("After Moving MaxsliderButton "+MaxsliderButton.getLocation());
		
		driver.quit();
	
	}

}
