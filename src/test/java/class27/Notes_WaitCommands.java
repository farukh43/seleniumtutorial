package class27;

public class Notes_WaitCommands {
	/*
	*
	wait commands
	-------------------
	
	Synchronization
	
	Thread.sleep()
	
	1) implicit wait
	2) explicit wait/fluent wait
	
	NoSuchElementException - Element is not present on the page. Synchronization.
	ElementNotFoundException - Locator is in-correct

	***sleep()***
	---------
	Adv:
	-----
	1) easy to use
	
	DisAdv:
	---------
	1) If the time is not sufficient, you will get an exception.
	2) It will wait for the maximum timeout. This will reduce the performance of the script.
	3) Multiple times.
	
	***implicit wait***
	--------------------
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Adv:
	1) single time/one statement
	2) it will not wait till maximum time if the element is available
	3) Applicable for all the elements
	4) easy to use
	
	Disadvantage:
	1) if the time is not sufficient then you will get an exception

	***explicit wait***
	--------------------
	declaration 
	use
	
	points
	---------
	1) Conditional based, it will work more effectively.
	2) finding element is inclusive (for some conditions)
	3) it will wait for condition to be true, then consider the time
	4) we need to write multiple statements for multiple elements

	
	conditions
	---------
	alertIsPresent()
	elementSelectionStateToBe()
	elementToBeClickable()
	elementToBeSelected()
	frameToBeAvaliableAndSwitchToIt()
	invisibilityOfTheElementLocated()
	invisibilityOfElementWithText()
	presenceOfAllElementsLocatedBy()
	presenceOfElementLocated()
	textToBePresentInElement()
	textToBePresentInElementLocated()
	alertIsPresent()
	elementSelectionStateToBe()
	elementToBeClickable()
	elementToBeSelected()
	frameToBeAvaliableAndSwitchToIt()
	invisibilityOfTheElementLocated()
	invisibilityOfElementWithText()
	presenceOfAllElementsLocatedBy()
	presenceOfElementLocated()
	textToBePresentInElement()
	textToBePresentInElementLocated()
	titlets()
	titleContains()
	visibilityOf()
	visibilityOfAllElements()
	visibilityOfAllElementsLocatedBy()
	visibilityOfElementsLocated()
	
	***explicit wait***
	--------------------
	Declaration
	-------------------
 	// Waiting 30 seconds for an element to be present on the page, checking
 	// for its presence once every 5 seconds.
   	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(30L))
       .pollingEvery(Duration.ofSeconds(5L))
       .ignoring(NoSuchElementException.class);

   implimentation
   ----------------
   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.id("foo"));
     }
   });


	
	 */

}
