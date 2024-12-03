package class44;

import org.testng.annotations.Test;

public class Notes_TestNG {
	/*
	Dependency methods
	
	ex - 
	openapp --failed
	login
	search
	advsearch
	logout
	
	even the openapp is failed the rest of methods will be executed
	to overcum this problem we can use dependency methods
	if the browser is not opened then it is useless
	
	@Test(priority = int number,dependsOnMethods= {"Method name1", "method name2,..."})
	dependendsOnMethods are available oly for @Test Annonation Only
	
	
	Grouping
	------------------
	Class1 - m1,m2,m3...
	Class2 - m4,m5,m6....
	Class3 - m7,m8,m9....
	
	---------
	sanity
	regression
	functional 
	productionSanity
	
	example - LoginTest, PaymentTest and SignUpTest
	
	loginByfacebook - sanity
	loginby email - sanity
	login by twitter - sanity
	
	signupbyfacebook - regression
	signupbytwitter - regression
	signupbyemail - regression
	
	paymentinrupees - sanity, regression (functional)
	paymentindollars - sanity, regression (functional)

	scenarios
	-------------
	1) all sanity tests
	
	<groups>
			<run>
				<include name="sanity">
				</include>
			</run>
		</groups>
		
	2) all regression tests
	<groups>
			<run>
				<include name="regression">
				</include>
			</run>
		</groups>
		
	3) all sanity but not regression
	<groups>
			<run>
				<include name="sanity">
					<exclude name="regression"> <!--Here we are including the sanity but excluding the Regression-->
					</exclude>
				</include>
			</run>
		</groups>
	4) all regression but not sanity
	<groups>
			<run>
				<include name="regression">
					<exclude name="sanity"> <!--Here we are including the sanity but excluding the Regression-->
					</exclude>
				</include>
			</run>
		</groups>
	
	5) all methods which are belongs to both sanity & regression
	//if the test case is both sanity and regression the we will give the tag as function we can execute the same
	 
	 
	 <groups>
			<run>
				<include name="functional">
				</include>
			</run>
		</groups> 
	
	6) Run all the test cases but exclude onlt the functional test cases
	<groups>
			<run>
					<exclude name="sanity"> <!--Here we are including the sanity but excluding the Regression-->
					</exclude>
			</run>
		</groups>
		
---------------------------------------------------------------------------------
	@Test can be parameterized with 
	priority
	dependsOnMethods
	groups
	etc

*/

	
}
