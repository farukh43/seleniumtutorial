package class47;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//using PageFactory

public class LoginPage2 {
	WebDriver driver;
	
	// constructor
	LoginPage2(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(name="username")
	WebElement txt_username_loc;
	
	@FindBy(name="password")
	WebElement txt_password_loc;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login_loc;
	
	@FindBy(tagName = "a")
	List<WebElement> allLinks;
	
	//there is another way to defind the webElements in page Factory Methods
	@FindBy(how =How.NAME, using="username")
	WebElement btn_username_loc1;
	
	@FindBy(how =How.XPATH, using="//button[normalize-space()='Login']")
	WebElement btn_login_loc1;
	
	@FindBy(how = How.TAG_NAME, using="a")
	List<WebElement> allLinks1;
	
	/* without using page factory methods
	By txt_username_loc =By.name("username");
	By txt_password_loc =By.name("password");
	By btn_login_loc =By.xpath("//button[normalize-space()='Login']");
	*/

	// Action methods
	public void setUserName(String user)
	{
	txt_username_loc.sendKeys(user);
	
	}
	
	public void setPassword(String pwd)
	{
		txt_password_loc.sendKeys(pwd);
	
	}
	
	public void clickLogin()
	{
	btn_login_loc.click();
	
	}
	

}
