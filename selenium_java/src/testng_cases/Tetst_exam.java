package testng_cases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tetst_exam {
	
	@BeforeClass
	public void login() {
		System.out.println("logged in");
	}
	@BeforeMethod
	public void search() {
		System.out.println("url");
	}
	@Test  // the test case methods have the same priority
	// then the test execution will happen according to the alpha numeric name of the methods
	public void advance_search() {
		System.out.println("search");
	}
	@AfterTest
	public void logout() {
		System.out.println("close app");
	}

}
