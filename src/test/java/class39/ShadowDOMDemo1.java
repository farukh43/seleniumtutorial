package class39;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement search = (WebElement)js.executeScript("return document.querySelector('body > downloads-manager').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
		
		String value ="arguments[0].setAttribute('value','farukh')";
	((JavascriptExecutor)driver).executeScript(value, search);
	
	//If youare applications are full of showdow roots prefer any tool for automation not selenium
	}

}
