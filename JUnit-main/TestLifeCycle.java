package testCases;


import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycle {

	@BeforeEach
	void beforeEachTest()
	{
		System.out.println("Before Each Test");
	}
	
	@AfterEach
	void afterEachTest()
	{
		System.out.println("After Each Test");
	}
	
	@BeforeAll
	void beforeAllTest()
	{
		System.out.println("Before All Test");
	}
	
	@AfterAll
	void afterAllTest()
	{
		System.out.println("After All Test");
	}
	
	@Test
	void testMethod1()
	{
		System.out.println(" Test method 1");
	}
	
	@Test
	void testMethod2()
	{
		System.out.println("Test Method 2");
	}
}
