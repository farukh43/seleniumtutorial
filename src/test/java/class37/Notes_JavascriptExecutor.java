package class37;

public class Notes_JavascriptExecutor {

	/*
	 * JavascriptExecutor 
	 * -------------------
	 * JavascriptExecutor --> interface
	 * executrScript() - we can execute javascript statement
	 * ElementNotInteractable Exception? - when we get this we will use java script executor
	 * Mostly we will get this when we are doing action - click() and SendKeys() -radio button, submit button 
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * typecasting the driver 
	 * js.executeScript("arguments[0].click()", gender_loc);
	 * gender_loc locator will be assigned to arguments[0] and the click operation will be performed
	 * 
	 * js.executeScript("arguments[0].setAttribute('value','John')", firstName_loc);
	 * firstName_loc locator will be assigned to arguments[0] and the first name value will be filled with the value as 'John'
	 * 
	 * 
	 * uses
	 * ------
	 * to fill/enter the input boxes alternate to sendKeys()
	 * to click the radiobutton/buttons alternate to click()
	 * to scroll the window - scroll bar is browser thing we cannot inspect it
	 * 
	 * Scrolling bar
	 * ----------
	 * 
	 */
}
