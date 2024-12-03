package class46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//if we want to integrate the Listner class other way if we want to run without the testng.xml file then we need to add one below tag
// run from .xml file is preferred  from the @Listeners(class46.MyListener.class) is not preferred
// because of we have 100 class, it is difficult  and for the entire project we will have oly one listner class
//commenting for now to avoid confusion
//@Listeners(class46.MyListener.class)

public class OrangeHRM {
	WebDriver driver;

	@BeforeClass()
	void setup() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void testAppURL() {
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 3, dependsOnMethods ={"testAppURL"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}


	@AfterClass
	void tearDown() throws Exception {

		driver.quit();
	}

}
