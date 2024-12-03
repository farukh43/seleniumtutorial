package class43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* TC1
* -----
* 1)Login -->@BeforeMethod
* 2)Search -->@Test
* 3)Logout -->@AfterMethod
* 4)Login-->
* 5)adv search--->@Test
* 6)Logout --->
*/
public class AnnotationsDemo {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login...");
	}
	@AfterMethod
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
