package class47;

public class Notes_PageObjectModel {
	
	/*
	 Page Object Model --> It is a design pattern
	 --------------------------------
	 Test Case
	 ----------
	 without page object medel --|
	 1) Page Locators -->test methods ---- code--- validation + actions
	 
	 disadv
	 ------
	 1) duplication of elements/ locators
	 2) updation of elements/ locators
	 
	 Inpage obect model
	 --------------------
	 Page Locators -->test methods --> separate
	 code--- validation + actions --> separate
	 
	 // google the page object model - diagram
	  
	  There are 2 popular approaches to create page object classes
	  1) Without using PageFactory
	  2) Using PageFactory
	  
	  WebElement usertxt =driver.findElements(By.xpath(//input[@placeholder='Username']));
	  
	  The above can be written as below
	  -----------------------------------
	  By loc=By.xpath("//input[@placeholder='Username']");
	  driver.findElement(loc).sendKeys("Test");
	  
	  
	  
	  
	  
	  
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

}
