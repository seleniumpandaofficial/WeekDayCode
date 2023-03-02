package testng_automation_code_mar_1st_2023;

import org.testng.annotations.Test;

public class ParallelConcepts {
	
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void testCase1() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void testCase2() {
		System.out.println(Thread.currentThread().getId());
	}
	
	
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void testCase3() {
		System.out.println(Thread.currentThread().getId());
	}
	
	
	@Test(invocationCount = 4, threadPoolSize = 3)
	public void testCase4() {
		System.out.println(Thread.currentThread().getId());
	}

}
