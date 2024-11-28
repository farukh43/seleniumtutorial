package class24;

public class Notes_Xpath {
	
	/*
	 * Day-24
	---------
	XPath
	----
	XPath is an address of the element.
	
	DOM - Document Object Model
	
	2 types of xpath
	-----------
	1) Absolute xpath (full xpath)
	   Ex: /html/body/header/div/div/div[2]/div/input
	
	2) Relative xpath (partial xpath)
	   Ex: //*[@id="search"]/input
	   
	   Which xpath will be preferred?
		Relative xpath.
		
		Difference between Absolute & Relative xpaths?
		-------------------
		1) Absolute xpath starts with /     ---› represents root node
		   Relative xpath starts with //
		
		2) Absolute xpath do not use attributes
		   Relative xpath works with attributes
		   
		3) Absolute xpath traverse through each node till it finds element
   		   Relative xpath directly jump and find the element by using attribute

		Relative xpath
		----------------
		1) Automatically - Devtools, selectorshub
		2) Manually(own xpath)
		
		    //img[@title='Your Store']
		    /html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]
		
		syntax:
		----
		//tagname[@attribute='value']
        //*[@attribute='value']
		
	   //img[@title='MacBook']
	    
		 Xpath with single attribute
		----------------------------
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
		Xpath with multiple attributes
		-----------------------------------
		//input[@name='search'][@placeholder='Search']
		 
		 Xpath with 'and' 'or' operators
		------------------------------
		//input[@name='search' and @placeholder='Search']
		//input[@name='search' or @placeholder='Search']

		xpath with inner text - text()
		--------------------------------------
		//a[text()='Desktops']
		//a[text()='MacBook']
		
		<a href="https://xyz.com"> Click Me </a>
		
		linktext = yes  
		inner text = yes  
		
		<div>welcome</div>  
		linktext= no  
		innertext= yes  
------------------------------------------------------------

xpath with contains()
//input[contains(@placeholder, 'Sea')]

handling dynamic attributes
//*[@id='start' or @id='stop']
//*[@id[contains(., 'st')]]
//*[@id[starts-with(., 'st')]]


name=xyz001 xyz002 xyz003 xyz004 xyz001 xyz002
//*[@name[contains(., 'xyz')]]
//*[@name[contains(., '00')]]
//*[@name[starts-with(., 'xyz')]]


name= 1xyz 2xyz 3xyz 4xyz 1xyz
//*[@contains(@name, 'xyz')]


name=101xyz 201xyz 301xyz 401xyz
//*[@contains(@name, 'xyz')]
//*[@contains(@name, '01')]
 
---------------------------------------------------------------
chained xpath
//div[@id='logo']/a/img

----------------------------------------------------------------

<div></div>

//div[contains(text(), '')]
//*[contains(., ' ')]


-----------------------------------------
		study more about normalize-space() method in xpath
		//p[normalize-space()='Shadow']

	 */
}
