package class39;

public class Notes {

	public static void main(String[] args) {
		/*
		 Broken Link
		 -----------
		 1) Link --> href="https://xyz.com"
		 2) https://xyz.com--->server---> status code
		 3) status code>= 400 --->  broken link
		 	status code <400  --->  Not a broken Link 
		 
		 
		 
		 Shadow DOM
		 ---------------------------------
		 If the element located inside the shadow DOM we CANNOT locate using Xpath
		 We can access only Through CSS selector
		 Thread.sleep(1000) is mandptary in shadown doms
		 otherwise it will throw the exeception
		 
		// https://dev.automationtesting.in/shadow-dom --> used to demonstrate the below link 
	    1) This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element"));
		
		2)This Element is inside 2 nested shadow DOM.
	
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#nested-shadow-element"));
		
		3)This Element is inside 3 nested shadow DOM.
		 
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
		----------------------------------------------------------------------
		Svg Elements
		----------------------------------------------------------------
		By using name() only we can find the SVG type elements in webpage
		we can also use local-name() in combination with name() method to find the SVG element
		
		Ex1 - //*[name()='path' and contains(@d,'M437,268.1')]
		EX 2-  //a[@class='oxd-main-menu-item active toggle']//*[name()='svg']//*[local-name()='g' and contains(@d, 'M422')]//*[local-name()='path' and contains(@d, 'face')]
		 
		 
		 
		 */
		
	}

}
