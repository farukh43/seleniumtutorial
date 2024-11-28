package class38;

public class Notes_screenshots {

	/*
	 *ScreenShot
	 *------------------
	 *Selenium 4 onwards we can take the screenshot of specific element
	 *To take the screenshot of the webElement is taken from the WebElement Interface Not from TakesScreenshot interface
	 *Till Selenium 3 we can take screenshot of the page only
	 How to capture screenshot
	 --------------------------
	 1) Full Page --> from TakesScreenshot Interface
	 2) Specific area of the page  --> from WebElement Interface
	 3) Welelement --> from WebElement Interface
	 
	 *ChromeOptions
	 *EdgeOptions
	 *FirefoxOptions
	 *etc
	 *which ever browser we are working we can take based on these
	 *
	 *ChromeOptions (it is a class)
	-----------------------
	1) Headless testing
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless=new");
	
	advantages
	-----
	1) we can do multiple tasks( since execution happend backend)
	2) faster execution
	
	disadvantage
	-----------
	1) user cannot see the actions on the page. so he cannot understand flow/functionality of the test.

	 *SSL Handling****
	 *----------------------
	 *ChromeOptions options = new ChromeOptions();
	 *options.setAcceptInsecureCerts(true);//Accepts SSl certificates
	 *
	 *---------------------------------
	 *Chrome is being controlled by automated test software
	 *-----------------------------------------------------
	 *to remove the above line
	 
	 ChromeOptions options = new ChromeOptions();
	 options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
	 WebDriver driver= new ChromeDriver(options);
	 -----------------------------------------------------
	 Executing test cases incognito mode
	 ------------------------------------------------------
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--incognito");
	 WebDriver driver= new ChromeDriver(options);
	 
	 -----------------------------------------------
	 enabling exetensions at run time or browser
	 -----------------------------------------------
	Step 1: Add CRX Extractor/Downloader to Chrome Browser (manually)
	Step 2: Add SelectorsHub plugin to Chrome browser (manually)
	Step 3: Capture CRX file for SelectorsHub extension
	Step 4: Pass CRX file path in automation script in Chrome Options

 	-----------------------------------------------
	 enable browser extension in run time or browser
	-----------------------------------------------
	ChromeOptions options = new ChromeOptions();
	File file = new File("C:\\Learnings\\SeleniumTutorials\\extensionscrx\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
	options.addExtensions(file);
		
	 
	 
	 
	 */
}
