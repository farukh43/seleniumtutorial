package class30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleiFrame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1- switching to frame 1 and performing actions
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // passed frame as a webelement //switch to frame 1
		driver.findElement(By.name("mytext1")).sendKeys("Seleniumiframe");

		//we cannot switch from one frame to another iframe we need to switch page content and switch it back to frame 2
		driver.switchTo().defaultContent(); //go back to page
				
		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); // passed frame as a webelement //switch to frame 1
		driver.findElement(By.name("mytext2")).sendKeys("Seleniumiframe");
		
		//we cannot switch from one frame to another iframe we need to switch page content and switch it back to frame 2
		driver.switchTo().defaultContent(); //go back to page
				
		// frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); // passed frame as a webelement //switch to frame 1
		driver.findElement(By.name("mytext3")).sendKeys("Seleniumiframe");

		//inner iframe -part of frame 3
		driver.switchTo().frame(0); //switching to frame using index
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		//some times we ma get element not clickable element exception then we can use javascript executor
		
		WebElement rd_btn=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rd_btn);
		
		driver.switchTo().defaultContent(); //go back to page
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5); // passed frame as a webelement //switch to frame 1
		driver.findElement(By.name("mytext5")).sendKeys("Seleniumiframe");

		driver.findElement(By.linkText("https://a9t9.com")).click();
		WebElement img=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']"));
		System.out.println(img.isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}

}
