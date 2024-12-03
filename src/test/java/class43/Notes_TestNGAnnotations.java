package class43;

public class Notes_TestNGAnnotations {
	/*
	 * Annotations
	 * -------------
	 * @Test
	 * 
	 * @BeforeMethod
	 * @AfterMethod
	 * 
	 * @BeforeClass
	 * @AfterClass
	 * 
	 * @BeforeTest
	 * @AfterTest
	 * 
	 * @BeforeSuite
	 * @AfterSuite
	 * 
	 * TC1
	 * -----
	 * 1)Login -->@BeforeMethod
	 * 2)Search -->@Test
	 * 3)Logout -->@AfterMethod
	 * 4)Login-->@BeforeMethod
	 * 5)adv search--->@Test
	 * 6)Logout --->@AfterMethod
	 * 
	 * 
	 * TC2
	 * -----
	 * 1)Login -->@BeforeClass
	 * 2)Search -->@Test
	 * 3)adv search--->@Test
	 * ..
	 * ..n number of methods
	 * 4)Logout --->@AfterClass
	 * 
	 * BeforeMethod,AfterMethod,BeforeClass and AfterClass are class level 
	 * 
	 @BeforeTest,@AfterTest, @BeforeSuite and @AfterSuite are suite level or we can say xml level
	 * 
	  
	<!-- The below code will execute the before test and aftertest only once -->
 <!--becoz it ishaving only one class in the test  -->
  <test thread-count="5" name="Test3">
    <classes>
      <class name="class43.subpack.C1"/>
    </classes>
  </test> <!-- Test -->
  <test thread-count="5" name="Test4">
    <classes>
      <class name="class43.subpack.C2"/>
    </classes>
  </test> <!-- Test -->
 
 Assertion - Validation Point
 ------------------------
 2 Kinds of Assertions
 ---------------------
 1) Hard Assertions
 2) Soft Assertions
 
 Hard assertions
----
we can access from "Assert" class
methods are static
* if hard assertion failed then rest of the statements will not be executed.

software assertion
------
we can access though "SoftAssert" object

SoftAssert sa=new SoftAssert();
sa.assertTrue()

if soft assertion got failed then rest of the statements still execute.

	 
	 */

}
