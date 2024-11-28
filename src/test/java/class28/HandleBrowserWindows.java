package class28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	Set<String> windowhandel = driver.getWindowHandles();
	
	/*
	//approach 1
	List<String> windolist = new ArrayList(windowhandel);
	
	String parentID =  windolist.get(0);
	String chileID =  windolist.get(1);
	
	System.out.println(driver.getTitle());
	
	//switch to child window
	driver.switchTo().window(chileID);
	System.out.println(driver.getTitle());

	
	//switch to parent window
	driver.switchTo().window(parentID);
	System.out.println(driver.getTitle());
	*/
	
	//Approach 2
	for(String winId:windowhandel)
	{
		String title=driver.switchTo().window(winId).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
			//some validation on the parent window
		}
		else if (title.equals("Human Resources Management Software | OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
			//some validation on the parent window	
		}
		
	}
	driver.quit();
	
	
	}

}
