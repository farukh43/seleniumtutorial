package class45;

public class Notes_TestNGParameterization {
/*
 * Paramterization
 * ------------------
 * 1) @DataProvider -- data driven testing
 * what is the data type of @DataProvider  --> It will return two dimwntional array [][] - it may be any type String or Object
	if we want to execute specific test data then we can indices{0,3,4} it will execute --> 1 , 4th and 4th test data 
	indices - will not take range, we need to mention specific test data index
	index will start from 0
	dataprovider name should be unique for each method name
 * 
 * 2)using xml file -- parallel testing
 * -----------------------------------
 *   <!-- here we are parameterizong the values of browser-->
 <!-- We need to explicitly define the @Parameter() tag in ParamTestDemo. class-->
  <parameter name="browser" value="chrome"></parameter>
    <classes>
      <class name="class45.ParamTestDemo"/>
    </classes>
    
    parallel testing using xml file
	--------------------------------
	step 1) created test case
	step 2) create xml file then run test case through xml
	step 3) passed browser name, url as parameters from xml file to setup() method
	step 4) execute test case on chrome, firefox & Edge (serial execution)
	step 5) execute test case on chrome, firefox & edge (parallel execution)

    
    
    
    
    
 *  
 */
}
