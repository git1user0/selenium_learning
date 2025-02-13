package testng_cases;

import org.testng.annotations.Test;

public class Example_test {
	@Test(priority = 1)
	public void testcase() {
		System.out.println("test case 1");
	}
	@Test(priority = 3)
	public void testcase2() {
		System.out.println("test case 2");
	}
	@Test(priority = 0)  // the test case methods have the same priority
	// then the test execution will happen according to the alpha numeric name of the methods
	public void testcase3() {
		System.out.println("test case 3");
	}
	@Test
	public void testcas() {
		System.out.println("test case 4");
	}

}
