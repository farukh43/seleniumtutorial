package class43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsInOneClass1 {

	@BeforeSuite
	void bs()
	{
		System.out.println("This is Before Suite...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is After Suite..");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test method....");
	}

	
	@AfterTest
	void at()
	{
		System.out.println("This is After test method....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is Before class method....");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is After class method....");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is Before method....");
	}
	@AfterMethod
	void am()
	{
		System.out.println("This is After method....");
	}
	@Test(priority = 1)
	void tm1()
	{
		System.out.println("This is Test method1....");
	}
	@Test(priority = 2)
	void tm2()
	{
		System.out.println("This is Test method2....");
	}
}
