package class42;

public class Notes_TestNG {
/*
 * Day-42
	---------------------------
	TestNG -Test New Generation
	
	java based unit testing tool.
	
	Advantages:
	----------------------------
	1) Test cases & test suites
	2) Grouping of test cases.
	3) Prioritize
	4) Parameterization
	5) parallel testing
	6) Reports

	TestNG configuration
	-------------------
	1)Install plug of TestNG from Ecllipse MArket Place
	2) Add TestNG library to project(build Path)
	3) Add TestNG Dependency in POM xml- will be helpfull in CI CD run --> to avoid run time errors
 
  @Test Annotations
  //By default TestNG will execute the Test method in alphabetical order
   ex - PASSED: login
		PASSED: logout
		PASSED: openapp
		
		This is a issues , that why we will use priority
 
	 1) TestNG execute test methods based on alphabetical order.
	2) @Test(priority=num) controls the order of execution.
	3) Once you provide priority to the test methods, then order of methods is not considered.
	4) Priorities can be random numbers (no need to have consecutive numbers).
	5) If you don't provide priority, then the default value is Zero (0).
	6) If the priorities are same, then it again executes methods in alphabetical order.
	7) Negative values are allowed in priority.(-2 -1 0 1 2)
	8) TestNG executes test methods only if they are having @Test annotation.
	
	execute test cases using testng xml file
	
	test xml file
	------
	1) generate automatically
	2) manually
	
	Test suite ---> test cases ---> test steps(Manual Steps)
	xml file ---> classes ---> Test methods(testNG Hiecharcy)

	2 things achieved through xml
	-------
	1) Execute a group of test cases as a single suite
	2) Generate TestNG reports (default)

 */
}
