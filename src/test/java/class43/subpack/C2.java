package class43.subpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void abd()
	{
		System.out.println("this is abc from C2");
	}
	@AfterTest
	void at()
	{
		System.out.println("this is AfterTest Method :: Class Level");
		
	}
	//afteTest and Before test can be available in any class

}
