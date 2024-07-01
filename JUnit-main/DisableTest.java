package testCases;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

@Disabled
public class DisableTest {

	
	@Test
	void test1() 
	{
		System.out.println("Test 1");
	}
	
	@Disabled
	@Test
	void test2() 
	{
		System.out.println("Test 2");
	}
	
	@Test
	void test3() 
	{
		System.out.println("Test 3");
	}
	
}