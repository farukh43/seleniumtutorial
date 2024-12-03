package class46;

public class Notes_TestNGListners {
	/*
	 TestNG Listners
	 --------------------
	 post actions can be acheived using TestNG Listners
	 ex- Pass, fail and skip ( update the result in report)
	 
	 iTestListners is a predefined in TestNG
	 iTestListners is interface - OnTestPass, OnTestFail and OnTestSkip
	 
	 1) create test case
	 2) create listner class
	 3) create xml file and include both test case & listner class
	 
	 
	 2 ways to implement listner class
	 ITestlistener --> Is interface
	 TestlistenerAdapter---> is class
	 
	 ITestlistener is interface is implemented by TestlistenerAdapter class
	 
	 
	 method 1
	 ---------
	 class myListner implements ITestlistener
	 {
	 we can implement this class as per our requirement
	This method is Recommanded
	 }
	 
	 method 2
	 ---------
	 class myListner extends TestlistenerAdapter
	 {
	 we can use already use the implemented methods
	 // Not more popular
	 }
	 
	 How we can run the listene classes
	 -----------------------------------
	//if we want to integrate the Listner class other way if we want to run without the testng.xml file then we need to add one below tag
	// run from .xml file is preferred  from the @Listeners(class46.MyListener.class) is not preferred
	// because of we have 100 class, it is difficult  and for the entire project we will have oly one listner class
	 
	Extent Report
	----------------
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 */

}
