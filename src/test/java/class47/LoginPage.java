package class47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without using PageFactory
public class LoginPage {
	WebDriver driver;
	
	// constructor
	LoginPage(WebDriver driver)

	{
		this.driver=driver;
	}
	
	// Locators
	By txt_username_loc =By.name("username");
	By txt_password_loc =By.name("password");
	By btn_login_loc =By.xpath("//button[normalize-space()='Login']");
	
	

	// Action methods
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	
	}
	

}
