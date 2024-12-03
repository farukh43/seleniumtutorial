package class43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*TC2
* -----
* 1)Login -->@BeforeClass
* 2)Search -->@Test
* 3)adv search--->@Test
* ..
* ..n number of methods
* 4)Logout --->@AfterClass
*/

public class AnnotationsDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search...");
	}
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("This is advance search...");
	}
	
}
