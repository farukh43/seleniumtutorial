package class43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	//@Test
	void testHardassertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		Assert.assertEquals(1, 2);// hard assertion
		//after this the below code will not be executed
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
	}
	
	
	@Test
	void testsoftassertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(1, 2); // soft assert
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		sa.assertAll();//mandotory-- otherwise it will pass
		/*
		  Testing.....
		Testing.....
		Testing.....
		Testing.....
		PASSED: testsoftassertion //sa.assertAll(); if not use we will get pass
		 */
	}
}
