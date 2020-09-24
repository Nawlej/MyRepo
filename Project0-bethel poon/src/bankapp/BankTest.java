package bankapp;


import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class BankTest{
	
	Driver test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		test = new Driver();
	}

	@After
	public void tearDown() throws Exception {
	}

	//tests if the application works as intended
	
	//test if Greet() returns an int of 1,2, or 3 which serves as the personID of Admin, Employee, or Customer
	@Test
	public void testgetPersonID() {
		//int a = test.getPersonID();
		//assertTrue("Greet() output is too large", a <=3);
		//assertTrue("Greet() output is too low", a <=1);
		//System.out.println("Output is within [1:3]");
	}

	public void testCustonerOptions() {
		Customer.options();
	}
	
	//test if user inputs a name for account name
	
	//test if user inputs an amount to deposit, withdraw, transfer and set handling for when cash = 0 and 
	//user attempts to act
	

}
