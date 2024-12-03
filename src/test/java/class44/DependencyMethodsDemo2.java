package class44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethodsDemo2 {

	// solution for the problem
	
	@Test(priority = 1)
	void openapp() {
		//Assert.assertTrue(false);
		Assert.assertTrue(true);
	}

	@Test(priority = 2,dependsOnMethods= {"openapp"})
	void login() {
		//Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

	@Test(priority = 3,dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
		
	}

	@Test(priority = 4,dependsOnMethods= {"login","search"})
	void advsearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 5,dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}

}
