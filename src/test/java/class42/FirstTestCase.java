package class42;

import org.testng.annotations.Test;

/*
 *1) Open app
 *2)Login
 *3)Logout
 *
 */
public class FirstTestCase {
	
	
	@Test
	void openapp()
	{
		System.out.println("Opening application...");
	}
	
	@Test
	void login()
	{
		System.out.println("Login to application...");
	}
	
	@Test
	void logout()
	{
		System.out.println("Logout to application...");
	}

}
