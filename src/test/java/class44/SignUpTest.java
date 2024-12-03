package class44;

import org.testng.annotations.Test;

public class SignUpTest {

	
	@Test(priority=1,groups= {"regression"})
	void signUpByEmail() {
		System.out.println("This is Sign up by Email...");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signUpByFacebook() {
		System.out.println("This is Sign up by facebook...");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signUpByX() {
		System.out.println("This is Sign up by X...");
	}

}
