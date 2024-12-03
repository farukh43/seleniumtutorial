package class43.subpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void abd()
	{
		System.out.println("this is abc from C3");
	}
	@AfterSuite
	void as()
	{
		System.out.println("this is AfterSuite:: Suite Level");
		
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is BeforeSuite:: Suite Level");
		
	}
	//afteSuite and BeforeSuite can be available in any class
	//order is not applicable


}
