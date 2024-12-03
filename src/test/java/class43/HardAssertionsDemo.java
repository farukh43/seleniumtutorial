package class43;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz","xyz1");// false
		//Assert.assertEquals(123,345);// false
		//Assert.assertEquals("abc",345);// false
		//Assert.assertEquals("123",123);// false
	
		//Assert.assertNotEquals(123, 123);//false
		//Assert.assertNotEquals(123, 345);//true
		
		//Assert.assertTrue(true);//pass
		//Assert.assertTrue(false);//false
		
		//Assert.assertTrue(1==2);//false
		//Assert.assertTrue(1==1);//true
		
		//Assert.assertFalse(1==2);//true
		//Assert.assertFalse(1==2);//false
		
		Assert.fail();
		
		
		
	}
}
