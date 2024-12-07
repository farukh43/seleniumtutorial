package class47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//The test case will be same for both pageFactoty methods and Non page factory methods
public class LoginTest {
	WebDriver driver;
	

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void testLogin() {
		//withoutPage Factory
		//LoginPage lp = new LoginPage(driver);
		
	//Page Factory
	LoginPage2 lp = new LoginPage2(driver);		
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}
