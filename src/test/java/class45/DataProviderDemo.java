package class45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="loginData")
	void testLogin(String email, String pswd) throws InterruptedException
	{
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pswd);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    Thread.sleep(2000);
	    boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	    if(status==true)
	    {
	        driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
	        Assert.assertTrue(true);
	    }
	    else
	    {
	        Assert.fail();
	    }
	}

	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	//what is the data type of @DataProvider  --> It will return two dimwntional array [][] - it may be any type String or Object
	//if we want to execute specific test data then we can indices{0,3,4} it will execute --> 1 , 4th and 4th test data 
	//indices - will not take range, we need to mention specific test data index
	//index will start from 0
	// dataprovider name should be unique for each method name
	@DataProvider(name="loginData",indices= {0,3,4})
	Object[][] loginData()
	{
		Object data [][]= {
				{"abc@gmail.com","test123"},
				{"xyz@gmail.com","test0123"},
				{"john@gmail.com","test@123"},
				{"lena@gmail.com","test123"},
				{"nomail@no.com","Test@123"}
						};
		return data;
	}

}
