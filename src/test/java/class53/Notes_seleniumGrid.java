package class53;

public class Notes_seleniumGrid {

	/*
	 WORK ON FIXING THE ISSUE - parallel fixing
	 
	 
	 Standalone Setup (Single machine):
	1.	Download selenium-server-4.27.0.jar and place it somewhere.
	2.	Run below command to start Selenium Grid
		java -jar selenium-server-4.27.0.jar standalone
	3.	URL to see sessions: http://localhost:4444/
		Ex- my http://192.168.1.18:4444 
	
	Hub & Node Setup (Multiple machines):
	1.	Download selenium-server-4.27.0.jar and place it somewhere in both (hub & node) the machines.
	2.	Run below command to make machine as hub
		java -jar selenium-server-4.27.0.jar hub
	3.	Run below command to make machine as node
		java -jar selenium-server-4.27.0.jar node --hub http://<hub-ip>:4444
	4.	URL to see sessions: http://localhost:4444/
	
	
	
	public class SeleniumGrid {
	    public static void main(String args[]) throws MalformedURLException, InterruptedException {
	        // The URL will be IP Address of Hub Machine + Hub Port + /wd/hub
	        //http://192.168.13.1:4444/wd/hub or http://localhost:4444/wd/hub
	        String huburl = "http://localhost:4444/wd/hub";
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setPlatform(Platform.WIN11); //cap.setPlatform(Platform.MAC);
	        cap.setBrowserName("chrome"); //cap.setBrowserName("MicrosoftEdge")
	        WebDriver driver = new RemoteWebDriver(new URL(huburl), cap);
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());
	        driver.quit();
	    }
	}
	 
	 
	 */
}
