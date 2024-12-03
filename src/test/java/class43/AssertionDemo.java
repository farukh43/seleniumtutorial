package class43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testTittle()
	{
		String exp_tittle="Opencart";
		String act_tittle="Openshop";
		/*
		if(exp_tittle.equals(act_tittle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		*/
		
		//test failed
		//PASSED: testTittle
		//Test failed but testNG is showing as passed

		//Approach 1 - preffered
		Assert.assertEquals(exp_tittle, act_tittle);
	
		//Approach 2 - preffered
		if(exp_tittle.equals(act_tittle))
		{
			System.out.println("test passed");
		Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}
	
}
