package class43.subpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void abd()
	{
		System.out.println("this is abc from C1");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("this is BeforeTest Method :: Class Level");
		
	}

}
